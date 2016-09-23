Global class EmailToIdeaHandler implements Messaging.inboundEmailHandler {

    Global Messaging.InboundEmailResult handleInboundEmail(Messaging.InboundEmail email, Messaging.InboundEnvelope env) {
        Messaging.InboundEmailResult result = new Messaging.InboundEmailResult();
        //System.debug('__EMAILBinary__'+email.BinaryAttachments);
        //System.Debug('__EMAILAttach__'+email.textAttachments);
        createIdea(email, env.fromAddress);
        return result;
    }

    public static Idea[] createIdea(Messaging.InboundEmail email, String fromEmail) {
        try {
            user usr;
            try {
                usr = [select id, name, email from user where email = : fromEmail limit 1];
            } catch (exception ex) {
                sendEmailExp(fromEmail, 'User Missing error: You are not authorized to create an idea by email');
                return null;
            }

            // Validate Tags failed
            String IdeaTitle = email.subject;
            String plainTextBody = email.plainTextBody;
            String htmlBody = email.htmlBody;
            if (validateTags(plainTextBody, fromEmail) == 0) {
                return null;
            }

            // Parse content
            String ideatheme = parseContentfromTag('#ideatheme#', '#description#', plainTextBody);
            String description = parseContentfromTag('#description#', '#customers#', htmlBody);
            String customers = parseContentfromTag('#customers#', '#userpersona#', plainTextBody);
            String userpersona = parseContentfromTag('#userpersona#', '#urgency#', plainTextBody);
            String urgency = parseContentfromTag('#urgency#', '#problemstatement#', plainTextBody);
            String problemstatement = parseContentfromTag('#problemstatement#', '#solutionproposal#', plainTextBody);
            String solutionproposal = parseContentfromTag('#solutionproposal#', '#workarounds#', plainTextBody);
            String workarounds = parseContentfromTag('#workarounds#', '#End#', plainTextBody);


            // Fetch Customers List
            string relatedCustomers = '';
            List <Idea_Account__c> relatedAccIdeaRecs = new List <Idea_Account__c>();
            if (customers != null && customers != '') {
                Set < String > customerNames = new Set <String> ();
                for (String str1: customers.split(',')) {
                    customerNames.add(str1.trim());
                }
                system.debug(customerNames + 'customerNames --');
                if (!customerNames.isEmpty()) {
                    for (Account ac: [SELECT Id, Name FROM Account WHERE Name IN: customerNames]) {
                        system.debug(ac + 'acc--');
                        relatedCustomers += '<a href="/' + ac.Id + '">' + ac.Name + '</a>' + '<br/>';
                        Idea_Account__c junction = new Idea_Account__c();
                        junction.Account__c = ac.Id;
                        relatedAccIdeaRecs.add(junction);
                    }
                }
            }

            String COMMUNITYID = System.Label.EmaiToIdeaCommunityId;
            Idea dummyIdea = new Idea();
            dummyIdea.Body = description;
            dummyIdea.Title = IdeaTitle;
            dummyIdea.Categories = 'New';
            dummyIdea.Related_Accounts__c = relatedCustomers;
            dummyIdea.Idea_Theme__c = ideatheme;
            dummyIdea.Problem_Statement__c = problemstatement;
            dummyIdea.Solution_Proposal__c = solutionproposal;
            dummyIdea.Urgency__c = urgency;
            dummyIdea.User_persona__c = userpersona;
            dummyIdea.workarounds__c = workarounds;
            dummyIdea.Posted_by__c = '<a href="/ideas/ideaProfile.apexp?c=' + COMMUNITYID + '&u=' + usr.id + '">' + usr.Name + '</a>' + ' to New on ' + system.now();
            dummyIdea.communityid = COMMUNITYID;

            try {
                insert dummyIdea;
            } catch (Exception ex) {
                sendEmailExp(fromEmail, ex.getMessage());
                return null;
            }

            // Insert Related accounts in junction object
            for (Idea_Account__c related: relatedAccIdeaRecs) {
                related.Idea__c = dummyIdea.Id;
            }
            insert relatedAccIdeaRecs;

            // Insert custom to use as parent for Attachments
            if (email.binaryAttachments != null || email.textAttachments != null){
                IdeaAttachement__c ideaAttchment = new IdeaAttachement__c(idea__c = dummyIdea.id);
                insert ideaAttchment;
    
                string attmntLinks = '';
                string str;
                string strcontentID = '';
                string inlineAtchmnt;
                string attchntstr = '';
    
                Map <string, string> inlineAttachmentsMap = new Map <string, string>();
                String extraAttachmentsString = '';
    
                if (email.binaryAttachments != null) {
                    for (Messaging.InboundEmail.BinaryAttachment attachment1: email.binaryAttachments) {
                        str = attachment1.tostring();
                        
                        Attachment doc = new Attachment();
                        doc.Name = attachment1.fileName;
                        doc.ContentType = attachment1.mimeTypeSubType;
                        doc.Body = attachment1.body;
                        doc.ParentId = ideaAttchment.id;
                        insert doc;
    
                        if (!str.contains('name=Content-ID')) {
                            //extraAttachmentsString += str;
                            extraAttachmentsString += '<a href="/servlet/servlet.FileDownload?file=' + doc.id + '">' + doc.Name + '</a>' + '<br/>';
                        } else {
                            inlineAtchmnt = '/servlet/servlet.FileDownload?file=' + doc.id;
                            inlineAttachmentsMap.put(str, inlineAtchmnt);
                        }
                    }
                }
    
                if (email.textAttachments != null) {
                    for (Messaging.InboundEmail.TextAttachment attachment1: email.textAttachments) {                    
                        Attachment doc = new Attachment();
                        doc.Name = attachment1.fileName;
                        doc.ContentType = attachment1.mimeTypeSubType;
                        doc.Body = Blob.valueOf(attachment1.body);
                        doc.ParentId = ideaAttchment.id;
                        insert doc;
                        extraAttachmentsString += '<a href="/servlet/servlet.FileDownload?file=' + doc.id + '">' + doc.Name + '</a>' + '<br/>';
                    }
                }
                dummyIdea.Attaachments__c = extraAttachmentsString;
    
                list <String> splitStr2 = new list <String>();
                Map <String, String> tempMap = new Map <String, String>();
                for (string tmp: inlineAttachmentsMap.keyset()) {
                    List < String > splitStr = tmp.split('value=<');
                    for (String tmpStr: splitStr) {
                        if (tmpStr.contains('>]')) {
                            splitStr2.add(tmpStr.substring(0, tmpStr.indexOf('>]')));
                            tempMap.put(tmpStr.substring(0, tmpStr.indexOf('>]')), tmp);
                        }
                    }
                }
                String s2 = '';
                for (string tmp: splitStr2) {
                    if (splitStr2 != null && description.contains(tmp)) {
                        if (s2 == '') {
                            s2 = description.replaceFirst('cid:' + tmp, inlineAttachmentsMap.get(tempMap.get(tmp)));
                        } else {
                            s2 = s2.replaceFirst('cid:' + tmp, inlineAttachmentsMap.get(tempMap.get(tmp)));
                        }
                    }
                }
    
                if (s2 != null && s2 != '') {
                    dummyIdea.body = s2;
                }
                update dummyIdea;
            }
            sendEmail(fromEmail, new List<Idea> {dummyIdea});
            return null;

        } catch (Exception e) {
            system.debug(e.getCause()+'=='+e.getTypeName()+'==>'+e.getCause());
            if(e.getTypeName() != 'System.EmailException') {
                sendEmailExp(fromEmail, e.getMessage());
            }
            return null;
        }
    }

    public static void sendEmail(String s, List < Idea > myIdea) {
        // Send an email back to the from email address of who created the idea
        String[] toAddresses = new String[] {s};

        // new instance of a single email message
        Messaging.SingleEmailMessage mail = new Messaging.SingleEmailMessage();
        mail.setToAddresses(toAddresses);
        mail.setSenderDisplayName('Salesforce Ideas!');
        mail.setSubject('New Idea[' + myIdea[0].Id + '] created - ' + myIdea[0].Title);
        mail.setBccSender(false);
        mail.setUseSignature(false);
        mail.setPlainTextBody('Your Idea: ' + myIdea[0].Title + ' has been created \n Check out your new idea \n\n To watch you idea in salesforce.com click on this link \n https://ayub-ansari-dev-ed.my.salesforce.com/ideas/viewIdea.apexp?id=' + myIdea[0].Id);
        // Send the email
        Messaging.sendEmail(new Messaging.SingleEmailMessage[] {mail});
    }

    public static void sendEmailExp(String s, String Exp) {
    
        // Send an email back to the from email address of who created the idea
        String[] toAddresses = new String[] {s};
        // new instance of a single email message
        Messaging.SingleEmailMessage mail = new Messaging.SingleEmailMessage();
        mail.setToAddresses(toAddresses);
        mail.setReplyTo(label.ReplyToAddress);
        mail.setSenderDisplayName('Salesforce Ideas!');
        mail.setSubject('Exception - Cant create idea');
        mail.setBccSender(false);
        mail.setUseSignature(false);
        mail.setPlainTextBody('Following exception occured while system try to create your idea. PLease check.\n \n' + exp);
        System.Debug('ERROR_MESSAGE_' + Exp);
        // Send the email

        Messaging.sendEmail(new Messaging.SingleEmailMessage[] {mail});
    }

    public Static Integer validateTags(String plainTextBody, String fromAddress) {

        List <String> templateTags = new List <String> {'#ideatheme#', '#description#', '#customers#', '#userpersona#', '#urgency#', '#problemstatement#', '#solutionproposal#', '#workarounds#', '#End#'};
        Integer prevTagLoc = -2;
        String missingTagValidationMessage = 'Tags missing error:\n\n';
        String missingTagsOrderValidationMessage = 'Tags order is wrong error:\n\n';
        Boolean tagsMissing = false;
        Boolean wrongTagsOrder = false;
        
        for (String tag: templateTags) {
            if (!plainTextBody.contains(tag)) {
                missingTagValidationMessage += tag + '\n';
                tagsMissing = true;
            } else {
                if (prevTagLoc > plainTextBody.indexOf(tag)) {
                    wrongTagsOrder = true;
                }
                prevTagLoc = plainTextBody.indexOf(tag);
            }
        }

        if (tagsMissing && wrongTagsOrder) {
            sendEmailExp(fromAddress, missingTagValidationMessage + missingTagsOrderValidationMessage);
            return 0;
        } else if (tagsMissing) {
            sendEmailExp(fromAddress, missingTagValidationMessage);
            return 0;
        } else if (wrongTagsOrder) {
            sendEmailExp(fromAddress, missingTagsOrderValidationMessage);
            return 0;
        } else {
            return 1;
        }
    }

    public Static String parseContentfromTag(String startTag, String endTag, String plainTextBody) {
        integer Start = plainTextBody.indexOf(startTag);
        integer StartLoc = Start + startTag.length();
        integer EndLoc = plainTextBody.indexOf(endTag);
        String content = plainTextBody.substring(StartLoc, EndLoc);
        system.debug('content ' + content);
        return content;
    }

}
@istest
Global class EmailToIdeaTestClass {
    Public static testMethod void EmailToIdeaTestMethod() {


        String COMMUNITYID = System.Label.EmaiToIdeaCommunityId;
        Idea dummyIdea = new Idea();
        dummyIdea.Title = 'test';
        dummyIdea.Body = 'description';
        dummyIdea.communityid = COMMUNITYID;
        dummyIdea.categories= 'Agent';
        insert dummyIdea;
        
        IdeaAttachement__c ideaAttchment = new IdeaAttachement__c(idea__c = dummyIdea.id);
        insert ideaAttchment;
        
        Profile p = [SELECT Id FROM Profile WHERE Name='Standard User']; 
        User u = new User(Alias = 'standt', Email= label.fromAddress, 
            EmailEncodingKey='UTF-8', LastName='Testing', LanguageLocaleKey='en_US', 
            LocaleSidKey='en_US', ProfileId = p.Id, 
            TimeZoneSidKey='America/Los_Angeles', UserName='IdeaOwner@testorg.com');
        insert u;
        
        // Create a new email, envelope object and Attachment
        Messaging.InboundEmail email = new Messaging.InboundEmail();
        Messaging.InboundEnvelope env = new Messaging.InboundEnvelope();
        account acc = new account(name = 'test Acnt');
        insert acc;
        Idea_Account__c iacc = new Idea_Account__c(Account__c = acc.id, Idea__c = dummyIdea.Id);
        insert iacc;
        email.subject = 'Test';
        email.plainTextBody = '#ideatheme#Test#description#Test#customers#test Acnt#userpersona#Test#urgency#Test#problemstatement#Test#solutionproposal#Test#workarounds#Test#End#';
        email.HtmlBody = '#ideatheme#Test#description#Test#customers#test Acnt#userpersona#Test#urgency#Test#problemstatement#Test#solutionproposal#Test#workarounds#Test#End#';

        env.fromAddress = label.fromAddress;
        email.fromAddress = env.fromAddress; // Without this you will get a de-reference null object error

        // add an Binary attachment

        Messaging.InboundEmail.BinaryAttachment attachment = new Messaging.InboundEmail.BinaryAttachment();
        attachment.body = blob.valueOf('my attachment text');
        attachment.fileName = 'textfileone.txt';
        attachment.mimeTypeSubType = 'text/plain';
        email.binaryAttachments = new Messaging.inboundEmail.BinaryAttachment[] {
            attachment
        };

        // call the class and test it with the data in the testMethod
        EmailToIdeaHandler ideaTestObj = new EmailToIdeaHandler();
        ideaTestObj.handleInboundEmail(email, env);
        email.subject = '';
        ideaTestObj.handleInboundEmail(email, env);



        // Create a new email, envelope object and Attachment
        Messaging.InboundEmail email1 = new Messaging.InboundEmail();
        Messaging.InboundEnvelope env1 = new Messaging.InboundEnvelope();
        email1.subject = 'Test';
        email1.plainTextBody = '#description##ideatheme#TestTest#customers#test Acnt1#userpersona#Test#urgency#Test#problemstatement#Test#solutionproposal#Test#workarounds#Test#End#';
        email1.HtmlBody = '#ideatheme#Test#description#Test#customers#test Acnt#userpersona#Test#urgency#Test#problemstatement#Test#solutionproposal#Test#workarounds#Test#End#';

        env1.fromAddress = label.fromAddress;
        email1.fromAddress = env1.fromAddress; // Without this you will get a de-reference null object error
        // add an Text atatchment

        Messaging.InboundEmail.TextAttachment attachmenttext = new Messaging.InboundEmail.TextAttachment();
        attachmenttext.body = 'my attachment text';
        attachmenttext.fileName = 'textfiletwo.txt';
        attachmenttext.mimeTypeSubType = 'texttwo/plain';
        email1.textAttachments = new Messaging.inboundEmail.TextAttachment[] {
            attachmenttext
        };

        // call the class and test it with the data in the testMethod
        EmailToIdeaHandler ideaTestObj1 = new EmailToIdeaHandler();
        ideaTestObj1.handleInboundEmail(email1, env1);
        email.subject = '';
        ideaTestObj1.handleInboundEmail(email1, env1);


        Messaging.InboundEmail email2 = new Messaging.InboundEmail();
        Messaging.InboundEnvelope env2 = new Messaging.InboundEnvelope();
        email2.plainTextBody = '#ideatheme#Test#description#Test#customers#test Acnt#userpersona#Test#urgency#Test#problemstatement#Test#solutionproposal#Test#workarounds#Test#End#';
        email2.HtmlBody = '#ideatheme#Test#description#Test#customers#test Acnt#userpersona#Test#urgency#Test#problemstatement#Test#solutionproposal#Test#workarounds#Test#End#';

        env2.fromAddress = 'test@test.com';
        email2.fromAddress = env1.fromAddress; // Without this you will get a de-reference null object error 

        EmailToIdeaHandler ideaTestObj2 = new EmailToIdeaHandler();
        ideaTestObj2.handleInboundEmail(email2, env2);
        email2.subject = '';
        ideaTestObj2.handleInboundEmail(email2, env2);
        
        
        
        ApexPages.currentPage().getParameters().put('lc',dummyIdea.id);
        ApexPages.StandardSetController stdLead = new ApexPages.StandardSetController(new List<Idea_Account__c > { iacc });
        IdeaAccountRelatedListController idaAcc= new IdeaAccountRelatedListController();
        
        idaAcc.deleteThis = iacc.id;
        idaAcc.next();
        idaAcc.last();
        idaAcc.first();
        idaAcc.previous();
        idaAcc.getAccounts();
        idaAcc.getTotalRecords();
        idaAcc.getFromRec();
        idaAcc.getToRec();
        idaAcc.deleteRec();

    }
}
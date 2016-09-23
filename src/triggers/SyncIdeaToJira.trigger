trigger  SyncIdeaToJira on Idea (After Update) {
    
    List <idea> IdeatoBeSyncWithJira = new List <idea> ();
    list<id> SyncedIdeaUpdateList = new list<id>();
    String[] toAddresses = new String[]{};
    List <idea> ideawithAttcmnt = new List <idea> ();
    List <idea> ideawithOutAttcmnt = new List <idea> ();
    String[] ccAddresses = Label.ccAddress.split('#');
    Map<id,id> IdeatoCobjectMap = new Map<id,id>(); 
    Map<id,List<Attachment>> CobjectToAtcmntMap = new Map<id,List<Attachment>>();
    Map<id,List<Attachment>> IdeaToAtcmntMap = new Map<id,List<Attachment>>();
    String FromName = label.DisplayName;
    OrgWideEmailAddress owa = [select id, Address, DisplayName from OrgWideEmailAddress where DisplayName =:FromName limit 1];
    String toAddress;
    List<Messaging.SingleEmailMessage> emails = new List<Messaging.SingleEmailMessage>(); 
    
    for(idea temp : trigger.new){
        if(!(temp.Sync_To_Jira__c == False || (temp.Categories.contains('Venue') && temp.Categories.contains('CylanceV') && temp.Categories.contains('Agent')))){continue;}
        IdeatoBeSyncWithJira.add(temp);
        if(temp.Attaachments__c !=null && temp.Attaachments__c !=''){
            ideawithAttcmnt.add(temp);
        }
    }
    
    if(!ideawithAttcmnt.isEmpty()){
        for (IdeaAttachement__c IdeaAtmnt :[select id,Idea__r.id from IdeaAttachement__c where Idea__c IN : ideawithAttcmnt]){
            IdeatoCobjectMap.put(IdeaAtmnt.Idea__r.id,IdeaAtmnt.id);
        }
        
        
        for(Attachment Attach : [select Name, Body, ParentId, BodyLength from Attachment where ParentId IN :IdeatoCobjectMap.values()]){
            if (CobjectToAtcmntMap.containsKey(Attach.ParentId)) {
                CobjectToAtcmntMap.get(Attach.ParentId).add(Attach);                
            }else{
            CobjectToAtcmntMap.put(Attach.ParentId, new List<Attachment>{ Attach });
            }
        }       
        
        for(idea ida :ideawithAttcmnt){
            IdeaToAtcmntMap.put(ida.id,CobjectToAtcmntMap.get(IdeatoCobjectMap.get(ida.id)) );  
        }
    }
    
    List<Messaging.SingleEmailMessage> email = new List<Messaging.SingleEmailMessage>();
    for(idea temp : IdeatoBeSyncWithJira){
        if(temp.Categories!=null && ( temp.Categories.contains('Venue') || temp.Categories.contains('CylanceV'))){
            toAddress = Label.toAddresses_Venue_CylanceV;           
        }else if(temp.Categories!=null && (temp.Categories.contains('Agent'))){
            toAddress = Label.toAddresses_Agent;
        }else{Continue;}
            
        toAddresses.add(toAddress); 
        Messaging.SingleEmailMessage mail = new Messaging.SingleEmailMessage();
            mail.setToAddresses(toAddresses);
            mail.setSubject(temp.title);
            if(owa != null){
                mail.setOrgWideEmailAddressId(owa.id);
            }else{
                mail.setSenderDisplayName('Cylance');
            }
            mail.setccAddresses(ccAddresses);
            mail.setHtmlBody(temp.Body); 
            mail.saveAsActivity = false;
        
        if(IdeaToAtcmntMap.containsKey(temp.id)){       
            List<Messaging.Emailfileattachment> fileAttachments = new List<Messaging.Emailfileattachment>();
            for (Attachment a : IdeaToAtcmntMap.get(temp.id)){
                // Add to attachment file list
                Messaging.Emailfileattachment efa = new Messaging.Emailfileattachment();
                efa.setFileName(a.Name);
                efa.setBody(a.Body);
                fileAttachments.add(efa);
            }
            mail.setFileAttachments(fileAttachments);
        }
        email.add(mail);
        SyncedIdeaUpdateList.add(temp.id);
    }
    
    try{        
        //Send email
        Messaging.sendEmail(email);
        //Update Jira Synced Ideas;
        list<idea> SyncedIdeaUpdateFinalList = new list<idea>();
        for(id tempid : SyncedIdeaUpdateList){
            idea tmp = new idea(id = tempid, Sync_To_Jira__c = true);
            SyncedIdeaUpdateFinalList.add(tmp);
        }
        Update SyncedIdeaUpdateFinalList;
    }catch(Exception e){}
    
}
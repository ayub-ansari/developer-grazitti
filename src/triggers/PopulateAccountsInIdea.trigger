trigger PopulateAccountsInIdea on Idea_Account__c (before insert, before update, after insert, after delete) {
    Set<string> idaIds = new  Set<string>();
    Set<string> accIds = new  Set<string>();
    Map<string,string> accideaMap = new Map<string,string>();
    if(trigger.isBefore){
        for(Idea_Account__c idacc :  trigger.new){
            accIds.add(idacc.Account__c);
            idaIds.add(idacc.Idea__c);
        }
        for(Idea_Account__c ia : [SELECT ID, Name, Account__c, Account__r.Name, Idea__c, Idea__r.Title FROM Idea_Account__c WHERE Account__c IN: accIds AND Idea__c IN: idaIds]){
            accideaMap.put(ia.Account__c+''+ia.Idea__c, ia.Account__c+''+ia.Idea__c);
        }
        for(Idea_Account__c idac : trigger.new){
            if(!accideaMap.isEmpty()){
                if(accideaMap.containsKey(idac.Account__c+''+idac.Idea__c)){
                    idac.addError(System.Label.IdeaAccountErrorMessage);
                }
            }
        }
    }else{
    Set<string> ideasIds = new  Set<string>();
    List<Idea_Account__c> triggerVersions = (trigger.isInsert)?trigger.new:trigger.old;

    for(Idea_Account__c junction : triggerVersions) {
        if(junction.Idea__c != null) {
            ideasIds.add(junction.Idea__c);   
        }
    }
        
    List<Idea> ideasToBeupdated = new List<Idea>();
    for(Idea ida: [SELECT Id, (SELECT Name, Idea__c, Idea__r.Title, Account__c, Account__r.Id, Account__r.Name FROM Idea_Account_Infos__r ORDER BY LastModifiedDate DESC LIMIT 26) FROM Idea WHERE Id IN: ideasIds]) {
        ida.Related_Accounts__c = '';      
        integer i=0;  
        for(Idea_Account__c idc: ida.Idea_Account_Infos__r ){
            
            if(idc.Account__c!= null){
                if(i<5) {
                    ida.Related_Accounts__c +='<a href="/'+idc.Account__r.Id+'">' +idc.Account__r.Name+'</a>'+'<br/>';      
                } 
                i++;
            }
            
            system.debug(ida.Related_Accounts__c);
        }
        string IdeaId = ida.Id;
        if(IdeaId .length()>15) IdeaId = IdeaId.subString(0,IdeaId.length()-3);
        ida.Related_Accounts__c += '<br/>'+'<a href="/apex/Idea_Account_RelatedList?id='+IdeaId+'"><b>View All ... </b></a>';
         
        ideasToBeupdated.add(ida);
    }   
    update ideasToBeupdated;
    }   
}
public with sharing class PreferenceController{

    public Preferences__c preference {get;set;}
     
    public PreferenceController(ApexPages.StandardController controller) {
        List<Preferences__c> preferences = [SELECT IsSalesUser__c, IsSupportUser__c, IsTeamAnalytics__c, Have_Scheduled_Component__c, User__c, UniqueUser__c FROM Preferences__c where User__c =:UserInfo.getUserId()];
        if(preferences.isEmpty()){ preference = new Preferences__c();}
        else{preference = preferences[0];}
    }
    
    public void Save(){
        preference.User__c = UserInfo.getUserId();
        preference.UniqueUser__c= preference.User__c;
        upsert preference UniqueUser__c;
    }





}
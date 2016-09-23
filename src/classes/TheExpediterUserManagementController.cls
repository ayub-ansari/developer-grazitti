public with sharing class TheExpediterUserManagementController {
    
    public List<GlobalReferenceWrapper> sheduledJobs {get;set;}
    public Map<string, List<UserReferenceDetail>> referencesMap {get;set;}
    
    private final static string DATA_EXPORT        = ' Data Export';
    private final static string DASHBOARD_REFERSH  = ' Dashboard Refresh';
    private final static string REPORTING_SNAPSHOT = ' Reporting Snapshot';
    private final static string REPORT_RUN         = ' Report Run';    
    private final static string SCHEDULED_APEX     = ' Scheduled Apex';
    private final static string BATCH_JOB          = ' Apex Batch Job';
    private final static string EMAIL_ALERT        = ' Email Alert';
    
    public string jsonResponse;
    
    public string emailtextInHtml {get;set;}
    public string recipientEmail {get;set;}
    

    public string selectedUser {get;set;}
    public string selectedUserId {get;set;}
    public string selectedsfdcUserName {get;set;}
    public string selectedUserRole {get;set;}
    public string selectedUserProfile {get;set;}
    
    public List<PieWedgeData> data {get;set;}
    public List<PieWedgeData> objectCountData {get;set;}
    public boolean showCalloutException {get;set;}
    public string  baseURL {get;set;}
    
    public PageReference searchGo() {
        showReferences(selectedUserId, selectedUser, selectedsfdcUserName);
        decorateUsageData(selectedUserId);
        return null;
    }     
    
    public TheExpediterUserManagementController() {
        showReferences(Userinfo.getUserId(), Userinfo.getName(), Userinfo.getUserName());
        decorateUsageData(Userinfo.getUserId());
        //system.debug(alerts);
    }
    
    public void showReferences(string userId, string username, string sfdcUserName) {
    
        List<UserReferenceDetail> dataExports        = new List<UserReferenceDetail>(); 
        List<UserReferenceDetail> dashboardRefreshes = new List<UserReferenceDetail>(); 
        List<UserReferenceDetail> reportings         = new List<UserReferenceDetail>(); 
        List<UserReferenceDetail> scheduledReports   = new List<UserReferenceDetail>(); 
        List<UserReferenceDetail> scheduledApexes    = new List<UserReferenceDetail>(); 
        List<UserReferenceDetail> scheduledBatches   = new List<UserReferenceDetail>(); 
        List<UserReferenceDetail> emailAlerts        = new List<UserReferenceDetail>(); 
        
        data = new List<PieWedgeData>();
        
        selectedUser   = username;
        selectedUserId = userId;
        selectedsfdcUserName = sfdcUserName;
        User  current_usr = [SELECT Profile.Name, UserRole.Name FROM User WHERE Id=: userId LIMIT 1 ];
        if(current_usr != null){
            selectedUserRole    = current_usr.UserRole.Name;
            selectedUserProfile = current_usr.Profile.Name;
        }
        recipientEmail='';
        showCalloutException = false;
        
        set<String> CronJobDetailIds = new set<String>();
        //***RETRIEVE SCHEDULED JOB INFORMATION...        
        for(CronTrigger cron: [SELECT CronJobDetailId, State, OwnerId FROM CronTrigger WHERE OwnerId =: userId ]){
            CronJobDetailIds.add(cron.CronJobDetailId);
        }        
        //***RETRIEVE MORE SPECEFIC INFORMATION OF SCHEDULED JOB... 
        
        for(CronJobDetail cronDetail: [SELECT JobType, Name, Id FROM CronJobDetail WHERE Id IN : CronJobDetailIds]){
            UserReferenceDetail job = new UserReferenceDetail();            
            job.jobTitle     = cronDetail.Name;
            job.Id           = cronDetail.Id;
            if(cronDetail.JobType == '1'){
                job.JobType = ' Data Export';
                job.updateUrlId = '/08e?retURL=/apex/TheExpediterUserManagement';
                dataExports.add(job);
            }else if(cronDetail.JobType == '3'){
                 job.updateUrlId = '/08e?retURL=/apex/TheExpediterUserManagement';
                 job.jobType = ' Dashboard Refresh';
                 dashboardRefreshes.add(job);
            }else if(cronDetail.JobType == '4'){
                job.updateUrlId = '/08e?retURL=/apex/TheExpediterUserManagement';
                job.jobType = ' Analytic Snapshot';
                reportings.add(job);
            }else if(cronDetail.JobType == '7'){
                job.updateUrlId = '/08e?retURL=/apex/TheExpediterUserManagement';
                job.jobType = ' Apex';
                scheduledApexes.add(job);
            }else if(cronDetail.JobType == '8'){
                job.updateUrlId = '/08e?retURL=/apex/TheExpediterUserManagement';
                job.jobType = ' Report Run';
                scheduledReports.add(job);
            }else if(cronDetail.JobType == '9'){
                job.updateUrlId = '/08e?retURL=/apex/TheExpediterUserManagement';
                job.jobType = ' Batch Job';
                scheduledBatches.add(job);
            }            

        }
        
        string endpoint       = URL.getSalesforceBaseUrl().toExternalForm()+'/services/data/v32.0/tooling/';
        try
        {
            jsonResponse          = UtilityWithHelpingTools.workflowInfos(endpoint);
            if(jsonResponse.contains('Unauthorized endpoint') == false){
                
                Map<String, Object> m = (Map<String, Object>)JSON.deserializeUntyped(jsonResponse);
                system.debug(JSON.serialize(m.get('records')));
                JSONParser parser = JSON.createParser(JSON.serialize(m.get('records')));
                while (parser.nextToken() != null) { 
                    if (parser.getCurrentToken() == JSONToken.START_ARRAY) {       
                        while (parser.nextToken() != null) {
                            if (parser.getCurrentToken() == JSONToken.START_OBJECT) {
                                GlobalWrapper.Emailalert emailAlert = new GlobalWrapper.Emailalert ();
                                emailAlert = (GlobalWrapper.Emailalert)parser.readValueAs(GlobalWrapper.Emailalert.class); 
                                
                                for(GlobalWrapper.Recipient usr: emailAlert.Metadata.recipients){
                                    if(usr.Type=='user' && usr.recipient == sfdcUserName ){
                                        UserReferenceDetail job = new UserReferenceDetail();            
                                        job.jobTitle     = emailAlert.Metadata.description;
                                        job.Id           = emailAlert.Id;
                                        job.updateUrlId = '/'+job.Id;
                                        job.jobType = emailAlert.TableEnumOrId;
                                        emailAlerts.add(job );
                                    }
                                }                   
                              }
                        }
                    }
                }   
            }else{
                showCalloutException = true;
                baseURL = URL.getSalesforceBaseUrl().toExternalForm();
            }
        }catch(Exception e){
            if(e.getMessage().contains('System.CalloutException: Unauthorized endpoint')){
                showCalloutException = true;
                baseURL = URL.getSalesforceBaseUrl().toExternalForm();
            }
        }
        
        sheduledJobs = new List<GlobalReferenceWrapper>();
        GlobalReferenceWrapper gw1 = new GlobalReferenceWrapper();
        gw1.column_one = 'Name';
        gw1.column_two = 'Id';
        gw1.key = EMAIL_ALERT;
        gw1.value   = emailAlerts;
        sheduledJobs.add(gw1);
        data.add(new PieWedgeData('Email Alert',emailAlerts.size())); 
        //
        GlobalReferenceWrapper gw2 = new GlobalReferenceWrapper();
        gw2.column_one = 'Report Id';
        gw2.column_two = 'Scheduled Job Id';
        gw2.key = REPORT_RUN;
        gw2.value   = scheduledReports;
        sheduledJobs.add(gw2);
        data.add(new PieWedgeData('Report Run',scheduledReports.size())); 
        //
        GlobalReferenceWrapper gw3 = new GlobalReferenceWrapper();
        gw3.column_one= 'Dashboard Id';
        gw3.column_two= 'Scheduled Job Id';
        gw3.key = DASHBOARD_REFERSH;
        gw3.value   = dashboardRefreshes;
        sheduledJobs.add(gw3);  
        data.add(new PieWedgeData('Dashboard',dashboardRefreshes.size()));  
        //
        GlobalReferenceWrapper gw4 = new GlobalReferenceWrapper();
        gw4.column_one = 'Scheduled Job Name';
        gw4.column_two = 'Scheduled Job Id';
        gw4.key = SCHEDULED_APEX;
        gw4.value   = scheduledApexes;
        sheduledJobs.add(gw4);  
        data.add(new PieWedgeData('Sch. Apex',scheduledApexes.size()));      
        //
        GlobalReferenceWrapper gw5 = new GlobalReferenceWrapper();
        gw5.column_one  = 'Batch Job Name';
        gw5.column_two  = 'Batch Job Id';
        gw5.key = BATCH_JOB;
        gw5.value   = scheduledBatches;
        sheduledJobs.add(gw5);
        data.add(new PieWedgeData('Batch',scheduledBatches.size()));
        //
        GlobalReferenceWrapper gw6 = new GlobalReferenceWrapper();
        gw6.column_one  = 'Scheduled Snapshot Name';
        gw6.column_two  = 'Scheduled Job Id';
        gw6.key = REPORTING_SNAPSHOT ;
        gw6.value   = reportings;
        sheduledJobs.add(gw6);
        data.add(new PieWedgeData('Snapshot',reportings.size()));
        //
        GlobalReferenceWrapper gw7 = new GlobalReferenceWrapper();
        gw7.column_one = 'Scheduled Job Name';
        gw7.column_two = 'Scheduled Job Id';
        gw7.key = DATA_EXPORT;
        gw7.value = dataExports;
        sheduledJobs.add(gw7);
        data.add(new PieWedgeData('Data Export',dataExports.size()));        
        
    }    
    
    public void sendEmail(){
        if(recipientEmail!= null){
           Messaging.SingleEmailMessage mail = new Messaging.SingleEmailMessage();
           List<String> toAddresses = new List<String>(recipientEmail.split(','));
           mail.setToAddresses(toAddresses);
           mail.setSubject('Scheduled Job And Other References By ' +selectedUser);
           if(emailtextInHtml!=null){
               //string emailtextInHtml = emailtextInHtml.substringAfter('Email Alert')+''+emailtextInHtml.substringAfter('Email Alert').replace('border="0"', 'border="1"');
               mail.setHtmlBody(emailtextInHtml.replace('cellpadding="0"','cellpadding="5"').replace('cellspacing="0"','cellspacing="5"'));
           }
           try{ 
               Messaging.sendEmail(new Messaging.SingleEmailMessage[] { mail });
               recipientEmail = 'Sent Successfully';               
           }catch(Exception e){recipientEmail = 'Some Error Occured While Sending...';}
           
        }
    }
    
    private void decorateUsageData(string currentUserId){
        if(currentUserId!= null && currentUserId !=''){
            objectCountData =  new List<PieWedgeData>();
            Integer count_acc = [SELECT count() FROM Account WHERE OwnerId=:currentUserId];
            if(count_acc >0){
                objectCountData.add(new PieWedgeData('Account',count_acc));
            }
            //
            Integer count_opp = [SELECT count() FROM Opportunity WHERE OwnerId=:currentUserId];
            if(count_opp >0){
                objectCountData.add(new PieWedgeData('Opportunity',count_opp));
            }
            //
            Integer count_lead = [SELECT count() FROM Lead WHERE OwnerId=:currentUserId];
            if(count_lead >0){
                objectCountData.add(new PieWedgeData('Lead',count_lead));
            }
            //
            Integer count_case = [SELECT count() FROM Case WHERE OwnerId=:currentUserId];
            if(count_lead >0){
                objectCountData.add(new PieWedgeData('Case',count_case));
            }            
        }
    }
    
    // Wrapper class  
    public class PieWedgeData 
    {  
        public String name { get; set; }  
        public Integer data { get; set; }  
        
        public PieWedgeData(String name, Integer data) 
        {  
            this.name = name;  
            this.data = data;  
        }  
    }  
    
    public class UserReferenceDetail {
        public string id {get; set;}
        public String jobTitle {get; set;}
        public String JobType {get; set;}
        public String updateUrlId{get; set;} 
        public userReferenceDetail() {
        
        }
    }
    
    public class GlobalReferenceWrapper {
        public string column_one {get;set;}
        public string column_two {get;set;}
        public string key {get;set;}
        public List<UserReferenceDetail> value {get;set;}
        
        public GlobalReferenceWrapper() {
            column_one = '';
            column_two = '';
            key      = '';
            value    = new List<UserReferenceDetail>();
        }       
    }
    
}
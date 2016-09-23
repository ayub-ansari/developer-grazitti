public with sharing Class UserConsole{
    public string response {get;set;}
    public User selectedUser {get;set;}
    public userConsole(){
         selectedUser = new User(Id=Userinfo.getUserId()) ;
        //String endUrl = 'https://ayub-ansari-dev-ed.my.salesforce.com/setup/user/userstorageusage.jsp?id=005900000022hUb&setupid=PersonalInformation&isdtp=mn';
        //HTTPResponse sessionsInResponse = doApiRequest(endUrl, 'GET');
        //if(sessionsInResponse.getBody() != 'ERROR'){
            //response= sessionsInResponse.getBody();
        //}
    }
    
    public List<SelectOption> getUsers() {
            List<SelectOption> options = new List<SelectOption>();
            for(User u: [Select Id, Name from User]){
                options.add(new SelectOption(u.Id,u.Name));
            }
            return options;
    }
    
     public static HTTPResponse doApiRequest(String encodedURL, String HttpRequestMethod) {
        HTTPResponse response;
        HttpRequest req  = new HttpRequest();
        req.setEndPoint(encodedURL );
        req.setMethod(HttpRequestMethod);
        req.setHeader('Authorization', 'Bearer ' + UserInfo.getSessionID());
        
        if(HttpRequestMethod == 'POST'){
            req.setHeader('Charset', 'UTF-8');
            req.setHeader('Content-Length', '512'); 
            req.setHeader('Content-Type', 'text/plain');
            req.setTimeout(20);
        }
        Http http = new Http();
        if (!Test.isRunningTest()) {
            response  = http.send(req);
            if (response.getStatus() == 'OK') {
                 return response;
            }else{
                response = new HTTPResponse();
                response.setBody('ERROR');
                return response ;
            }
           
        } else {
            response = new HTTPResponse();
            String testData = '[{"email":"jacob.beetham@netcall.com","givenName":"Jacob","surname":"Beetham","status":"APPROVED","registrationDate":"2014-02-10T16:59:07Z","joinUrl":"https://www1.gototraining.com/join/training/6906628824343898624/107890187","confirmationUrl":"https://student.gototraining.com/registration/confirmation.tmpl?registrant=5219031309208607488&training=6906628824343898624","registrantKey":"5219031309208607488"';
            testData += ',"sessionKey":"1460206","trainingName":"Basics 2: Foundation Live-Online","sessionStartTime":"'+DateTime.now().addDays(1).year()+'-'+DateTime.now().addDays(1).month()+'-'+DateTime.now().addDays(1).day()+'T'+DateTime.now().addDays(1).hour()+':'+DateTime.now().addDays(1).minute()+':'+DateTime.now().addDays(1).second()+'Z'+'","sessionEndTime":"'+DateTime.now().addDays(2).year()+'-'+DateTime.now().addDays(2).month()+'-'+DateTime.now().addDays(2).day()+'T'+DateTime.now().addDays(2).hour()+':'+DateTime.now().addDays(2).minute()+':'+DateTime.now().addDays(2).second()+'Z'+'","attendanceCount":5,"duration":147,"organizers":[{"givenName":"Majda","surname":"Anwar","email":"manwar@marketo.com","organizerKey":"100000000001409396"}]';
            testData += ',"timeInSession":7301';
            testData += ',"name":"Basics 2: Foundation Live-Online","description":"Foundation Instructor","timeZone":"America/Los_Angeles","times":[{"startDate":"2014-03-10T16:00:00Z","endDate":"2014-03-10T18:30:00Z"},{"startDate":"2014-03-11T16:00:00Z","endDate":"2014-03-11T18:30:00Z"},{"startDate":"2014-03-12T16:00:00Z","endDate":"2014-03-12T18:30:00Z"},{"startDate":"2014-03-13T16:00:00Z","endDate":"2014-03-13T18:30:00Z"}]';
            testData += '}]';
            response.setBody(testData);
            return response ;      
        }
        return response;
     
     }
}
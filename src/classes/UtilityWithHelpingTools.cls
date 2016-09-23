public class UtilityWithHelpingTools {

    String endpoint = '';
    public string result;
    
    public UtilityWithHelpingTools() {
        endpoint = URL.getSalesforceBaseUrl().toExternalForm()+'/services/data/v32.0/tooling/';
        system.debug(endpoint);
        //result = workflowInfos();
    }    
    
    public static string workflowInfos(string endpoint) {
        if(!Test.isRunningTest() ) {
            HttpRequest req = createHttpRequest(endpoint+'query?q=SELECT+Id,+Metadata,+TableEnumOrId+FROM+WorkflowAlert','GET');
            system.debug(req);
            String response = getResponse(req);
            system.debug(response);
            return response;
        }else {
            Test.setMock(HttpCalloutMock.class, new MockHttpResponseGenerator());
            HttpRequest req = createHttpRequest('http://api.salesforce.com/foo/bar', 'GET');
            getResponse(req);
            string testResponse = '{"size":2,"totalSize":2,"done":true,"queryLocator":null,"entityTypeName":"ActionEmail","records":';
            testResponse+= '[{"attributes":{"type":"WorkflowAlert","url":"/services/data/v32.0/tooling/sobjects/WorkflowAlert/01W900000000sPEEAY"},"Id":"01W900000000sPEEAY","Metadata":{"ccEmails":["ayub.a@grazitti.com","ali@gmail.com"],"description":"test email","protected":false,"recipients":[{"field":null,"recipient":"ayubsfdc@app.com","type":"user"}],"senderAddress":null,"senderType":"CurrentUser","template":"unfiled$public/SalesNewCustomerEmail","urls":null},"TableEnumOrId":"Account"}';
            testResponse+=',{"attributes":{"type":"WorkflowAlert","url":"/services/data/v32.0/tooling/sobjects/WorkflowAlert/01W900000000tUKEAY"},"Id":"01W900000000tUKEAY","Metadata":{"ccEmails":[],"description":"Send email to manager","protected":false,"recipients":[{"field":null,"recipient":"ayubsfdc@app.com","type":"user"}],"senderAddress":null,"senderType":"CurrentUser","template":"unfiled$public/SalesNewCustomerEmail","urls":null},"TableEnumOrId":"Account"}]}';
            return testResponse;
        }
    }    
    
    private static HttpRequest createHttpRequest(String endpoint, String method) {
        HttpRequest req = new HttpRequest();
        endpoint += '';
        req.setHeader('Authorization', 'Bearer ' + UserInfo.getSessionID());
        req.setHeader('Content-Type', 'application/json');
        req.setEndpoint(endpoint);
        req.setMethod(method);
        return req;
    }
    
    // used receive response by sending a http request
    private static String getResponse(HttpRequest req) {
        try {
            Http httpreq      = new Http();
            HttpResponse res  = httpreq.send(req);
            String reqresponse = res.getBody();
            return reqresponse;
        }catch (Exception e) {
            return 'Error:' +e.getMessage();
        }
    }    
    
}
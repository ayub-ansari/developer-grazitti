public class ToolingAPI_DemoController {

    final String endpoint = 'https://ap1.salesforce.com/services/data/v32.0/tooling/sobjects';
    public String oid ;
    public String cid ;
    public String apxClsMemberId;
    public String metadataContainerId;
    public String asyncRequestId;
    public String asyncResponseInJSon;
    public string result {get;set;}
    
    public ToolingAPI_DemoController (){
        result = workflowInfos();
    }
    public void updateApexClassByToolingAPI(){
        
        //metadataContainerId = createMetadataContainer();
        String classId      = ''; 
        string classBody    = '';
        //List<WorkflowRule> wfs =  [SELECT Id FROM WorkflowRule];
        //apxClsMemberId      = createApexClassMember(metadataContainerId, classId, classBody);
        //asyncRequestId      = createContainerAsyncRequest(metadataContainerId);
        //asyncResponseInJSon = getContainerAsyncRequestStatus(asyncRequestId);
        system.debug(asyncResponseInJSon +'===asyncResponseInJSon ==');
    }
    
    public string workflowInfos(){
        string s= '%ayub.a@grazitti.com%';
        HttpRequest req = createHttpRequest('https://ap1.salesforce.com/services/data/v32.0/tooling/query?q=SELECT+Id,+Metadata,+TableEnumOrId+FROM+WorkflowAlert','GET');
        system.debug(req);
        String response = getResponse(req);
        system.debug(response);
        return response;
    }
    
    public void updateApexTrigger(){
        metadataContainerId = createMetadataContainer();
        String triggerId      = '01q90000000SVlx'; 
        ApexTrigger ap = [select body from ApexTrigger where Id ='01q90000000SVlx' ];
        string triggerBody    = ap.body ;
        apxClsMemberId      = createApexTriggerMember(metadataContainerId, ap.Id, triggerBody);
        asyncRequestId      = createContainerAsyncRequest(metadataContainerId);
        asyncResponseInJSon = getContainerAsyncRequestStatus(asyncRequestId);
        system.debug(asyncResponseInJSon +'===asyncResponseInJSon ==');
    }
    public string createMetadataContainer() {
        HttpRequest req = createHttpRequest(endpoint+'/MetadataContainer','POST');
        string name = 'ApexContainer'+system.now();
        req.setBody('{"Name":"'+name+'"}');
        String response = getResponse(req);
        Map<String,Object> rmp = (Map<String,Object>)JSON.deserializeuntyped(response);
        String cid = (String)rmp.get('id'); // used to save containerId
        return cid;
    }
    
    // mid: MetadaContainserId
    // axid: apexclass Id
    // classBody: Apex class body (updated)
    public string createApexClassMember(String mid, String axid, String classBody){
        HttpRequest req = createHttpRequest(endpoint+'/ApexClassMember','POST');
        req.setBody('{"MetadataContainerId" : "'+mid+'", "ContentEntityId" : "'+axid+'", "Body": "'+EncodingUtil.urlEncode(classbody, 'UTF-8')+'"}');
        String response = getResponse(req);
        Map<String,Object> rmp = (Map<String,Object>)JSON.deserializeuntyped(response);
        String apmid = (String)rmp.get('id'); // Store ApexClassMember Id
        return apmid;
    }
    public string createApexTriggerMember(String mid, String axid, String triggerBody){
        HttpRequest req = createHttpRequest(endpoint+'/ApexTriggerMember','POST');
        req.setBody('{"MetadataContainerId" : "'+mid+'", "ContentEntityId" : "'+axid+'", "Body": "'+EncodingUtil.urlEncode(triggerBody, 'UTF-8')+'"}');
        system.debug('{"MetadataContainerId" : "'+mid+'", "ContentEntityId" : "'+axid+'", "Body": "'+triggerBody+'", "Status": "Inactive"}');
        String response = getResponse(req);
        system.debug('--response ---'+response );
        Map<String,Object> rmp = (Map<String, Object>)JSON.deserializeuntyped(response);
        String apmid = (String)rmp.get('id'); // Store ApexTriggerMember Id
        return apmid;
    }
    
    public string createContainerAsyncRequest(String mid){
        HttpRequest req = createHttpRequest(endpoint+'/containerAsyncRequest','POST');
        req.setBody('{"MetadataContainerId" : "'+mid+'", "isCheckOnly": "false"}');
        String response = getResponse(req);
        Map<String,Object> rmp = (Map<String,Object>)JSON.deserializeuntyped(response);
        string carid = (String)rmp.get('id');
        return carid ;
    }
    public string getContainerAsyncRequestStatus(String carid){
        HttpRequest req = createHttpRequest(endpoint+'/containerAsyncRequest/'+carid,'GET');
        String responseJson = getResponse(req);
        return responseJson;
    }
    public static HttpRequest createHttpRequest(String endpoint, String method) {
        HttpRequest req = new HttpRequest();
        endpoint += '';
        req.setHeader('Authorization', 'Bearer ' + UserInfo.getSessionID());
        req.setHeader('Content-Type', 'application/json');
        system.debug(endpoint+'----');
        req.setEndpoint(endpoint);
        req.setMethod(method);
        return req;
    }
    
    // used receive response by sending a http request
    private String getResponse(HttpRequest req) {
        try {
            Http httpreq      = new Http();
            HttpResponse res  = httpreq.send(req);
            String reqresponse = res.getBody();
            return reqresponse;
        }catch (Exception e) {
            return 'Error:' +e.getMessage();
        }
    }
    
    public string createApexClass() {
        // create a Http request with post method
        HttpRequest req = createHttpRequest(endpoint+'/ApexClass','POST');
        req.setBody( '{"Name":"ApexClassCreatedByToolingApi","Body":"public class ApexClassCreatedByToolingApi {}"}');
        // send request and receive response
        String response = getResponse(req);
        // These two lines have no role in creating apex class. So they can be ignored for now.
        Map<String,Object> rmp = (Map<String,Object>)JSON.deserializeuntyped(response);
        string oid = (String)rmp.get('id');
        return oid;
    }
    
    // [Status=No Content, StatusCode=204]
    public void deleteApexClass(){
        HttpRequest req = createHttpRequest(endpoint+'/ApexClass/'+oid,'DELETE');
        String responseJson = getResponse(req); // Store the result to do something
    }
}
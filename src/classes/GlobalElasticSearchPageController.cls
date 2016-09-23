public class GlobalElasticSearchPageController {

    public PageReference showElasticity() {
        return null;
    }


   // public static string searchText {get;set;}
    public static string jsonString {get;set;}
    @RemoteAction
    public static string showElasticity(string searchText) {
    
        string baseUrl = 'http://6e4d53f4.ngrok.com/';
        Boolean isglobal = true;
        if(isglobal){
           if(searchText != null && searchText != ''){
               baseUrl += '_search?q=tag:'+searchText;
           }else{
               baseUrl += '_search?q=*';
           }
        }
        
        jsonString = elasticAirline(baseUrl, 'GET');  
        JSONParser parser =JSON.createParser(jsonString);      
        parser.nextToken();
        system.debug(parser.nextValue()+'==>');
        return jsonString;
    }

    public static string elasticAirline(string endpoint, string method) {
        HttpRequest req = new HttpRequest();     
        req.setHeader('Content-Type', 'application/json');
        req.setEndpoint(endpoint);
        req.setMethod(method);
        system.debug(req);
        Http httpreq       = new Http();
        HttpResponse res   = httpreq.send(req);
        String reqresponse = res.getBody();       
        system.debug(reqresponse);
        return reqresponse;
    }


}
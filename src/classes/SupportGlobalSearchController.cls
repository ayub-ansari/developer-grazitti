/**
DESCRIPTION: THIS APEX CLASS IS USED AS CONTROLLER FOR THE PAGE: “SUPPORTGLOBALSEARCH”- HANDLES ALL BACKEND EXECUTION AND LOGICS.
DEVELOPED BY: GRAZITTI
**/
public class SupportGlobalSearchController {
    public Case caseRecord {get;set;} 
    public String jiveSearchUrl = System.label.Jive_Endpoint_URL+'/api/core/v3/search/contents?filter=type('; 
    public String searchText {get; set;}
    public String channelType{get;set;}
    public List<ResultElement> results{get;set;} 
    public List<ResultElement> resultsToShow{get;set;}  
    public List<Case> caseSearchResults {get;set;}  
    public Boolean showPrev {get;set;}
    public Boolean showNext {get;set;} 
    public Boolean showPrevJive {get;set;}
    public Boolean showNextJive {get;set;}   
    public Boolean hasNextPage{get;set;}
    public Boolean hasPrevPage{get;set;}        
    public Boolean document{get;set;} 
    public Boolean Discussion{get;set;} 
    public Boolean Question{get;set;} 
    public Boolean Blog{get;set;} 
    public Boolean Idea{get;set;}     
    public Boolean showCaseResult {get;set;}
    Public DateTime dtime; 
    public Integer numberOfResults{get;set;}    
    public Integer currentPage{get; set;}
    Public Integer totalRecs{get;set;} 
    Public Integer totalRecsJIve{get;set;}    
    private Integer index = 0;
    private Integer blockSize = 3; 
    private Integer counter = 0;     
    
    public SupportGlobalSearchController(ApexPages.StandardController controller) {
        hasPrevPage = False;
        hasNextPage = False;
        channelType = 'All';
        caseSearchResults = new List<Case>();
        totalRecs = 0;
        Discussion = true;
        document = true;
        Blog = true;
        Idea =  true;
        Question = true;
        showCaseResult = true;
        if(document == false && Blog == false && Blog == false ){
            document = true;
        }  
        currentPage  = ApexPages.currentPage().getParameters().get('page')!=null?integer.valueof(ApexPages.currentPage().getParameters().get('page')):0;    
        caseRecord   = (Case)controller.getRecord();
        searchKnowledgeRecords();//POPULATE THE SEARCH RESULT ON PAGE LOAD                
    } 
     
    public PageReference searchKnowledgeRecords(){ 
        //SEARCH TEXT VALIDATION..                   
        List<Case> cases = new List<Case>([SELECT Subject, CaseNumber from Case WHERE Id = :caseRecord.id]);      
        if(!cases.isEmpty()){ 
            caseRecord = cases[0];        
            if((searchText == null || searchText.Trim() == '' ) && caseRecord.Subject != null) searchText = caseRecord.Subject;
            if(searchText == null && caseRecord.Subject == null) searchText = '';
        }  
        if(searchText.trim().length() < 2) { ApexPages.addMessage(new ApexPages.Message(ApexPages.Severity.FATAL, 'Search text length should be more than one')); return null;}
        
        DateTime LastDay   = system.now().addDays(-1);
        DateTime LastWeek  = system.now().addDays(-7);
        DateTime LastMonth = system.now().addMonths(-1);
        DateTime LastYear  = system.now().addYears(-1);
        
        String LastDayStr   = system.now().addDays(-1).format('yyyy-MM-dd');
        String LastWeekStr  = system.now().addDays(-7).format('yyyy-MM-dd');
        String LastMonthStr = system.now().addMonths(-1).format('yyyy-MM-dd');
        String LastYearStr  = system.now().addYears(-1).format('yyyy-MM-dd');
        
        String dateString;
        if(channelType =='DayAgo') {
            dateString = LastDayStr+'T11:00:00.000+0000)';
            dtime = LastDay;
        }else if(channelType =='WeekAgo') {
            dateString = LastWeekStr+'T11:00:00.000+0000)';
            dtime = LastWeek;
        }else if(channelType =='MonthAgo') {
            dateString = LastMonthStr+'T11:00:00.000+0000)';
            dtime = LastMonth;
        }else if(channelType =='YearAgo') {
            dateString = LastYearStr+'T11:00:00.000+0000)';
            dtime= LastYear;
        }
        caseSearchResults = new List<Case>();
        totalRecs = 0; 
        if(showCaseResult){search(dtime);} 
        
        //JIVE PROCESSING......STARTS
        list<string> doctypeList = new list<string>();
                
        if(document)doctypeList.add('document');
        if(Discussion || Question)doctypeList.add('discussion');
        if(Blog)doctypeList.add('post');
        if(idea)doctypeList.add('idea');
                      
        system.debug('doctypeList===>'+doctypeList);
        results     = new List<ResultElement>();
        integer i = 1;
        for(string type: doctypeList) {           
            String encodedURL = '';        
            HTTPResponse response = new HTTPResponse();
            if(dateString!=null && dateString!=''){
                encodedUrl = jiveSearchUrl +type+')&filter=search(' + EncodingUtil.urlEncode(searchText,'UTF-8')+')&filter=after('+dateString+'&abridged=true';      
            }else{
                encodedUrl = jiveSearchUrl +type+')&filter=search(' + EncodingUtil.urlEncode(searchText, 'UTF-8')+')' +'&abridged=true';
            }
            //GAME OF API STARTS...
            response = makeAPIRequest(encodedURL,System.Label.Jive_Search_Credentials);      
            if(response != null ) {           
                jiveCategorySpecificResults(response, type);                                    
            }
            if(doctypeList.size() == i){
                createPagination(results);   
            }
            i++;                    
        }                                          
        return null;
    }
    
    public void jiveCategorySpecificResults(HTTPResponse res, string type){
        String JSONContent = res.getBody();        
        System.debug('JSONContent===>'+JSONContent); 
        JSONContent = JSONContent.remove('throw \'allowIllegalResourceCall is false.\';');       
        if(JSONContent.contains('{"errors":[{"error":"not found"}]}')){
            System.debug('No Articles Found');                                                                                                      
        }else{
            JSONParser parser = JSON.createParser(JSONContent);
            Map<String,Object> jsonMap = (Map<String, Object>)JSON.deserializeUntyped(JSONContent); 
            List<Object> jsonResults = (List<Object>) jsonMap.get('list');
            numberOfResults            = jsonResults.size();
            Integer paginationStart    = 0;
            system.debug('currentPage==>'+currentPage);
            system.debug('numberOfResults==>'+numberOfResults);                         
            System.debug('results==>' + jsonResults.size());
            if(jsonResults.size()==0) return;
            this.Results.addall(parseJiveDom(jsonResults,type));
            system.debug(this.results.size()+'results=========>'+this.results);  
         }                                                
    }
    
    public class ResultElement {
        public String title   {get; set;}
        public String summary {get; set;}
        public String sfdc_id {get; set;}
        public String lastmodified {get;set;}
        public String typeofchannel{get; set;}
        public Boolean isSelected {get;set;}
        public String URL {get;set;}
        public Boolean question {get;set;}
    }
    
    public HTTPResponse makeAPIRequest(String encodedURL, String authString) {
        HTTPResponse response;
        HttpRequest req  = new HttpRequest();
        req.setEndPoint(encodedURL);
        req.setMethod('GET');
        Http http = new Http();
        if(authString != '') {
            Blob headerValue = Blob.valueOf(authString);
            String authorizationHeader = 'Basic ' +
            EncodingUtil.base64Encode(headerValue);
            req.setHeader('Authorization', authorizationHeader);
            req.setHeader('content-type', 'application/json');
            req.setHeader('Accept', 'application/json'); 
        }               
        if (!Test.isRunningTest()) {
            response  = http.send(req);
            System.Debug('REQUEST'+req);
            if(response.getStatus() == 'OK') {return response;}
            else {return null;}
        }else{
           response = new HTTPResponse();
           response.setBodyAsBlob([SELECT Body FROM StaticResource WHERE Name = 'TestDataAsJiveResponse'].Body);
           return response;
        }
        return null;
    }
    
    public void createPagination(List<ResultElement> resultLis) {
        resultsToShow = new List <ResultElement>(); 
        totalRecsJIve = resultLis.size();
        if((counter+blockSize) <= totalRecsJIve){
            for(Integer i=0;i<blockSize;i++){
                resultsToShow.add(resultLis.get(i));
            }
        }else{
            for(Integer i=0;i<totalRecsJIve;i++){
                resultsToShow.add(resultLis.get(i));
            }
        }
        showPrevJive = prevJIve();
        showNextJive = nxtJive();    
    }    
    
    public List<ResultElement> parseJiveDom(List<Object> docNodesList, string type) {
        List<ResultElement> results1 = new List<ResultElement>();        
        for(Object result : docNodesList) {            
            ResultElement resultNode = new ResultElement();
            Map<String, Object> resMap = (Map<String, Object>) result;                       
            String bodyTextHighlights='';String contentType='';String friendlyDate='';String id=''; String title='';                                                
            resultNode.sfdc_id = String.valueof(resMap.get('id'));            
            resultNode.title = (string)resMap.get('subject');
            resultNode.question= (Boolean)resMap.get('question');
            resultNode.title = resultNode.title.abbreviate(80);        
            if(type=='discussion'){
                if(resultNode.question==true){
                    resultNode.typeofchannel = 'question';
                }else{
                    resultNode.typeofchannel = 'discussion';
                }
            }else resultNode.typeofchannel = type;
            resultNode.lastmodified = (string)resMap.get('updated');
            resultNode.lastmodified = resultNode.lastmodified.subString(0,10);
            Map<String, Object> map3 = (Map<String, Object>)resMap.get('resources');            
            Map<String, object> map2 = (Map<String, object>)map3.get('html');
            resultNode.URL = (string)map2.get('ref');
             
            Map<String, Object> docContent = (Map<String, Object>) resMap.get('content');
            if(docContent.containsKey('text')) {
                resultNode.summary = getShortBody((String)docContent.get('text')).abbreviate(80);
            }
            if(type=='discussion'){
                if(Question==true && resultNode.question==true){results1.add(resultNode);}
                if(Discussion==true && resultNode.question!=true){results1.add(resultNode);}
            }else{results1.add(resultNode);} 
        }                        
        return results1;    
    }
    
    //CASE SEARCH STARTED....
    public void search(DateTime dtime){  
        string tempInput = '%'+searchText+'%';
        totalRecs = [select count() from case where Subject like :tempInput AND createddate > :dtime AND Id !=: caseRecord.Id];
        system.debug('Get Next Size totalRecs===>'+totalRecs);    
        string currentCaseId = caseRecord.Id; 
        string searchquery='SELECT id, CaseNumber, Subject, Description, LastModifiedDate FROM Case WHERE (Subject LIKE \'%'+searchText+'%\' AND Createddate > :dtime AND Id !=: currentCaseId) Limit :blockSize OFFSET :index';  
        caseSearchResults = Database.query(searchquery);  
        system.debug('CASE_RESULT___'+caseSearchResults.size());
        showPrev = prev();
        showNext = nxt();     
    } 
    
    public static Integer MAX_SHORT_BODY_LENGTH = 250;
    public static String getShortBody(String body) {
        return getShortBody(body, MAX_SHORT_BODY_LENGTH);
    }    
    public static String getShortBody(String body, Integer maxCharacters) {
        if (body == null) return null;        
        integer indexOfStartTag = 0;
        integer indexOfEndTag = 0;
        string strStartTag = '<a';
        string strEndTag = '</a>';
        String shortBody = body;
        String linkBody = '';      
        if (shortBody.contains(strStartTag)) {
            indexOfStartTag = shortBody.indexOf(strStartTag);
        }
        if (shortBody.contains(strEndTag)) {
            indexOfEndTag = shortBody.indexOf(strEndTag);
        }              
        if(indexOfStartTag > -1 && indexOfEndTag > -1)
        {           
            if (indexOfStartTag < indexOfEndTag){          
                linkBody = shortBody.substring(indexOfStartTag , (indexOfEndTag + 4));
                if(linkBody.contains('<img')){
                    system.debug('imagestart');
                    linkbody = '<br>' + '<span style="float:left;padding-top:10px;">'+linkBody+'</span>';
                }
            }           
        }      
        shortBody = shortBody.replaceAll('[\r\n]+', ' ');
        shortBody = shortBody.replaceAll('<\\s*br[^>]*[/]?>', '\n'); // Temporarily convert <br> to newline character.
        shortBody = shortBody.replaceAll('</p>', '\n\n'); // Temporarily convert </p> to newline character.
        shortBody = shortBody.replaceAll('<[^>]*>?', '');
        if (shortBody.length() > maxCharacters) {
            shortBody = shortBody.substring(0, maxCharacters) + ' ...';
        }        
        if (linkBody.length() > 0) {
            shortBody += '...' + linkBody;
        }        
        shortBody = shortBody.replaceAll('\n', '<br/>');
        return shortBody;
    }
    
    //PAGINATION......
    public void jiveNext(){   
        resultsToShow.clear();
        counter=counter+blockSize;
        totalRecsJIve = results.size();
       
        if((counter+blockSize) <= totalRecsJIve ){
            for(Integer i=counter;i<(counter+blockSize);i++){
                resultsToShow.add(results.get(i));
            }
        } else{
            for(Integer i=counter;i<totalRecsJIve;i++){
                resultsToShow.add(results.get(i));
            }
        }
        showPrevJive = prevJIve();
        showNextJive = nxtJive();
    }
   
    public void JIvePrevious(){
        resultsToShow.clear();
        totalRecsJIve = results.size();
        counter=counter-blockSize;       
       
        for(Integer i=counter;i<(counter+blockSize); i++){
            resultsToShow.add(results.get(i));
        }
        showPrevJive = prevJIve();
        showNextJive = nxtJive();
    }
    
    public boolean prevJIve(){
        if(counter == 0)
        return False;
        else
        return True;
    } 
    public boolean nxtJive(){
        if((counter + blockSize) > results.size())
        return False;
        else
        return True;
    } 
    
    public void previous(){
        index = index - blockSize;
        search(dtime);
        showPrev = prev();
        showNext = nxt();
    }
   
    public void next(){
        index = index + blockSize;
        search(dtime);
        showPrev = prev();
        showNext = nxt();
    }
    
    public boolean prev(){
        if(index == 0)
        return False;
        else
        return True;
    } 
   
    public boolean nxt(){
        if((index + blockSize) > totalRecs)
        return False;
        else
        return True;
    }

}
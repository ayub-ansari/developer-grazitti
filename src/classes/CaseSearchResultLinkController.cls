/**
DESCRIPTION: THIS CLASS IS USED AS CONTROLLER TO COPY THE LINK OF JIVE CONTENT TO CASE AS COMMENT.
DEVELOPED BY: GRAZITTI
**/
public class CaseSearchResultLinkController{
    
    public Case caseRecord{get;set;}
    public CaseComment cComment {get;set;}
    public boolean commentInserted {get;set;}
    public CaseSearchResultLinkController(ApexPages.StandardController controller) {     
        String recId = ApexPages.currentPage().getParameters().get('id');
        commentInserted = false;
        if(recId.startsWithIgnoreCase('500')) {
            caseRecord = (Case)controller.getRecord();                                    
            cComment = new CaseComment(parentId = caseRecord.Id,isPublished = true);            
            if(ApexPages.currentPage().getParameters().get('artId') != NULL) {
                String articleId = ApexPages.currentPage().getParameters().get('artId'); 
                String docType = ApexPages.currentPage().getParameters().get('docType'); 
                String URL = ApexPages.currentPage().getParameters().get('URL');      
                cComment.CommentBody = 'Hi, Please review following article: '+URL;              
            } 
        } 
    }    
    
    public pagereference saveCaseComment() {        
        try {
            insert cComment;                                  
            ApexPages.Message myMsg = new ApexPages.Message(ApexPages.Severity.INFO,'Case Comment successfully added.'); 
            ApexPages.addMessage(myMsg);            
            commentInserted = true;       
        } catch(Exception ex) {
            ApexPages.addMessages(ex);
        }
        return null;    
    }
}
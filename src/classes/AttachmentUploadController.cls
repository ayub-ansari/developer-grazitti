public with sharing class AttachmentUploadController 
{
    public String parentId {get;set;}
    public Attachment attach {get;set;}
   
    public AttachmentUploadController()
    {
        attach = new Attachment();
    }
    public void UploadFile()
    {        
        //This shows how to insert an Attachment
          
         system.debug(attach+'attach===>'+parentId );
         
    }
    
    public pageReference save(){
        system.debug(attach+'attach===>'+parentId );
        return null;
    }
}
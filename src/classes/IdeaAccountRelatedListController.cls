public with sharing class IdeaAccountRelatedListController {
    
    public string ideaName{
        get{
            if(ApexPages.currentPage().getParameters().containsKey('id')) {
              Idea selectedIdea= [SELECT Title FROM Idea WHERE Id=:ApexPages.currentPage().getParameters().get('id') LIMIT 1];
              if(selectedIdea != null){ ideaName = selectedIdea.Title;}else{ideaName = '';}
            }else{
                ideaName = '';
            }
            return ideaName;
        }
        set;
    }
    
    public ApexPages.StandardSetController con {
        get {
            if(con == null) {
                con = new ApexPages.StandardSetController(Database.getQueryLocator([SELECT Id, Account__c, Idea__c, Name FROM Idea_Account__c WHERE Idea__c =:ApexPages.currentPage().getParameters().get('id') ORDER BY CreatedDate DESC LIMIT 100]));
                // sets the number of records in each page set
                con.setPageSize(20);
            }
            return con;
        }
        set;
    }
    public String deleteThis{get; set;}
    
    public List<Idea_Account__c> getAccounts() {
        return (List<Idea_Account__c>)con.getRecords();
    }
    
    
    
    public Integer gettotalRecords(){ 
            return con.getResultSize();    
    }
    
    public Integer getFromRec(){
        if(con.getPageSize() < con.getResultSize()){
           return ((con.getPageNumber() * con.getPageSize()) - con.getPageSize() + 1 );
        }
        return con.getPageNumber();
    }
    
    public Integer getToRec(){
        if((con.getPageNumber() * con.getPageSize()) > con.getResultSize()){
           return con.getResultSize();
        }
        return con.getPageNumber() * con.getPageSize();
    }

    
     public Boolean hasNext {
        get {
            return con.getHasNext();
        }
        set;
    }

    // indicates whether there are more records before the current page set.
    public Boolean hasPrevious {
        get {
            return con.getHasPrevious();
        }
        set;
    }

    // returns the page number of the current page set
    public Integer pageNumber {
        get {
            return con.getPageNumber();
        }
        set;
    }

    // returns the first page of records
     public void first() {
         con.first();
     }

     // returns the last page of records
     public void last() {
         con.last();
     }

     // returns the previous page of records
     public void previous() {
         con.previous();
     }

     // returns the next page of records
     public void next() {
         con.next();
     }

     // returns the PageReference of the original page, if known, or the home page.
  /*   public void deleteRec() {
     
        
     }*/
     public PageReference deleteRec()
        {  
         Idea_Account__c  ideaList = new Idea_Account__c(ID= deleteThis); 
         delete ideaList;
         PageReference pageRef = new PageReference('/apex/Idea_Account_RelatedList?id='+ApexPages.currentPage().getParameters().get('id') );
         pageRef.setRedirect(true);
         return pageRef;
        }


}
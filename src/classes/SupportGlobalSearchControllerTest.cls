/**
DESCRIPTION: THIS TEST CLASS COTAINS TEST CODE F0R CONTROLLER: "SupportGlobalSearchController" WHICH IS USED 
AS CONTROLLER OF "SUPPORTGLOBALSEARCH" PAGE.
DEVELOPED BY: GRAZITTI
**/
@isTest(seeAllData=true)
public class SupportGlobalSearchControllerTest{
    
    static testMethod void supportGlobalSearchController(){
        Case newCase;
        try{
            Account ac = new Account();
            ac.Name = 'Test_Account';
            ac.Type = 'Customer';
            insert ac;
            Contact con = new Contact(LastName = 'test_grzt_user', Email = 'test_grzt_user@test.com');
            insert con;
            newCase = new Case(Subject='Test_Subject', Description = 'Test_Case', ContactId = con.Id, AccountId = ac.Id);
            insert newCase;
        }catch(Exception e){
            List<Case> newCases = new List<Case>([SELECT Id FROM Case LIMIT 1]);
            if(!newCases.isEmpty()){
                newCase = newCases[0];
            }
        }
        if(newCase!= null){
            ApexPages.StandardController sc = new ApexPages.StandardController(newCase);
            SupportGlobalSearchController searchController = new SupportGlobalSearchController(sc);
            
            PageReference pageRef = Page.SupportGlobalSearch;
            pageRef.getParameters().put('id', String.valueOf(newCase.Id));
            Test.setCurrentPage(pageRef);
            searchController.jiveNext();
            if(searchController.nxt()) searchController.next();
            if(searchController.prev()) searchController.previous();
            searchController.channelType = 'DayAgo';
            searchController.searchKnowledgeRecords();
            searchController.channelType = 'MonthAgo';
            searchController.searchKnowledgeRecords();
            searchController.channelType = 'YearAgo';
            searchController.searchKnowledgeRecords();
            searchController.channelType = 'WeekAgo';
            searchController.searchKnowledgeRecords();
        }          
    }
    
    static testMethod void caseSearchResultLinkController(){
        Case newCase;
        try{
            Account ac = new Account();
            ac.Name = 'Test_Account';
            ac.Type = 'Customer';
            insert ac;
            Contact con = new Contact(LastName = 'test_grzt_user', Email = 'test_grzt_user@test.com');
            insert con;
            newCase = new Case(Subject='Test_Subject', Description = 'Test_Case', ContactId = con.Id, AccountId = ac.Id);
            insert newCase;
        }catch(Exception e){
            List<Case> newCases = new List<Case>([SELECT Id FROM Case LIMIT 1]);
            if(!newCases.isEmpty()){
                newCase = newCases[0];
            }
        }
        if(newCase!= null){
            PageReference pageRef = Page.addCaseCommentPopup;
            pageRef.getParameters().put('id', String.valueOf(newCase.Id));
            pageRef.getParameters().put('artId', '123');
            pageRef.getParameters().put('docType', 'document');
            Test.setCurrentPage(pageRef);
            ApexPages.StandardController sc = new ApexPages.StandardController(newCase);
            CaseSearchResultLinkController searchController = new CaseSearchResultLinkController(sc);
            searchController.saveCaseComment();    
            pageRef.getParameters().put('docType', 'discussion');
            searchController.saveCaseComment();    
            pageRef.getParameters().put('docType', 'post');
            searchController.saveCaseComment();      
        }          
    }

}
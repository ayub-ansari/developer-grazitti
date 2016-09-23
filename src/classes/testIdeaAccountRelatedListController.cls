@isTest
public class testIdeaAccountRelatedListController{

  static  testMethod void testMethod1(){
      Account acc = new Account(Name = 'Test Record 1');
      insert acc;
      Idea ida = new Idea(Title= 'Test Idea Record 1'); 
      insert ida;
      PageReference pf = new PageReference('/Idea_Account_RelatedList?id='+ida.Id);
      pf.setredirect(true);
  }
}
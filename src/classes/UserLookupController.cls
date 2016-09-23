public with sharing class UserLookupController {

    public List<User> usersList { get; set; }

    public String isGlobalSearch { get; set; }
    public String onDemandCaseNumber { get; set; }
    public String param { get; set; }
     
    public UserLookupController(){
        param = ApexPages.currentPage().getParameters().get('q');
        searchGo();
    }
    
    public void searchGo(){
        usersList = new List<User>([SELECT Id, Username, Name, UserRole.Name from User WHERE (Name LIKE: param OR FirstName LIKE: param OR LastName LIKE: param )]);
    }


   
}
@isTest 
private class Test_AdminExpediter {

    static testMethod void TheExpediterUserManagementController() {
        PageReference pageRef = Page.TheExpediterUserManagement;
        Test.setCurrentPage(pageRef);
        TheExpediterUserManagementController control = new TheExpediterUserManagementController();
        System.assertEquals(Userinfo.getUserId(), control.selectedUserId);
        control.searchGo();
    }
    
    static testMethod void UserLookupController() {
        PageReference pageRef = Page.UserLookup;
        Test.setCurrentPage(pageRef);
        ApexPages.currentPage().getParameters().put('q',Userinfo.getName());
        UserLookupController control = new UserLookupController();
        System.assertEquals(Userinfo.getName(), control.param);
    }
    

}
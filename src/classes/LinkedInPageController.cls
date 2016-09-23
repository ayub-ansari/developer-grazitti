public class LinkedInPageController{
    public string LinkedInUrl {get;set;}
    public string publicLinkedInUrl {get;set;}
    public boolean isLinkedIn {get;set;}
    public LinkedInPageController(){
        isLinkedIn = false;
    }
    public void viewLinkedIn(){ 
        isLinkedIn = true;
        
    }
    public PageReference feedCredential(){
        system.debug(LinkedInUrl+'00000-');
        String s1 = 'http://www.linkedin.com/pub/';
        String s = LinkedInUrl.substring(s1.length(),LinkedInUrl.length());
        pageReference page = new pageReference ('/apex/compWrapper?url='+s);
        page.setRedirect(true);
        return page;
    
    }
}
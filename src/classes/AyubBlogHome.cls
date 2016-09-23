public with sharing class AyubBlogHome {
    
    public AyubBlogHome(){
    
       
    
    }
    
    public PageReference login() {
        String startUrl = System.currentPageReference().getParameters().get('startURL');
        return Site.login('painkiller@grazitti.com', 'ayub8112', startUrl);
    }

}
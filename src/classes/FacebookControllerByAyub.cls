public Class FacebookControllerByAyub{
    public string fbscreenName {get;set;}
    public boolean isscreenNameEmpty {get;set;}
    public FacebookProfile fbProfileInfo{get;set;}
    public FacebookControllerByAyub(){
        isscreenNameEmpty = true;
     }
    public pageReference viewFBTimeLine(){
        String fbId = '';String screenName = ''; String userName = '';String link = '';String locale = '';String gender = '';
        /**
        *  json data retrieved from facebook
           "id": "100001458293347",
           "name": "Painkiller Ayub",
           "first_name": "Painkiller",
           "last_name": "Ayub",
           "link": "http://www.facebook.com/ayubshahjada",
           "username": "ayubshahjada",
           "gender": "male",
           "locale": "en_US"
       *
       **/
        
        isscreenNameEmpty = false;
        system.debug(fbscreenName +'screenName==');
        String profileInfo = getProfileInfo('https://graph.facebook.com/'+fbscreenName );
        JSONParser parser = JSON.createParser(profileInfo);
        while (parser.nextToken() != null) {
              system.debug(parser.getText()+'test--'+parser.getCurrentName());
              if(parser.getCurrentName()!= null && parser.getCurrentName()!= parser.getText() && parser.getCurrentName()=='id'){
                  fbId = parser.getText();
                  
              }else
              if(parser.getCurrentName()!= null && parser.getCurrentName()!= parser.getText() && parser.getCurrentName()=='name'){
                  screenName = parser.getText(); 
                  
              }else
              if(parser.getCurrentName()!= null && parser.getCurrentName()!= parser.getText() && parser.getCurrentName()=='username'){
                  userName = parser.getText(); 
                  
              }else  
              if(parser.getCurrentName()!= null && parser.getCurrentName()!= parser.getText() && parser.getCurrentName()=='gender'){
                  gender = parser.getText();
                  
              }else
              if(parser.getCurrentName()!= null && parser.getCurrentName()!= parser.getText() && parser.getCurrentName()=='locale'){
                  locale = parser.getText();
                  
              }else
              if(parser.getCurrentName()!= null && parser.getCurrentName()!= parser.getText() && parser.getCurrentName()=='link'){
                  link = parser.getText(); 
                  
              }
                
        }
       
        fbProfileInfo = new FacebookProfile(fbId,screenName,userName,link,locale,gender);
        system.debug(fbProfileInfo+'fbProfileInfo--1');
        return null;
    }
    public String getProfileInfo(String url) {
        Http h = new Http();
        HttpRequest req = new HttpRequest();
        req.setEndpoint(url);
        req.setMethod('GET');
        HttpResponse res = h.send(req);
        return res.getBody();
     }
     public class FacebookProfile{
         public String fbId {get;set;}
         public String screenName {get;set;}
         public String userName {get;set;}
         public String link {get;set;}
         public String locale {get;set;}
         public String gender {get;set;}
         public FacebookProfile(String fbId,String screenName, String userName, String link, String locale, String gender ){
             this.fbId = fbId  ;
             this.screenName = screenName ;
             this.userName   =   userName;
             this.link       = link ;
             this.locale     = locale ;
             this.gender     = gender ;
         }
    }
}
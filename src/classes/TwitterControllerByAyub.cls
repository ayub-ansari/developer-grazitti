public class TwitterControllerByAyub{
    
    public string screenName {get;set;}
    public boolean isscreenNameEmpty {get;set;}
    
    public TwitterControllerByAyub(){
        isscreenNameEmpty = true;
    
    }
    public pageReference viewTwitterTimeLine(){
        isscreenNameEmpty = false;
        return null;
    }
}
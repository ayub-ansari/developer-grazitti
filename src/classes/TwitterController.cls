public class TwitterController {

    public String username { get; set; }
    public String password { get; set; }
    public String newUpdateText { get; set; }
    
    public void login(){
        system.debug(username+'info=='+password );
        TwitterForce tf = new TwitterForce(username, password);
    }
    
    public Boolean getNeedsLogin() {
        return username == null || username.length() == 0;
    } 
    
    public Boolean getHasLogin() {
        return ! getNeedsLogin();
    }
    
    public List<TwitterStatus> getFriendsTimeline() {
        if (getNeedsLogin())
            return new TwitterStatus[0];
        system.debug(username+'user----'+password);    
        TwitterForce tf = new TwitterForce(username, password);
        return tf.friendsTimeline();
    }
    
    public void postUpdate() {
        if (newUpdateText.length() > 0) {
            TwitterForce tf = new TwitterForce(username, password);
            TwitterStatus s = tf.postUpdate(newUpdateText, null);
            System.debug(s);
        }
    }
}
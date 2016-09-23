public Class sendHttpRequest{
    public sendHttpRequest(){

        string encodedURL = 'https://api.twitter.com/1.1/statuses/mentions_timeline.json?count=2&since_id=14927799&OAuth oauth_consumer_key=Hi7CYhTDKnV1Pb1PrJGA&oauth_nonce=a7efa05ce8e699867bf6f6fd471b5ee9&oauth_signature=4zqnvNtln9JSYkKOmPkYyN93FsU%3D&oauth_signature_method=HMAC-SHA1&oauth_timestamp=1381427313&oauth_token=1918984873-mgmMZPlPwScX4ClIUREsmlfB5Cnr0n3sAlCe8hq&oauth_version=1.0';
        HTTPResponse response;
        HttpRequest req  = new HttpRequest();
        req.setEndPoint(encodedURL);
        req.setMethod('GET');
        Http http = new Http();
        if (!Test.isRunningTest())
            response  = http.send(req);
        system.debug(response);
        }
        
}
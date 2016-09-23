public class GlobalWrapper {

    public class Emailalert {
        public string Id;
        public MetadataInfo Metadata;
        Attribute attributes;
        public string TableEnumOrId;
        public Emailalert (){
            id = '';
            Metadata = new MetadataInfo ();
            TableEnumOrId = '';
        }
    }
    
    public class Attribute {
        string type;
        string url;
        public Attribute (){
            type='';
            url='';
        }
    }
    
    public class MetadataInfo {
        List<string> ccEmails;
        public string description;
        boolean protectedMode; 
        public List<Recipient> recipients;
        string senderAddress;
        string senderType;
        string template;
        string urls;
        public MetadataInfo (){
            ccEmails = new List<string>();
            description = '';
            protectedMode = false; 
            recipients= new List<Recipient>();
            senderAddress ='';
            senderType = '';
            template = '';
            urls = '';           
        }
    }
    
    public class Recipient {
        string field;
        public string recipient;
        public string type;
        public Recipient (){
        
        }
    }

}
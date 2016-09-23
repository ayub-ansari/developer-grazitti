public class LightningController {
	@AuraEnabled
    public static List<Contact> getContacts(){        
        return [select id, name from Contact limit 20];
    }
}
trigger findduplicates on Lead (before update) {
  Map<String, Lead> leadMap = new Map<String, Lead>();
  List<Duplicate_Lead__c> dups = new List<Duplicate_Lead__c>();
  Boolean isError = false;
    for (Lead lead : System.Trigger.new) {
       
        // Make sure we don't treat an email address that 
        // isn't changing during an update as a duplicate. 
   
        if (lead.Email != null) {
           Duplicate_Lead__c dup= new Duplicate_Lead__c ();
           dup.First_Name__c = lead.FirstName;
           dup.Email__c = lead.Email;      
          
           dups.add(dup); 
          isError = true;
           //lead.Email.addError('Another new lead has the same email address.');
         }
    }
    MyFutureClass.insertrec();
     
     if(isError ){
        // System.Trigger.new[0].Email.addError('Another new lead has the same email address.');
     }

}
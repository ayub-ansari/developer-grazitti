global class MyFutureClass {


    @future
    public static void insertrec(){
    
        Duplicate_Lead__c dup= new Duplicate_Lead__c ();
           dup.First_Name__c = 'ayub';
           insert dup;
    }
}
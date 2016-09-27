/**
THIS CLASS IS NAVIGATOR- TAKES EACH EVENT FROM TRIGGER AND DELEGATES TO AN APPROPRIATE EXECUTOR.
DESIGNED BY: GRAZITTI
DEVELOPER ISNTRUCTIONS:
1. TRY TO KEEP YOUR LOGIC IN MASTER LOOP. AVOID NEW LOOP ADDITION.
2. CREATE A HELPER METHOD TO HANDLE THE LOGICS
3. DO NOT ADD ANY NEW DML OPERATION- TRY TO ADD DATA TO BI MANUPLATE IN EXISTING DMLs.
4. DO NOT ADD ANY SOQL REDUNDANTLY
**/

public class Account_MainTriggerHandler {
    //integration tetsin.....
    public static boolean isBeforeInsertHandler = False;
    public static boolean isBeforeUpdateHandler = False;
    public static boolean isBeforeDeleteHandler = False;
    public static boolean isAfterInsertHandler = False;
    public static boolean isAfterUpdateHandler = false;
    public static boolean isAfterDeleteHandler = False;
    
    public static void isBeforeInsertHandler(List<Account> newList, Map<Id, Account> newMap){
        if(!Account_MainTriggerHandler.isBeforeInsertHandler){
            
            Account_MainTriggerHandler.isBeforeInsertHandler = True;
        }
    }
    
    public static void isBeforeUpdateHandler(List<Account> newList, Map<Id, Account> newMap, List<Account> oldList, Map<Id, Account> oldMap){
        if(!Account_MainTriggerHandler.isBeforeUpdateHandler){
            
            Account_MainTriggerHandler.isBeforeUpdateHandler = True;
        }
    }
    
    public static void isBeforeDeleteHandler(List<Account> newList, Map<Id, Account> newMap){
        if(!Account_MainTriggerHandler.isBeforeDeleteHandler){
            
            Account_MainTriggerHandler.isBeforeDeleteHandler = True;
        }
    }
    
    public static void isAfterInsertHandler(List<Account> newList, Map<Id, Account> newMap){
        if(!Account_MainTriggerHandler.isAfterInsertHandler){
            
            Account_MainTriggerHandler.isAfterInsertHandler = True;
        }
    }
    
    public static void isAfterUpdateHandler(List<Account> newList, Map<Id, Account> newMap, List<Account> oldList, Map<Id, Account> oldMap){
        if(!Account_MainTriggerHandler.isAfterUpdateHandler){
            List<account>  accs = new List<account>();
            for(Account ac :newList){
             Account acccc = new Account(id=ac.id);
                 accs.add(acccc);
            }
            update accs;
            
            Account_MainTriggerHandler.isAfterUpdateHandler = false;
        }
    }
    
    public static void isAfterDeleteHandler(List<Account> newList, Map<Id, Account> newMap){
        if(!Account_MainTriggerHandler.isAfterDeleteHandler){
            
        }
    }
}

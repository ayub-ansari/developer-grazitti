/**
GOAL OF THIS TRIGGER IS TO CONSOLIDATE ALL TRIGGERS INTO SINGLE ONE. 
THIS TRIGGER WILL BE LOGIC LESS, EVENT DRIVEN ONLY. ALL LOGIC WILL WILL BE PERFORMED IN
CORRESPONDING HANDLER AND HELPER ROUTINS.
**PLEASE DO NOT CREATE ANY OTHER TRIGGER, ADD YOUR LOGIC IN HANDLER AND HELPER.
DESIGNED BY: GRAZITTI 
**/
trigger Account_MAIN_Trigger on Account (before insert, before update, before delete, after insert, after update, after delete){
    if(trigger.isBefore){
        /****** HANDLES ALL BEFORE EVENTS ******/
        if(trigger.isInsert){
            /****** HANDLES ALL THE BEFORE INSERT EVENTS ******/
           // Account_MainTriggerHandler.isBeforeInsertHandler(trigger.new , trigger.newMap);
        }else if(trigger.isUpdate){
            /****** HANDLES ALL THE BEFORE UPDATE EVENTS ******/
           // Account_MainTriggerHandler.isBeforeUpdateHandler(trigger.new , trigger.newMap, trigger.old, trigger.oldMap);
        }else {
            /****** HANDLES ALL THE BEFORE DELETE EVENTS ******/
           // Account_MainTriggerHandler.isBeforeDeleteHandler(trigger.new , trigger.newMap);
        }   
    }else if(trigger.isAfter){
        /****** HANDLES ALL AFTER EVENTS ******/
        if(trigger.isInsert){
            /****** HANDLES ALL THE AFTER INSERT EVENTS ******/
          //  Account_MainTriggerHandler.isAfterInsertHandler(trigger.new , trigger.newMap);
        }else if(trigger.isUpdate){
            /****** HANDLES ALL THE AFTER UPDATE EVENTS ******/
            Account_MainTriggerHandler.isAfterUpdateHandler(trigger.new , trigger.newMap, trigger.old, trigger.oldMap);
        }else {
            /****** HANDLES ALL THE AFTER DELETE EVENTS ******/
          //  Account_MainTriggerHandler.isAfterDeleteHandler(trigger.new , trigger.newMap);
        }
    }
}
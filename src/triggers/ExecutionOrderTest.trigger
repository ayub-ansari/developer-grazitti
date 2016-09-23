trigger ExecutionOrderTest on Case (before insert, after insert, before update, after update ) {
    
    for(Case c : trigger.new){
        if(trigger.isInsert){
            system.debug(c.status+'<=INSERT=>');
        }else
        if(trigger.isUpdate){
            if(trigger.isBefore){
                system.debug(c.status+'<=new=isBefore=old=>'+trigger.oldMap.get(c.Id).status);
                c.status = 'Woking';
            }else{
                
                system.debug(c.status+'<=new=isAfter==old=>'+trigger.oldMap.get(c.Id).status);
               /* c.status = 'Escalated';*/
            }
        }
    }

}
trigger OpptyTrigger on Opportunity (after update) {
    for(Opportunity o :trigger.new){
       system.debug(o.opportunityLineItems);
    }
}
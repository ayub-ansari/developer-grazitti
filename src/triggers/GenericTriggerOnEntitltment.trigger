trigger GenericTriggerOnEntitltment on Entitlement (after insert, after update) {
    
    for(Entitlement ent : trigger.new){
        system.debug('After Update'+ent.status);
    }
}
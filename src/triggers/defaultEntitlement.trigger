trigger defaultEntitlement on Entitlement (after insert) {

        Map<string, string> entWithacmap = new Map<string, string>();
        
        for(Entitlement ent: trigger.new){
            if(ent.AccountId!= null){//PUT OTHER LOGIC IF YOU WANT
                entWithacmap.put(ent.Id, ent.AccountId);
            }
        }
        
        if(entWithacmap.isEmpty()) return;
        
        List<Entitlement> updateList = new List<Entitlement>();
        
        for(Entitlement ent: [SELECT Id, EndDate FROM Entitlement WHERE Id NOT IN: entWithacmap.keySet() AND AccountId IN: entWithacmap.values()]){
           
            ent.EndDate = Date.today().addDays(-1);//put your logic 
            updateList.add(ent);
        }
        
        if(!updateList.isEmpty()) update updateList;
        
        
    
    }
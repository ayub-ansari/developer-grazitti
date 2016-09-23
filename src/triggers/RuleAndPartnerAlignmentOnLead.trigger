trigger RuleAndPartnerAlignmentOnLead on Lead ( before insert, before update ) {
    
   
    Map<String, LeadRouting__c> leadAssigRuleMap = new Map<String, LeadRouting__c>();
    Map<String,List<LeadRouting_PartnerAccount__c>> rulePartnerMap = new Map<String,List<LeadRouting_PartnerAccount__c>>();
    List<LeadRouting_PartnerAccount__c> rulePartnersList = new List<LeadRouting_PartnerAccount__c>(); 
    if( LeadMDTriggersUtil.runOnce() ){ //ignore if Trigger is invoked more than one time
       
       set<String> cities = new set<String>();
       set<String> countries = new set<String>();
       set<String> states = new set<String>();
       for(Lead lead :Trigger.new ){
        cities.add(lead.Address_City__c);
        countries.add(lead.Address_Country__c);
        states.add(lead.Address_State__c);
       }
       
       Map<String,LeadRouting__c> leadRoutingMap = new Map<String,LeadRouting__c>();
       
       for(LeadRouting__c lr : [select City__c, Country__c, State__c,Default_Owner__c,(select Order__c,Partner__c,Ready_To_Assign__c from LeadRouting_PartnerAccount__r order by Order__c Asc) from LeadRouting__c where City__c IN : cities AND Country__c IN :countries AND State__c IN : states]){
            leadRoutingMap.put(lr.Country__c+''+lr.State__c+''+lr.City__c,lr);
       }
       
       for(Lead lead : Trigger.new ) {
            String addressComplete = lead.Address_Country__c+''+lead.Address_State__c+''+lead.Address_City__c;
            String adressWithoutCity = lead.Address_Country__c+''+lead.Address_State__c;
            String adressWithoutState = lead.Address_Country__c;
            if(leadRoutingMap.containskey(addressComplete)){
                leadAssigRuleMap.put(lead.Id,leadRoutingMap.get(addressComplete));
            }else if(leadRoutingMap.containskey(adressWithoutState)){
                leadAssigRuleMap.put(lead.Id,leadRoutingMap.get(adressWithoutState));
            }else if(leadRoutingMap.containskey(adressWithoutCity)){
                leadAssigRuleMap.put(lead.Id,leadRoutingMap.get(adressWithoutCity));
            }else{
                //default
            }
       }
       /**** Step 1: Check for the appropriate Assignment Rule Definition -end ****/
        
        for( Lead ld : Trigger.new ) {
            
            Integer index ;
            if( leadAssigRuleMap != null && leadAssigRuleMap.containsKey(ld.Id)) {
                List<LeadRouting_PartnerAccount__c> assRuleUsersTemp = new List<LeadRouting_PartnerAccount__c>();
                LeadRouting__c rule = leadAssigRuleMap.get(ld.Id);
                ld.LeadRouting__c = rule.Id;
                
                if( rulePartnerMap != null && rulePartnerMap.containsKey(rule.Id) ) {
                    assRuleUsersTemp.addAll(rulePartnerMap.get(rule.Id));
                }else {
                    rulePartnerMap.put( rule.Id, rule.LeadRouting_PartnerAccount__r );
                    assRuleUsersTemp.addAll(rule.LeadRouting_PartnerAccount__r );
                }
                
               if(trigger.isUpdate){
                
                    if( assRuleUsersTemp.size() == 0) { 
                    
                    }else {                        
                        index = 0;
                        for( LeadRouting_PartnerAccount__c assig : assRuleUsersTemp ) {
                            if(assig.Ready_To_Assign__c) break; 
                            index++;
                        }   
                        if( index+1 > assRuleUsersTemp.size() ) {
                            index = 0;
                        }
                        LeadRouting_PartnerAccount__c firstPartner = assRuleUsersTemp[index];
                       system.debug(ld.OriginalRank__c +'order==='+firstPartner.order__c);
                       if(ld.OriginalRank__c == firstPartner.order__c){
                            ld.PartnerAssignment__c = null;
                            if (rule.Default_Owner__c != null) { ld.OwnerId = rule.Default_Owner__c; }
                            index++;
                            if( index == assRuleUsersTemp.size()) { index = 0;}
                            assRuleUsersTemp[index].Ready_To_Assign__c = true;
                            rulePartnerMap.put( rule.Id,assRuleUsersTemp );
                        }else{
                            ld.PartnerAssignment__c = firstPartner.Partner__c;
                            firstPartner.Ready_To_Assign__c = false;
                            index++;
                            if( index == assRuleUsersTemp.size()) { index = 0;}
                            assRuleUsersTemp[index].Ready_To_Assign__c = true;
                            rulePartnerMap.put( rule.Id,assRuleUsersTemp );
                         }                         
                    }
                }else{
                if(trigger.isInsert){
                    if( assRuleUsersTemp.size() == 0 ) { 
                       //question
                    }else    
                    if( assRuleUsersTemp.size() == 1 ){
                        ld.PartnerAssignment__c = assRuleUsersTemp[0].Partner__c;
                        ld.OriginalRank__c = assRuleUsersTemp[0].Order__c;
                        assRuleUsersTemp[0].Ready_To_Assign__c = true;
                        rulePartnerMap.put( rule.Id,assRuleUsersTemp );
                    }else {
                        index = 0;
                        for( LeadRouting_PartnerAccount__c assig : assRuleUsersTemp ) {
                            if(assig.Ready_To_Assign__c) break; 
                            index++;
                        }
                        if( index+1 > assRuleUsersTemp.size() ) {index = 0;}
                        LeadRouting_PartnerAccount__c firstPartner = assRuleUsersTemp[index];
                        ld.PartnerAssignment__c = firstPartner .Partner__c;
                        ld.OriginalRank__c = firstPartner.Order__c;
                        firstPartner.Ready_To_Assign__c = false;
                        index++;
                        if( index == assRuleUsersTemp.size()) { index = 0;}
                        assRuleUsersTemp[index].Ready_To_Assign__c = true;
                        rulePartnerMap.put( rule.Id,assRuleUsersTemp );
                    }
            
                }
                }
            }else{
               //default rule
            } 
        }
           
        if( !rulePartnerMap.isEmpty() ) {
            for( String str :rulePartnerMap.keySet() ) rulePartnersList.addAll( rulePartnerMap.get(str));
        }        
        
       try{
         update rulePartnersList;
        }catch(Exception e){
            
        }  
        
    }  

}
public class Create_WorkOrderLineItem {
    
    public list<wrapperdemo> assetWrapper  {get; set;}
    public list<asset> assetList{get;set;}
    public list<asset> relatedAsset{get;set;}
    
    set<Id> parentAssetId = new set<Id>(); 
    public Create_WorkOrderLineItem(ApexPages.StandardController controller) {
        showAsset();
    }
    
    public class wrapperdemo{ 

        public boolean mycheckbox{get;set;}
        public asset assetWrapper{get; set;}
    
          public wrapperdemo(asset asset){
          assetWrapper = asset ;
          mycheckbox=false;
            }
       } 
    
    public void showAsset() {
    
       string accId =ApexPages.currentPage().getParameters().get('AccountId');
       string workOrderId =ApexPages.currentPage().getParameters().get('newid');
       string AssetId =ApexPages.currentPage().getParameters().get('AssetId');
       
       system.debug('helloooo'+accId+'hiiiii'+workOrderId +'hellooo'+AssetId );
        
       string searchResult;
       assetWrapper  = new List<wrapperdemo>();
       relatedAsset= new List<asset>();
       searchresult = 'select Id,name,Product2.name,parent.name,rootAsset.name from asset ';
       
        if(AssetId == null){
            searchResult += 'where AccountId =: accId'; 
        }else{
          searchResult +=  'where Id =: AssetId'  ;
        }
       assetList = Database.query(searchResult);
        
           for (asset asset: assetList) {
                assetWrapper.add(new wrapperdemo(asset));
                if(asset.ParentId != null && !parentAssetId.contains(asset.ParentId )){
                   parentAssetId.add(asset.ParentId);  
                }else{
                    if(asset.rootAssetId != null && !parentAssetId.contains(asset.rootAssetId)){
                       parentAssetId.add(asset.rootAssetId);  
                    }
                }    
                 
           }
           
       system.debug('parentAssetId '+parentAssetId );    
       if(!parentAssetId.IsEmpty()){
         relatedAsset =  Database.query('select Id,name,Product2.name,parent.name from asset where Id IN: parentAssetId '); 
       }    
           for (asset asset2: relatedAsset) {
                assetWrapper.add(new wrapperdemo(asset2));   
           }
           
    }
       
     
}
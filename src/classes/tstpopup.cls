public class tstpopup {     

    public boolean displayPopup {get; set;}    
    public string productCode  {get; set;}  
    public tstpopup(){
         displayPopup = true;
    }
    public void closePopup() {        
        displayPopup = false;    
    }     
    public void showPopup() { 
           
        displayPopup = true;    
    }
    
  }
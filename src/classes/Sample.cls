public class Sample
{   
    public String empId;
    public Account emp {get;set;}
    
    public Sample()
    {

    }
    
    public void fetch()
    {
        empId = Apexpages.currentpage().getparameters().get('eid');
        emp = [SELECT Name FROM Account WHERE ID =: empId];
    }    

}
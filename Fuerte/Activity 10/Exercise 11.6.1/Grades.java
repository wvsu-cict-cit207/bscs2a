// Activity 10
// Exercise 11.6.1 - "Extending Student Record"
// @author Maria Arlyn R. Fuerte (BSCS 2A)

public class Grades extends StudentRecords{
    
    protected double AI_Grade;
    protected double DM_Grade;
    protected double OOP_Grade;
    protected double DSA_Grade;
    protected double Average_Grade;

    public Grades(double AI_Grade, double DM_Grade, double OOP_Grade, double DSA_Grade){
        this.AI_Grade = AI_Grade;
        this.DM_Grade = DM_Grade;
        this.OOP_Grade = OOP_Grade;
        this.DSA_Grade = DSA_Grade;
    }
    
    public void setAI_Grade (double temp){
        AI_Grade = temp;
    }
    
    public void setDM_Grade (double temp){
        DM_Grade = temp;
    }
    
    public void setOOP_Grade (double temp){
        OOP_Grade = temp;
    }
    
    public void setDSA_Grade (double temp){
        DSA_Grade = temp;
    }  
}

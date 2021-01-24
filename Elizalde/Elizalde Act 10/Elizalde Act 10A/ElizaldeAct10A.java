class StudentRecord{
    protected String name;
    protected int age;
    protected String idNo;
    protected String address;
    protected double PE113Grade;
    protected double SS111Grade;
    protected double SS112Grade;
    protected double HUM110Grade;
    public StudentRecord(){
       
    }
    public StudentRecord(String name, int age, String idNo, String address){
        this.name = name;
        this.age = age;
        this.idNo = idNo;
        this.address = address;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getIdNo(){
        return this.idNo;
    }
    public String getAddress(){
        return this.address;
    }
    public double getPE113Grade(){
        return this.PE113Grade;
    }
    public double getSS111Grade(){
        return this.SS111Grade;
    }
    public double getSS112Grade(){
        return this.SS112Grade;
    }
    public double getHUM110Grade(){
        return this.HUM110Grade;
    }
    public void setGrade(double PE113Grade, double SS111Grade, double SS112Grade, double HUM110Grade){
        this.PE113Grade = PE113Grade;
        this.SS111Grade = SS111Grade;
        this.SS112Grade = SS112Grade;
        this.HUM110Grade = HUM110Grade;
    }
    public void StudentRecord(){
        System.out.println("Name: "+ getName());
        System.out.println("Age: "+ getAge());
        System.out.println("ID Number: "+ getIdNo());
        System.out.println("Address: "+ getAddress());
        System.out.println("PE 113 Grade: "+ getPE113Grade());
        System.out.println("SS 111 Grade: "+ getSS111Grade());
        System.out.println("SS 112 Grade: "+ getSS112Grade());
        System.out.println("HUM 110 Grade: "+ getHUM110Grade());   
    }
}

class CSStudent extends StudentRecord{
    protected String specialization;
    protected double CIT207Grade;
    protected double CCS246Grade;
    protected double CCS223Grade;
    protected double CC204Grade;
    public CSStudent(){
 
    }
    public CSStudent(String name, int age, String idNo, String address, String specialization){
        super(name, age, idNo, address);
        this.specialization = specialization;        
    }
    public String getSpecialization(){
        return this.specialization;
    }
    public double getCIT207Grade(){
        return this.CIT207Grade;
    }
    public double getCCS246Grade(){
        return this.CCS246Grade;
    }
    public double getCCS223Grade(){
        return this.CCS223Grade;
    }
    public double getCC204Grade(){
        return this.CC204Grade;
    }
    public void setGrade(double PE113Grade, double SS111Grade, double SS112Grade, double HUM110Grade, double CIT207Grade, double CCS246Grade, double CCS223Grade,double CC204Grade){
        super.PE113Grade = PE113Grade;
        super.SS111Grade = SS111Grade;
        super.SS112Grade = SS112Grade;
        super.HUM110Grade = HUM110Grade;
        this.CIT207Grade = CIT207Grade;
        this.CCS246Grade = CCS246Grade;
        this.CCS223Grade = CCS223Grade;
        this.CC204Grade = CC204Grade;    
    }
    @Override
    public void StudentRecord(){
        System.out.println("Name: "+ getName());
        System.out.println("Age: "+ getAge());
        System.out.println("ID Number: "+ getIdNo());
        System.out.println("Address: "+ getAddress());
        System.out.println("Specialization: "+ getSpecialization());
        System.out.println("PE 113 Grade: "+ getPE113Grade());
        System.out.println("SS 111 Grade: "+ getSS111Grade());
        System.out.println("SS 112 Grade: "+ getSS112Grade());
        System.out.println("HUM 110 Grade: "+ getHUM110Grade()); 
        System.out.println("CIT 207 Grade: "+ getCIT207Grade()); 
        System.out.println("CCS 246 Grade: "+ getCCS246Grade()); 
        System.out.println("CCS 223 Grade: "+ getCCS223Grade());
        System.out.println("CC 204 Grade: "+ getCC204Grade());
    }
}
public class ElizaldeAct10A {
    public static void main(String[] args) {
        //sample record
        CSStudent csstudent;
        csstudent = new CSStudent("Glecy Elizalde", 19, "2019M0283", "Iloilo City, Iloilo", "Artificial Intelligence");
        csstudent.setGrade(1.5, 2.5, 3.0, 3.2, 1.25, 2.0, 3.0, 2.75);
        csstudent.StudentRecord();
    }    
}

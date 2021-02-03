package InheritanceAndPolymorphism;

public class StudentRecord {
    protected String name;
    protected String address;
    //protected String programmingLanguage;
    //protected String specialization;
    protected int age;
    //protected double programmingGrade;
    protected double mathGrade;
    protected double englishGrade;
    protected double scienceGrade;
    protected double average;
    protected static int studentCount;

    public StudentRecord(){        
        name = "";
        address = "";
        age = 0;
        mathGrade = 0;
        englishGrade = 0;
        scienceGrade = 0;
        average = 0;
    }

    public StudentRecord(String n, String m_add, int m_age, double mGrade, double eGrade, double sGrade){
        name =n;
        address = m_add;
        age = m_age;
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;    
    }
    public String getName(){
        return name;
    }
  
    public void setName( String name ){
        this.name = name ;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress( String address){
        this.address = address;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge( int age){
        this.age = age;
    }
    
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade( double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public double getEnglishGrade(){
        return englishGrade;
    }
    
    public void setEnglishGrade( double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public double getScienceGrade(){
        return scienceGrade;
    }
    
    public void setScienceGrade( double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    public double getAverage(){
        double result = 0;
        result = ( mathGrade+englishGrade+scienceGrade )/3;
        return result;
    } 
    
    public static int getStudentCount(){
        return studentCount;
    }
    
    public void display(){
        System.out.println("STUDENT RECORD");
        System.out.println("Name: " + getName());
        System.out.println("Address: " +getAddress());
        System.out.println("Age: " +getAge());
        System.out.println("Math Grade: " +getMathGrade());
        System.out.println("English Grade: " +getEnglishGrade());
        System.out.println("Science Grade: " + getScienceGrade());
        System.out.println("Average: " +getAverage());
        System.out.println("--------\n");
 
    }
}

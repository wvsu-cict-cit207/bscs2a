//11.6.1 Extending StudentRecord
package studentrecord;

class StudentRecord {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String specialization;
    protected String idNumber;
    
    public StudentRecord(String firstName, String lastName, int age, String specialization, String idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.specialization = specialization;
        this.idNumber = idNumber;
    }
    
    public String getfullName() {
        return this.firstName + " " + this.lastName;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public String getSpecialization() {
        return this.specialization;
    }
    
    public String getidNumber() {
        return this.idNumber;
    
    }
    
     public void StudentRecord() {
        System.out.println("Name: " + getfullName());
        System.out.println("Age: " + getAge());
        System.out.println("Specialization: " + getSpecialization());
        System.out.println("ID Number: " + getidNumber());
        System.out.println();
        
    }
}

class BSCS2A extends StudentRecord {
    public BSCS2A(String firstName, String lastName, int age, String specialization, String idNumber){
        super(firstName, lastName, age, specialization, idNumber);
    }
    
    @Override
    public void StudentRecord() {
        System.out.println("Name: " + getfullName());
        System.out.println("Age: " + getAge());
        System.out.println("Specialization: " + getSpecialization());
        System.out.println("ID Number: " + getidNumber());
        System.out.println("Passed");
        System.out.println();
    }
}

class BSCS2B extends StudentRecord{
    public BSCS2B(String name, String address, int age, String specialization, String idNumber){
        super(name, address, age, specialization, idNumber);
    }
    
    @Override
    public void StudentRecord() {
        System.out.println("Name: " + getfullName());
        System.out.println("Age: " + getAge());
        System.out.println("Specialization: " + getSpecialization());
        System.out.println("ID Number: " + getidNumber());
        System.out.println("Failed");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        BSCS2A a = new BSCS2A("Joshreen", "Reyes", 21, "HPC", "2019M0202");
        BSCS2B b = new BSCS2B("Silver", "Bullet", 20, "AI", "2019M0134");
        
        StudentRecord[] studentArray = {a, b};
        
        for(StudentRecord stud : studentArray){
            stud.StudentRecord();
        }
    }       
}
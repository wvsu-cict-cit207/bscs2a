//Extending student record


class Student {
    protected String name;
    protected int age;
    protected String idNumber;

    protected void lang(){
        System.out.println("All students love the enlish language");
    }


    public Student(String name, int age, String idNumber){
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;

    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getidNumber(){
        return this.idNumber;
    }


    public void StudentRecord(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID Number: " + getidNumber());
        System.out.println();

        }
    }


class BSCS extends Student{
    public BSCS(String name, int age, String idNumber){
        super(name, age, idNumber);
    }

    public void StudentRecord(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("ID Number: " + getidNumber());
        System.out.println();

        }
    
        //overriding method
        public void lang(){
            System.out.println("Computer science students love the Java language.");
        }

    }


public class StudentRecord{
    public static void main(String[] args) {
        BSCS stud = new BSCS("Carla Temporosa", 20, "2019M0413");

        Student[] studentArray = {stud};

        for(Student student : studentArray){
            student.StudentRecord();
            
        Student obj1 = new BSCS(null, 0, null);
        obj1.lang();

        }
    }
}


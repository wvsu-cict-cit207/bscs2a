package activity10;

public class StudentRecord {

    protected String name;
    protected String address;
    protected int age;
    protected double mathGrade;
    protected double englishGrade;
    protected double scienceGrade;
    protected static int studentCount;

    public StudentRecord() {
    }
    
    

    public StudentRecord(String name, String address, int age, double mathGrade, double englishGrade, double scienceGrade, double average) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }


    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        StudentRecord.studentCount = studentCount;
    }
    
    

   

}

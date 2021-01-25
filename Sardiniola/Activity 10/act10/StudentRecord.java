package act10;

public class StudentRecord {

    protected String name;
    protected String address;
    protected int age;
    protected double mathGrade;
    protected double englishGrade;
    protected double scienceGrade;
    protected double average;
    protected static int studentCount;

    StudentRecord() {
        studentCount++;
    }
    
    StudentRecord(String name, String address, int age, double mathGrade, double englishGrade, double scienceGrade) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
        studentCount++;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getAge () {
        return age;
    }
    public double getMathGrade() {
        return mathGrade;
    }
    public double getEnglishGrade() {
        return englishGrade;
    }
    public double getScienceGrade() {
        return scienceGrade;
    }
    
    public double getAverage() {
        double result = (mathGrade + englishGrade + scienceGrade) / 3;
        return result;
    }
    public void setName(String temp) {
        name = temp;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }
    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }
    public void setScienceGradde(double scienceGrade) {
        this.scienceGrade  = scienceGrade;
    }
    public static int getStudentCount() {
        return studentCount;
    }
}

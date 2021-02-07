public class StudentRecord {

    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;


    public StudentRecord()
    {
        name = "";
        address = "";
        age = 0;
        mathGrade = 0;
        englishGrade = 0;
        scienceGrade = 0;
    }
   public StudentRecord(String name, String address, int age, double mathGrade, double englishGrade, double scienceGrade) {
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

    public double getEnglishGrade() {
        return englishGrade;
    }


    public void setEnglishGrade(double englishGrade) {
        this.englishGrade = englishGrade;
    }


    public double getMathGrade() {
        return mathGrade;
    }


    public void setMathGrade(double mathGrade) {
        this.mathGrade = mathGrade;
    }

 
    public double getScienceGrade() {
        return scienceGrade;
    }

 
    public void setScienceGrade(double scienceGrade) {
        this.scienceGrade = scienceGrade;
    }


    public double getAverage() {
        return (mathGrade + englishGrade + scienceGrade) / 3;
    }


}

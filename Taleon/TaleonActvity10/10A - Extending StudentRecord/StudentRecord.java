public class StudentRecord {
    protected String name;
    protected String address;
    protected int age;
    protected double mathGrade;
    protected double englishGrade;
    protected double scienceGrade;
    protected double average;

    private static int studentCount;

    public StudentRecord() {
        studentCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String temp) {
        name = temp;
    }

    public double getAverage() {
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade) / 3;

        return result;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public void setMathGrade(double grade) {
        mathGrade = grade;
    }

    public void setEnglishGrade(double grade) {
        englishGrade = grade;
    }

    public void setScienceGrade(double grade) {
        scienceGrade = grade;
    }
}

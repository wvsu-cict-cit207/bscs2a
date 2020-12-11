public class ComputerScienceStudentRecord extends StudentRecord {

    private String rfidCode; //Computer Science students have an associated rfid code with their identity for their college.
    private double programmingGrade;
    private double aiGrade;
    private double dataStructuresGrade;


    public ComputerScienceStudentRecord(String rfidCode, String name) {
        this.rfidCode = rfidCode;
        this.name = name;
    }

    @Override
    public double getAverage() {
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade + programmingGrade + aiGrade + dataStructuresGrade) / 6;
        return result;
    }

    public double getMajorSubjectAverage() {
        double result = 0;
        result = (mathGrade + programmingGrade + aiGrade + dataStructuresGrade) / 4;
        return result;
    }

    public String getRFIDCode() {
        return rfidCode;
    }

    public void setProgrammingGrade(double grade) {
        programmingGrade = grade;
    }

    public void setAiGrade(double grade) {
        aiGrade = grade;
    }

    public void setDataStructuresGrade(double grade) {
        dataStructuresGrade = grade;
    }
}

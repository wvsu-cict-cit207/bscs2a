package act10;

public class ComSciStudent extends StudentRecord{
    private int OOPGrade;
    private int DataStructureGrade;
    
    public int getOOPGrade() {
        return OOPGrade;
    }
    
    public int getDataStructureGrade() {
        return DataStructureGrade;
    }
    
    public void setOOPGrade(int OOPGrade) {
        this.OOPGrade = OOPGrade;
    }
    
    public void setDataStructureGrade(int DataStructureGrade) {
        this.DataStructureGrade = DataStructureGrade;
    }
    
    @Override
    public double getAverage() {
        double average = (mathGrade + englishGrade+ scienceGrade + OOPGrade + DataStructureGrade)/5;
        return average;
    }
    
    public static void main(String[] args) {
        ComSciStudent alejah = new ComSciStudent();
        ComSciStudent shaina =  new ComSciStudent();
        System.out.println(StudentRecord.getStudentCount());
    }
}

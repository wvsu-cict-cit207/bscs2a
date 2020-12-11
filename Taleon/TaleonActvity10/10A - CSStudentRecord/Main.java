public class Main {

    public static void main(String[] args) {
        var comSciStudent = new ComputerScienceStudentRecord("091625312", "Carlo Antonio T. Taleon");
        var StudentRecord = new StudentRecord();
        var anotherCSStudent  = new ComputerScienceStudentRecord("510695258", "Johnny Ten");
        comSciStudent.setScienceGrade(89);
        comSciStudent.setEnglishGrade(92);
        comSciStudent.setMathGrade(90);
        comSciStudent.setProgrammingGrade(94);
        comSciStudent.setAiGrade(91);
        comSciStudent.setDataStructuresGrade(89);

        System.out.println("Name: " + comSciStudent.name);
        System.out.println("RFID Code: " + comSciStudent.getRFIDCode());
        System.out.println("Average: " + comSciStudent.getAverage());
        System.out.println("Major Subject Average: " + comSciStudent.getMajorSubjectAverage());
        System.out.println("Student Count: " + StudentRecord.getStudentCount());
    }
}

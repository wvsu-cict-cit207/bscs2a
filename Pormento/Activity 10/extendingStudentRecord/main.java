package activity10;
public class main {
    public static void main(String[] args) {
        compSciRecord record1 = new compSciRecord();
        record1.setIdNumber("2021M0123");
        record1.setName("Juan Dela Cruz");
        record1.setAddress("Iloilo City");
        record1.setAge(21);
        record1.setIsScholar(true);
        record1.setCourse_and_section("BSCS 2-A");
        record1.setCourseTrack("HPC");
        record1.setMathGrade(1.50);
        record1.setEnglishGrade(1.25);
        record1.setScienceGrade(1.75);
        record1.setProg101Avg(1.00);
        printInfo(record1);
    }
    
    public static void printInfo(compSciRecord data){
        System.out.println("\tRecord Information");
        System.out.println("----------------------------------");
        System.out.println("ID Number: "+ data.getIdNumber());
        System.out.println("Name: " + data.getName());
        System.out.println("Address: " + data.getAddress());
        System.out.println("Age: " + data.getAge());
        System.out.println("Scholarship Grantee?: "+ data.isScholar());
        System.out.println("Course and Section: " + data.getCourse_and_section());
        System.out.println("Course Track: "+ data.getCourseTrack());
        System.out.println("-----------------------");
        System.out.println("Grades: ");
        System.out.println("Math: " + data.getMathGrade());
        System.out.println("English: " + data.getEnglishGrade());
        System.out.println("Science: " + data.getScienceGrade());
        System.out.println("Programming 101: " + data.getProg101Avg());
        System.out.println("GWA: "+ data.getGWA(data));
        System.out.println("-----------------------");
    }

}

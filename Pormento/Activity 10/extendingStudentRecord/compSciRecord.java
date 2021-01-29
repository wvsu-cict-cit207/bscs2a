package activity10;

public class compSciRecord extends StudentRecord {

    private double prog101Avg;
    private boolean Scholar;
    private String course_and_section;
    private String courseTrack;
    private String idNumber;
    private double GWA;

    public compSciRecord(double prog101Avg, boolean isScholar, String courseTrack, String idNumber) {
        this.prog101Avg = prog101Avg;
        this.Scholar = isScholar;
        this.courseTrack = courseTrack;
        this.idNumber = idNumber;
    }

    public compSciRecord() {
    }

    //getters
    public double getProg101Avg() {
        return prog101Avg;
    }

    public boolean isScholar() {
        return Scholar;
    }

    public String getCourseTrack() {
        return courseTrack;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getCourse_and_section() {
        return course_and_section;
    }
    
    public double getGWA(compSciRecord grade) {
        GWA = (grade.getMathGrade() 
                + grade.getProg101Avg() 
                + grade.getScienceGrade() 
                + grade.getEnglishGrade())/4;
        return GWA;
    }
    
    //setters

    public void setProg101Avg(double prog101Avg) {
        this.prog101Avg = prog101Avg;
    }

    public void setIsScholar(boolean isScholar) {
        this.Scholar = isScholar;
    }

    public void setCourseTrack(String courseTrack) {
        this.courseTrack = courseTrack;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setCourse_and_section(String course_and_section) {
        this.course_and_section = course_and_section;
    }
    
    

    

}

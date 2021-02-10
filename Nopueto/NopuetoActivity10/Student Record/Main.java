
package studentrecord;

class StudentRecord {
    protected String name;
    protected String year;
    protected String course;
    protected String section;
    protected String major;
    
    public void Profile(){
        System.out.println("Name: "+ getName() + ", Year: " + getYear() + ", Course: " + getCourse() + ", Section: " + getSection() + ", Major: " + getMajor());
    }
    
 
    public StudentRecord(String name, String year, String course, String section, String major){
        this.name = name;
        this.year = year;
        this.course = course;
        this.section = section;
        this.major = major;   
    }
    
    public String getName(){
        return name;
    }
    public String getYear(){
        return year;
    }
    public String getCourse(){
        return course; 
    }
    public String getSection(){
        return section;
    }
    public String getMajor(){
        return major;
    } 
}
 
class studentA extends StudentRecord {
    public studentA(String name, String year, String course, String section, String major) {
        super(name, year, course, section, major);
    }
    
    @Override
     public void Profile(){
         System.out.println("Name: "+ getName() + ", Year: " + getYear() + ", Course: " + getCourse() + ", Section: " + getSection() + ", Major: " + getMajor() + ", Remarks: Good");
    }
}

class studentB extends StudentRecord {
    public studentB(String name, String year, String course, String section, String major) {
        super(name, year, course, section, major);
    }
    @Override
     public void Profile(){
         System.out.println("Name: "+ getName() + ", Year: " + getYear() + ", Course: " + getCourse() + ", Section: " + getSection() + ", Major: " + getMajor() + ", Remarks: Excellent");
    }
    
}

public class Main{
    public static void main(String[] args){
       StudentRecord P1 = new studentA("JM", "2", "BSCS", "B", "HPC");
       StudentRecord P2 = new studentB("MJ", "2", "BSCS", "A", "AI");
       
       P1.Profile();
       P2.Profile();
        
       }
    }

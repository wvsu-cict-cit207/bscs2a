package extendingstudentrecord;
class studentRecord{
    protected String fname;
    protected String lname;
    protected String specialization;
    protected String year;
    protected String firstSemGWA;
    
    public studentRecord(String fname, String lname, String specialization, String year, String firstSemGWA) {
    this.fname = fname;
    this.lname = lname;
    this.specialization = specialization;
    this.year = year;
    this.firstSemGWA = firstSemGWA;
  }
  
  public String getfullName() {
        return fname + " " + lname;
    }
  public String getspecialization(){
      return specialization;
  }
  public String getyear(){
      return year;
  }
  public String getfirstSemGWA(){
      return firstSemGWA;
  }

    public void studentRecord(){
        System.out.println("Name: " + getfullName());
        System.out.println("Specialization: " + getspecialization());
        System.out.println("Year: " + getyear());
        System.out.println("First Semester GWA: " + getfirstSemGWA());
        System.out.println();
    }
}

class ComputerScience2A extends studentRecord {
    public ComputerScience2A (String fname, String lname, String specialization, String year, String firstSemGWA){
        super(fname, lname, specialization, year, firstSemGWA);
    }
    
    @Override
  public void studentRecord() {
     System.out.println("Name: " + getfullName());
        System.out.println("Specialization: " + getspecialization());
        System.out.println("Year: " + getyear());
        System.out.println("First Semester GWA: " + getfirstSemGWA());
        System.out.println("Second Semester GWA: 1.58");
        System.out.println();
  }
}
class ComputerScience2B extends studentRecord {
    public ComputerScience2B (String fname, String lname, String specialization, String year, String firstSemGWA){
        super(fname, lname, specialization, year, firstSemGWA);
    }
    
    @Override
  public void studentRecord() {
    System.out.println("Name: " + getfullName());
        System.out.println("Specialization: " + getspecialization());
        System.out.println("Year: " + getyear());
        System.out.println("First Semester GWA: " + getfirstSemGWA());
        System.out.println("Second Semester GWA: 1.55");
        System.out.println();
  }
}

public class ExtendedStudentRecord {
  public static void main(String[] args){
      
    ComputerScience2A a = new ComputerScience2A ("Jirah", "Solano", "HPC", "2A", "1.63");
    ComputerScience2B b = new ComputerScience2B ("Kate", "Callao", "AI", "2B", "1.61");
    
    studentRecord[] studentrecordArray = {a, b};

    for (studentRecord extend : studentrecordArray) {
      extend.studentRecord();
    }
  }
}
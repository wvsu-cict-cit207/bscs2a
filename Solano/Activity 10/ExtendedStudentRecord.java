package extendingstudentrecord;
class studentRecord{
    protected String fname;
    protected String lname;
    protected String specialization;
    protected String year;
    
    public studentRecord(String fname, String lname, String specialization, String year) {
    this.fname = fname;
    this.lname = lname;
    this.specialization = specialization;
    this.year = year;
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

    public void studentRecord(){
        System.out.println("Name: " + getfullName());
        System.out.println("Specialization: " + getspecialization());
        System.out.println("Year: " + getyear());
        System.out.println();
    }
}

class ComputerScience2A extends studentRecord {
    public ComputerScience2A (String fname, String lname, String specialization, String year){
        super(fname, lname, specialization, year);
    }
    
    @Override
  public void studentRecord() {
     System.out.println("Name: " + getfullName());
        System.out.println("Specialization: " + getspecialization());
        System.out.println("Year: " + getyear());
        System.out.println("Incomplete");
        System.out.println();
  }
}
class ComputerScience2B extends studentRecord {
    public ComputerScience2B (String fname, String lname, String specialization, String year){
        super(fname, lname, specialization, year);
    }
    
    @Override
  public void studentRecord() {
    System.out.println("Name: " + getfullName());
        System.out.println("Specialization: " + getspecialization());
        System.out.println("Year: " + getyear());
        System.out.println("Drop out");
        System.out.println();
  }
}

public class ExtendedStudentRecord {
  public static void main(String[] args){
      
    ComputerScience2A a = new ComputerScience2A ("Jirah", "Solano", "HPC", "2A");
    ComputerScience2B b = new ComputerScience2B("Kate", "Callao", "AI", "2B");
    
    studentRecord[] studentrecordArray = {a, b};

    for (studentRecord extend : studentrecordArray) {
      extend.studentRecord();
    }
  }
}
// Activity 10
// Exercise 11.6.1 - "Extending Student Record"
// @author Maria Arlyn R. Fuerte (BSCS 2A)

public class StudentRecords{
    protected String StudentID;
    protected String Name;
    protected String EmailAdd;
    private static int StudentCount;
    
    public StudentRecords(){
        StudentCount++;
    }
    
    public StudentRecords(String StudentID, String Name, String EmailAdd){
        this.StudentID = StudentID;
        this.Name = Name;
        this.EmailAdd = EmailAdd;
    }
    
    public String getStudentID(){
        return StudentID;
    }

    public void setStudentID(String temp) {
        StudentID = temp;
        }
    
    public String getName(){
        return Name;
    }

    public void setName(String temp) {
        Name = temp;
        }
    
    public String getEmailAdd() {
        return EmailAdd;
        }

    public void setEmailAdd(String temp) {
        EmailAdd = temp;
    }
}
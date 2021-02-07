// Activity 10
// Exercise 11.6.1 - "Extending Student Record"
// @author Maria Arlyn R. Fuerte (BSCS 2A)

public class Main {
    
    public static void main(String [] args){
        StudentRecords FuerteRecords = new StudentRecords(){};
        GradesFuerteGrades = new Grades();
        
        
        FuerteRecords.setStudentID("2019M0090");
        FuerteRecords.setName("Maria Arlyn R. Fuerte");
        FuerteRecords.setEmailAdd("mariaarlyn.fuerte@wvsu.edu.ph");
        
        FuerteGrades.setAI_Grade(90);
        FuerteGrades.setDM_Grade(91);
        FuerteGrades.setOOP_Grade(92);
        FuerteGrades.setDSA_Grade(90);
        
        
        System.out.println("Student ID: " + FuerteRecords.StudentID);
        System.out.println("Name: " + FuerteRecords.Name);
        System.out.println("Email Address: " + FuerteRecords.EmailAdd);
        System.out.println("Introduction to Artificial Intelligence Grade: " + FuerteGrades.AI_Grade);
        System.out.println("Discrete Mathematics Grade: " + FuerteGrades.DM_Grade);
        System.out.println("Object Orriented Programming Grade: " + FuerteGrades.OOP_Grade);
        System.out.println("Data Structures and Algorithm Grade: " + FuerteGrades.DSA_Grade);
    }
}

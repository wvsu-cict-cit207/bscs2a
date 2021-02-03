package InheritanceAndPolymorphism;

public class Main {

    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord("Joseph", "Bermejo", 21, 90,92,88);    
        student1.display();
        System.out.println("\n");
        CompSciStudentRecord cs1 = new CompSciStudentRecord("Julia Carabano","Gaub", 20,90,87,85,100,"HPC");
        CompSciStudentRecord cs2 = new CompSciStudentRecord("Angelo","Cabatuan", 21, 87, 91, 90, 95, "AI");
        cs1.display();
        cs2.display();
    } 
}
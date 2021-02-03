package InheritanceAndPolymorphism;

import java.util.Scanner;

public class CompSciStudentRecord extends StudentRecord {
    private String specialization;
    private double programmingGrade;
    
    public CompSciStudentRecord(){
        super();
        specialization = "none";
        programmingGrade = 0;
    }
    
    CompSciStudentRecord(String n, String m_add, int m_age, double mGrade, double eGrade, double sGrade, double progGrade, String spec ){
        super.name = n;
        super.address = m_add;
        super.age = m_age;
        super.mathGrade = mGrade;
        super.englishGrade = eGrade;
        super.scienceGrade= sGrade;
        programmingGrade = progGrade;
        specialization = spec;
    }
        
    public String getSpecialization(){
        return specialization;
    }
    
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
    
    public double getProgrammingGrade(){
        return programmingGrade;
    }
    
    public void setProgrammingGrade(double programmingGrade)
    {
        this.programmingGrade = programmingGrade;
    }
    
    public double getAverage(){
        double result = 0;
        result = ( mathGrade+englishGrade+scienceGrade+programmingGrade )/4;
        return result;
    } 
    
    public void display(){
        System.out.println("COMPUTER SCIENCE STUDENT RECORD");
        System.out.println("Name: " + getName());
        System.out.println("Address: " +getAddress());
        System.out.println("Age: " +getAge());
        System.out.println("Math Grade: "+ getMathGrade());
        System.out.println("English Grade: " +getEnglishGrade());
        System.out.println("Science Grade: " + getScienceGrade());
        System.out.println("Programming Grade: " +getProgrammingGrade());
        System.out.println("Specialization: " +getSpecialization());
        System.out.println("Average: " +getAverage());
        System.out.println("-------------\n");
    }
}


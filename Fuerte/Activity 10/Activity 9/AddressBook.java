// Activity 9
// Exercise 10.10.2 - "Address Book"
// @author Maria Arlyn R. Fuerte (BSCS 2A)

import java.util.*;
import javax.swing.*;

class Student {
    private String Name;
    private String Address;
    private String CPNum;
    private String EmailAdd;

    public Student(String Name, String Address, String CPNum, String EmailAdd){
        this.Name = Name;
        this.Address = Address;
        this.CPNum = CPNum;
        this.EmailAdd = EmailAdd;
        }
    
    Student() {
        Name = "";
	Address = "";
        CPNum = "";
        EmailAdd = "";
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
        }

    public String getAddress() {
        return Address;
        }

    public void setAddress(String Address) {
        this.Address = Address;
        }
    
    public String getCPNum() {
        return CPNum;
        }

    public void setCPNum(String CPNum) {
        this.CPNum = CPNum;
        }
    
    public String getEmailAdd() {
        return EmailAdd;
        }

    public void setEmailAdd(String EmailAdd) {
        this.EmailAdd = EmailAdd;
        }
}

public class AddressBook {
    
    public static void AddEntry(ArrayList<Student> AddressBook){
        JOptionPane.showMessageDialog(null,"Add New Entry");
        String Name = JOptionPane.showInputDialog("Enter Your Full Name(FirstName + LastName)");
        String Address = JOptionPane.showInputDialog("Enter Your Address");
        String CPNum = JOptionPane.showInputDialog("Enter Your Cellphone Number (+63):");
        String EmailAdd = JOptionPane.showInputDialog("Enter Your Email Address");
            
        Student Student = new Student ();
        Student.setName(Name);
        Student.setAddress(Address);
        Student.setCPNum(CPNum);
        Student.setEmailAdd(EmailAdd);
        AddressBook.add(Student);
            
        JOptionPane.showMessageDialog(null,"Saved Sucessfully!");
        MainMenu(AddressBook);
        
    }
    
    public static void DeleteEntry(ArrayList<Student> AddressBook){
        System.out.println("\n\n--Delete Entry--");
        int i = 0;
        for(Student s : AddressBook){
            System.out.println(i+1 + "\nName: " + s.getName() + "\nAddress: " + s.getAddress() + "\nCellphone Number: " + s.getCPNum() + "\nEmail Address: "+ s.getEmailAdd());
            i++;
            }
            String index = JOptionPane.showInputDialog("\nEnter number to delete: ");
            int indexint = Integer.parseInt(index)-1;
            
            JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Delete This Entry?");
            AddressBook.remove(indexint);
            JOptionPane.showMessageDialog(null,"You Have Successfully Deleted your Data!");
            MainMenu(AddressBook);
        }
    
    public static void ViewEntry(ArrayList <Student> AddressBook){
        System.out.println("\n\n--View All Entries--");
        int i = 0;
        for(Student s: AddressBook){
            System.out.println(i+1 + "\nName: " + s.getName() + "\nAddress: " + s.getAddress() + "\nCellphone Number: " + s.getCPNum() + "\nEmail Address: "+ s.getEmailAdd());
            i++;
            }
            MainMenu(AddressBook);
    }
    
    public static void UpdateEntry(ArrayList <Student> AddressBook){
        System.out.println("\n\n--Update Account--");
        int i = 0;
        for(Student s: AddressBook){
            System.out.println(i+1 + "\nName: " + s.getName() + "\nAddress: " + s.getAddress() + "\nCellphone Number: " + s.getCPNum() + "\nEmail Address: "+ s.getEmailAdd());
            i++;
            }
        String index = JOptionPane.showInputDialog("\nEnter number to Modify: ");
        int indexint = Integer.parseInt(index)-1;
        AddressBook.get(indexint).setName(JOptionPane.showInputDialog("Enter Your New Full Name(FirstName + LastName)"));
        AddressBook.get(indexint).setAddress(JOptionPane.showInputDialog("Enter Your New Address"));
        AddressBook.get(indexint).setCPNum(JOptionPane.showInputDialog("Enter Your New Cellphone Number"));
        AddressBook.get(indexint).setEmailAdd(JOptionPane.showInputDialog("Enter Your New Email Address"));
        JOptionPane.showMessageDialog(null,"You Have Successfully Modified Your Data!");
        MainMenu(AddressBook);
    }
    
    public static void main(String[] args) {
        ArrayList<Student> AddressBook = new ArrayList<Student>(); 
        MainMenu(AddressBook);
    }
    public static void MainMenu(ArrayList <Student> AddressBook){
        
        int choice = Integer.parseInt(JOptionPane.showInputDialog("          Address Book"
                    +"\nby: Maria Arlyn R. Fuerte"
                    +"\n          (BSCS  2-A)"
                    +"\n\n1. Add Entry"
                    +"\n2. Delete Entry"
                    +"\n3. View All Entries"
                    +"\n4. Update an Entry"
                    +"\n5. Exit"
                    +"\n\nEnter Choice: "));
        
            switch (choice){
                case 1 -> { //Add Account
                    AddEntry(AddressBook);
            }
                case 2 -> {
                    //Delete Entry
                    DeleteEntry(AddressBook);
            }  
                case 3 -> {
                    //View All Entries
                    ViewEntry(AddressBook);
            }

                case 4 -> {
                    //Update Entry
                    UpdateEntry(AddressBook);
            }
                    
                case 5 -> {
                    //Exit
                    JOptionPane.showMessageDialog(null,"Press Enter to Exit");
                    return;
            }
                
                default -> JOptionPane.showMessageDialog(null,"\nInvalid Please Try Again...");
            }
    }
}



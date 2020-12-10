import java.util.ArrayList;
import java.util.Scanner;

class PrintUtil {
    static void printHR() {
        System.out.println("------------------------------------------------------------------------------------");
    }
}
class AddressBookEntry {
    //Properties/Attributes
    private String name;
    private String address;
    private String telephoneNumber;
    private String emailAddress;
    
    //Constructor
    public AddressBookEntry() {
        
    }
    
    public AddressBookEntry(String name, String address, String telephoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
    }
    
    //Accessor - get
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public String getNumber() {
        return telephoneNumber;
    }
    public String getEmail() {
        return emailAddress;
    }
    //Mutator - set
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public void setEmail(String email) {
        this.emailAddress = email;
    }
}

class AddressBook {
    private ArrayList<AddressBookEntry> entries = new ArrayList<AddressBookEntry>();
    
    //add
    public void add() {
        Scanner sc = new Scanner(System.in);
        
        PrintUtil.printHR();
        System.out.println("\t\t\t\t\tADD");
        PrintUtil.printHR();
        
        AddressBookEntry newEntry = new AddressBookEntry();
        System.out.print("Name: ");
        newEntry.setName(sc.nextLine());
        
        System.out.print("Address: ");
        newEntry.setAddress(sc.nextLine());
        
        System.out.print("Telephone Number: ");
        newEntry.setNumber(sc.nextLine());
        
        System.out.print("Email Address: ");
        newEntry.setEmail(sc.nextLine());
        
        entries.add(newEntry);
    }
    
    //delete
    public void delete() {
        Scanner sc = new Scanner(System.in);
        
        PrintUtil.printHR();
        System.out.println("\t\t\t\t\tDELETE");
        PrintUtil.printHR();
        
        System.out.print("Number of Entry to Delete: ");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice <= entries.size() && choice >= 1) {
            choice--;
            entries.remove(choice);
        } else {
            System.out.println("Invalid Input... Press enter to go back to menu.");
            sc.nextLine();
        }
    }
    
    //viewing
    public void view() {
        PrintUtil.printHR();
        System.out.println("\t\t\t\t\tVIEW");
        int i = 0;
        for (AddressBookEntry entry : entries) {
            PrintUtil.printHR();
            System.out.println("\t\t| " + entry.getName());
            System.out.println("\t"+ (i+1) +"\t| " + entry.getAddress());
            System.out.println("\t\t| " + entry.getNumber());
            System.out.println("\t\t| " + entry.getEmail());
            i++;
        }
        PrintUtil.printHR();
        Scanner sc = new Scanner(System.in);
        System.out.print("Press enter to continue...");
        sc.nextLine();
    }
    
    //updating
    public void update() {
        Scanner sc = new Scanner(System.in);
        
        PrintUtil.printHR();
        System.out.println("\t\t\t\t\tUPDATE");
        PrintUtil.printHR();
        
        System.out.print("Number of Entry to Update: ");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice <= entries.size() && choice >= 1) {
            choice--;
            System.out.println("[Now editing " + entries.get(choice).getName() + "]");
            
            System.out.print("Name: ");
            entries.get(choice).setName(sc.nextLine());
                
            System.out.print("Address: ");
            entries.get(choice).setAddress(sc.nextLine());
            
            System.out.print("Telephone Number: ");
            entries.get(choice).setNumber(sc.nextLine());
                
            System.out.print("Email Address: ");
            entries.get(choice).setEmail(sc.nextLine());
        } else {
            System.out.println("Invalid Input... Press enter to go back to menu.");
            sc.nextLine();
        }
    }
    
    //getList
    public ArrayList<AddressBookEntry> getList() {
        return entries;
    }
    
}

public class Main {
    public static void main(String args[]) {
        AddressBook ab = new AddressBook();
        menu(ab);
    }
    
    public static void menu(AddressBook ab) {
        PrintUtil.printHR();
        System.out.println("\t\t\t\t\tMENU");
        PrintUtil.printHR();
        Scanner sc = new Scanner(System.in);
        System.out.println("1 | Add entry");
        System.out.println("2 | Delete entry");
        System.out.println("3 | View all entries");
        System.out.println("4 | Update an entry");
        System.out.print("\n> ");
          
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                ab.add();
                break;
            case 2:
                ab.delete();
                break;
            case 3:
                ab.view();
                break;
            case 4:
                ab.update();
                break;
      }
      
      menu(ab);
    }
}
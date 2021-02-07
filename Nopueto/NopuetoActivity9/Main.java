package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{ 
    
    private static ArrayList<AddressBook> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int totalCount = AddressBook.getTotalCount();
    
    public static void emptyMsg(){
        System.out.print("This list is empty.\n"
                + "Add some items to get started\n");
        System.out.print("-------------------------\n");
        pauseConsole();
    }
    
    public static void pauseConsole() { //Pauses the console
        System.out.print("Press ENTER to continue..."); 
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }
    
    public static void addEntry() {//add contacts
        System.out.print("Enter name:");
        String name = sc.next();
        name += sc.nextLine();
        
        System.out.print("Enter address:");
        String address = sc.next();
        address += sc.nextLine();
        
        System.out.print("Enter phone number:");
        int telNumber = sc.nextInt();
        
        System.out.print("Enter email:");
        String email = sc.next();
        email += sc.nextLine();
        
        AddressBook newData = new AddressBook (name, address, telNumber, email);
        contacts.add(newData);
        totalCount++; 
    }
    
    public static void deleteEntry(){
        System.out.println("-------------------------");
        System.out.println("DELETE ENTRIES");
        System.out.println("-------------------------");
        if (totalCount == 0) {
            emptyMsg();
            main(null);
        }
        System.out.print("Select item to delete: \n"
                +">> ");
        int selection = sc.nextInt(5);
        while (selection > (contacts.size()) || selection <= 0){
            System.out.print("Item does not exist. Please try again.\n"
                    + ">> ");
        }
        selection--;
        contacts.remove(selection);
        AddressBook.setTotalCount();
        totalCount--;
        System.out.println("-------------------------");
        System.out.println("Delete success!");
        System.out.println("-------------------------");
    }
    
    public static void updateEntry() {
        System.out.println("-------------------------");
        System.out.println("UPDATE ENTRIES");
        System.out.println("-------------------------");
        if (totalCount == 0) {
            emptyMsg();
            main(null);
        }
        System.out.print("Choose a contact to update:\n"
                + ">> ");
        int selection = sc.nextInt();
        while (selection > contacts.size() || selection <=0) {
            System.out.print("Items does not exist. Please try again.\n"
                    + ">> ");
            selection = sc.nextInt();
        }
        selection--;
        System.out.println("-------------------------");
        System.out.println("Contact Selected: "+
                contacts.get(selection).getName());
        System.out.print("Enter name: ");
        String newName = sc.next();
        newName += sc.nextLine();
        contacts.get(selection).setName(newName);
        
        System.out.print("Enter address: ");
        String newAddress = sc.next();
        newAddress += sc.nextLine();
        contacts.get(selection).setAddress(newAddress);
        
        System.out.print("Enter phone number: ");
        int newTelNumber = sc.nextInt();
        newTelNumber += sc.nextInt();
        contacts.get(selection).setTelNumber(newTelNumber);
        
        System.out.print("Enter email: ");
        String newEmail = sc.next();
        newEmail += sc.nextLine();
        contacts.get(selection).setEmail(newEmail);
        
        System.out.println("-------------------------");
        System.out.println("Update success");
        System.out.println("-------------------------");
    }
    
    public static void viewEntry () {
        if (totalCount == 0) {
            emptyMsg();
            main(null);
        }
        int i = 0;
        for (AddressBook data : contacts) {
            System.out.println("Contact " + (i + 1));
            System.out.println("-------------------------");
            System.out.println("Name: " + data.getName());
            System.out.println("Address: " + data.getAddress());
            System.out.println("Phone Number: " + data.getTelNumber());
            System.out.println("Email address: " + data.getEmail());
            System.out.println("-------------------------");
            i++;
        }
        System.out.println("Total number of contacts: " + AddressBook.getTotalCount());
        System.out.println("-------------------------");
    }
    
    public static void main(String[] args) {
        System.out.println("Adress Book Entry");
        System.out.println("-------------------------");
        System.out.print("1. Add an entry\n"
                + "2. Delete entry\n"
                + "3. Update an entry\n"
                + "4. View all entries\n"
                + "5. Exit\n"
                + ">> ");
        int selection = sc.nextInt();
        switch (selection) {
            case 1:
                addEntry();
                pauseConsole();
                main(null);
                break;
                
            case 2:
                deleteEntry();
                pauseConsole();
                main(null);
                break;
            
            case 3:
                updateEntry();
                pauseConsole();
                main(null);
                break;
                
            case 4:
                viewEntry();
                pauseConsole();
                main(null);
                break;
                
            default:
                System.exit(0);
                break;
        }
    }
}

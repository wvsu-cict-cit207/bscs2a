package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    private static ArrayList<addressbookEntry> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int totalCount = addressbookEntry.getTotalCount();

    /*
    ignore this part, i made this to keep myself from being confused with certain variables :)
    newData is the object from addressBook class
    contacts is the name of arraylist
    data in for-each loop is the variable to access the index of arraylist
    
    NOTE: "selection -1" is implemented in order to sync with arraylist index
     */
    public static void emptyMsg() {
        System.out.print("This list is empty.\n"
                + "Add some items to get started\n");
        System.out.print("------------------------\n");
        pauseConsole();
    }

    public static void pauseConsole() { // Pauses the console
        System.out.print("Press ENTER to continue...");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }

    public static void addEntry() {//add contacts
        System.out.print("Enter name: ");
        String name = sc.next();
        name += sc.nextLine();

        System.out.print("Enter address: ");
        String address = sc.next();
        address += sc.nextLine();

        System.out.print("Enter phone number: ");
        int telNumber = sc.nextInt();

        System.out.print("Enter email: ");
        String email = sc.next();
        email += sc.nextLine();

        addressbookEntry newData = new addressbookEntry(name, address, telNumber, email);//constructor in use
        contacts.add(newData);
        totalCount++;
    }

    public static void deleteEntry() {
        System.out.println("---------------------");
        System.out.println("DELETE ENTRIES");
        System.out.println("---------------------");
        if (totalCount == 0) {
            emptyMsg();
            main(null);
        }
        System.out.print("Select item to delete: \n"
                + ">> ");
        int selection = sc.nextInt(5);
        while (selection > (contacts.size()) || selection <= 0) {//this loop will only run if item does not exist
            System.out.print("Item does not exist. Please try again.\n"
                    + ">> ");
            selection = sc.nextInt();
        }
        selection--;
        contacts.remove(selection);
        addressbookEntry.setTotalCount();//reduce total count every deletion
        totalCount--;
        System.out.println("---------------------");
        System.out.println("Delete success!");
        System.out.println("---------------------");
    }

    public static void updateEntry() {
        System.out.println("---------------------");
        System.out.println("UPDATE ENTRIES");
        System.out.println("---------------------");
        if (totalCount == 0) {
            emptyMsg();
            main(null);
        }
        System.out.print("Choose a contact to update:\n"
                + ">> ");
        int selection = sc.nextInt();
        while (selection > contacts.size()|| selection <= 0) {//this loop will only run if item does not exist
            System.out.print("Item does not exist. Please try again.\n"
                    + ">> ");
            selection = sc.nextInt();
        }
        selection--;
        System.out.println("---------------------");
        System.out.println("Contact Selected: "+ 
                contacts.get(selection).getName());
        System.out.println("---------------------");
        System.out.print("Enter new name: ");
        String newName = sc.next();
        newName += sc.nextLine();
        contacts.get(selection).setName(newName);

        System.out.print("Enter new address: ");
        String newAddress = sc.next();
        newAddress += sc.nextLine();
        contacts.get(selection).setAddress(newAddress);

        System.out.print("Enter new phone number: ");
        int newTelNumber = sc.nextInt();
        contacts.get(selection).setTelNumber(newTelNumber);

        System.out.print("Enter new email: ");
        String newEmail = sc.next();
        newEmail += sc.nextLine();
        contacts.get(selection).setEmail(newEmail);

        System.out.println("---------------------");
        System.out.println("Update success!");
        System.out.println("---------------------");
    }

    public static void viewEntry() {
        if (totalCount == 0) {
            emptyMsg();
            main(null);
        }
        int i = 0; //numbering
        for (addressbookEntry data : contacts) {
            System.out.println("Contact # " + (i + 1));
            System.out.println("--------------------");
            System.out.println("Name: " + data.getName());
            System.out.println("Address: " + data.getAddress());
            System.out.println("Phone Number: " + data.getTelNumber());
            System.out.println("Email address: " + data.getEmail());
            System.out.println("--------------------");
            i++;
        }
        System.out.println("Total number of contacts: " + addressbookEntry.getTotalCount());
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        System.out.println("Address Book alpha v.0.2.1");
        System.out.println("--------------------------");
        System.out.print("1. Add an entry\n"
                + "2. Delete entry\n"
                + "3. Update Entry\n"
                + "4. View Entry\n"
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
        }
    }

}

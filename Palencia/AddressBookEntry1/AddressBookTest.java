package AddressBookEntry1;

import java.util.Scanner;
public class AddressBookTest {
	public static void main(String[] args) {
	    String input;
	    Scanner sc = new Scanner(System.in);
	    AddressBook addressBook = new AddressBook();
	    boolean choice = false;
	    do
	    {

	        System.out.println("\nMain Menu");
	        System.out.println("1. Add an Entry");
	        System.out.println("2. Delete an Entry");
	        System.out.println("3. View All Entries");
	        System.out.println("4. Update an Entry");
	        System.out.println("5. Exit");
	        System.out.print("Please enter Choices from 1 to 5: \n");
	        input =(sc.next());

	        switch (input) {
	            case "1":	             
	                AddressBookEntry entry = new AddressBookEntry();
	                System.out.print("First Name: ");
	                entry.setName(sc.next());
	                System.out.print("Address: ");
	                entry.setAddress(sc.next());
	                System.out.print("Telephone Number: ");
	                entry.setTelNum(sc.nextInt());
	                System.out.print("Email Address: ");
	                entry.setEmailAddress(sc.next());
	                addressBook.add(entry);

	                System.out.println("Entry Added!");
	                break;

	            case "2":
	                System.out.println("Enter number to delete: ");
	                addressBook.delete(sc.nextInt());
	                break;

	            case "3":
	                System.out.println("Address Book Entries");
	                AddressBookEntry[] listOfEntries = addressBook.viewAll();
	                for (int i = 0; i < listOfEntries.length; i++) {
	                    System.out.println(listOfEntries[i].toString());
	                }

	                break;
	            case "4":
	                System.out.println("Enter number to update: ");
	              
	                AddressBookEntry entryToUpdate = addressBook.get(sc.nextInt());

	                System.out.print("First Name (current: " + entryToUpdate.getName() + "):");
	                entryToUpdate.setName(sc.next());

	                System.out.print("Address: (current: " + entryToUpdate.getAddress() + "):");
	                entryToUpdate.setAddress(sc.next());

	                System.out.print("Telephone number: (current: " + entryToUpdate.getTelNum() + "):");
	                entryToUpdate.setTelNum(sc.nextInt());

	                System.out.print("Email Address: (current: " + entryToUpdate.getEmail() + "):");
	                entryToUpdate.setEmailAddress(sc.next());

	                break;
	            default:
	                break;
	        }
	
	    } while (!input.equals("5"));
		}
	}

import java.util.ArrayList;
import AddressBookEntry.*;//Act9A AddressBookEntry
import java.util.Scanner;
class AddressBook{
    public static Scanner input = new Scanner(System.in);
    private ArrayList<AddressBookEntry> entries = new ArrayList<AddressBookEntry>();
    public AddressBook(){
    }
    private void setEntry(AddressBookEntry entry){
        System.out.println("Enter Name:");
        entry.setName(input.nextLine());
        System.out.println("Enter Address:");
        entry.setAddress(input.nextLine());
        System.out.println("Enter Telephone Number:");
        entry.setTelephoneNumber(input.nextLine());
        System.out.println("Enter Email Address:");
        entry.setEmailAddress(input.nextLine());
    }
    public void addEntry(){
        if(entries.size()<100){
            AddressBookEntry entry = new AddressBookEntry();
            setEntry(entry);
            this.entries.add(entry);
        }
        else{
            System.out.println("Address Book is Full.");
        }
    }
    public void delEntry(){
        System.out.println("======Delete Entry======");
        System.out.print("Enter Name to Delete: ");
        String toDel = input.nextLine();
        boolean inList = false;
        for(int i=0; i<entries.size(); i++){
            inList = entries.get(i).getName().contains(toDel);
            if(inList){
                this.entries.remove(i);
                System.out.println(toDel+" has been deleted!");
                break;
            }
        }     
        if(!inList||entries.isEmpty())System.out.println("No "+toDel+" in the list");
    }
    public void viewAll(){
        System.out.println("=======All Entries======");
        for(int i=0; i<entries.size(); i++){
            System.out.println("Name: "+ entries.get(i).getName());
            System.out.println("Address: "+ entries.get(i).getAddress());
            System.out.println("Telephone Number: "+ entries.get(i).getTelephoneNumber());
            System.out.println("Email Address: "+ entries.get(i).getEmailAddress() + "\n");
        }
        if(entries.isEmpty())System.out.println("List is Empty.");
        System.out.println("Total Number of Entries: "+ entries.size());
    }
    public void updateEntry(){
        System.out.println("======Update an Entry======");
        System.out.print("Enter Name to Update: ");
        String toRep = input.nextLine();
        boolean inList = false;
        for(int i=0; i<entries.size(); i++){
            inList = entries.get(i).getName().contains(toRep);
            if(inList){
                System.out.println("Enter New Info:");
                setEntry(this.entries.get(i));
            }
        }
        if(!inList)System.out.println("No "+toRep+" in the list");
    }
}
public class ElizaldeAct9 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        boolean loop=true;
        do{
            System.out.println("=======Options========");
            System.out.println("1 - Add entry");
            System.out.println("2 - Delete entry");
            System.out.println("3 - View All entries");
            System.out.println("4 - Update an entry");
            System.out.println("0 - Exit");
            System.out.print("Select an Option: ");
            String option = input.nextLine();
            try{
                switch(Integer.parseInt(option)){
                case 1:
                    System.out.println("=======Add Entry========");
                    addressBook.addEntry();
                    break;
                case 2:
                    addressBook.delEntry();
                    break;
                case 3:
                    addressBook.viewAll();
                    break;
                case 4:
                    addressBook.updateEntry();
                    break;
                case 0:
                    loop=false;
                    break;
                default:
                    System.out.println("Not an Option!");
                    break;
                }
            }
            catch(NumberFormatException ex){
                System.out.println("Not a Option!");
            }
        }
        while(loop);
    }
}

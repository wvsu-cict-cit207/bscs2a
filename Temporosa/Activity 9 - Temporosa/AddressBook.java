//10.10 Exercises

import java.util.*;

class AddressBookEntry {
    private String name;
    private String address;
    private String telephoneNum;
    private String emailAdd;

    public AddressBookEntry(String name, String address, String telephoneNum, String emailAdd){
        this.name = name;
        this.address = address;
        this.telephoneNum = telephoneNum;
        this.emailAdd = emailAdd;

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getTelephone(){
        return telephoneNum;
    }

    public void setTelephone(String telephoneNum){
        this.telephoneNum = telephoneNum;
    }

    public String getEmail(){
        return emailAdd;
    }

    public void setEmail(String emailAdd){
        this.emailAdd = emailAdd;
    }


}

public class AddressBook {

    //Menu
    public static void Menu(ArrayList<AddressBookEntry> personData){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Add");
        System.out.println("2. Delete");
        System.out.println("3. View");
        System.out.println("4. Update");
        System.out.print("Select Option: ");
        int option = scanner.nextInt();
        switch(option){
            case 1:
                Add(personData);
            case 2: 
                Delete(personData);
            case 3:
                View(personData);
            case 4:
                Update(personData);
            default:
                System.out.println("Invalid Option.");
                Menu(personData);
        }
    }

    public static void Add(ArrayList<AddressBookEntry> personData){
        Scanner scanner = new Scanner(System.in);
        AddressBookEntry personInfo = new AddressBookEntry(null,null,null,null);

        System.out.println();

        System.out.print("Fullname: ");
        personInfo.setName(scanner.nextLine());
        System.out.print("Address: ");
        personInfo.setAddress(scanner.nextLine());
        System.out.print("Telephone No.: ");
        personInfo.setTelephone(scanner.nextLine());
        System.out.print("Email: ");
        personInfo.setEmail(scanner.nextLine());

        System.out.println();

        personData.add(personInfo);

        Menu(personData);
    }

    public static void Delete(ArrayList<AddressBookEntry> personData){
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        int i = 0;
        for (AddressBookEntry person : personData){
            System.out.print(i+1 + ". ");
            System.out.println("Name: " + person.getName());
            System.out.println("Address: " + person.getAddress());
            System.out.println("Telephone No.: " + person.getTelephone());
            System.out.println("Email: " + person.getEmail());

        }

        System.out.print("Enter number to delete: ");
        int position = scanner.nextInt();

        personData.remove(position - 1);

        Menu(personData);

    }

    public static void View(ArrayList<AddressBookEntry> personData){

        System.out.println();

        int i = 0;
        for (AddressBookEntry person : personData){
            System.out.println(i+1 + ". ");
            System.out.println("Name: " + person.getName());
            System.out.println("Address: " + person.getAddress());
            System.out.println("Telephone No.: " + person.getTelephone());
            System.out.println("Email: " + person.getEmail());
            i++;

            System.out.println();
        }
        Menu(personData);

    }

    public static void Update(ArrayList<AddressBookEntry> personData){
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        int i = 0;
        for (AddressBookEntry person : personData){
            System.out.print(i+1 + ". ");
            System.out.println(person.getName());
            System.out.println(person.getAddress());
            System.out.println(person.getTelephone());
            System.out.println(person.getEmail());
            i++;
        }

        System.out.println("Please select the patient you want to update.");
        int index = scanner.nextInt() - 1;
        System.out.println("1. Name");
        System.out.println("2. Address");
        System.out.println("3. Telephone No.");
        System.out.println("4. Email");
        System.out.println("What do you want to update?");
        int update = scanner.nextInt();
        switch(update){
            case 1:
                System.out.println("Enter new name: ");
                personData.get(index).setName(scanner.next());
                break;
            case 2:
                System.out.println("Enter new address: ");
                personData.get(index).setAddress(scanner.next());
                break;
            case 3:
                System.out.println("Enter telephone no.: ");
                personData.get(index).setTelephone(scanner.next());
            case 4:
                System.out.println("Enter email: ");
                personData.get(index).setEmail(scanner.next());

        }

        Menu(personData);
    }

    public static void main(String[] args) {
        
        ArrayList<AddressBookEntry> personData  = new ArrayList<AddressBookEntry>(100);
        Menu(personData);


    }
}
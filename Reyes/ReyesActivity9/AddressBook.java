//10.10 Exercises

package addressbook;
import java.util.*;

//10.10.1 Address Book Entry

//Class for Address Book Entry
class AddressBookEntry{
    private String firstName;
    private String lastName;
    private String barangay;
    private String municipality;
    private String province;
    private String telephoneNumber;
    private String emailAddress;
    String gettelephoneNumber;
    String getemailAddress;
    
    public AddressBookEntry(String firstName, String lastName, String barangay, String municipality, String province, String telephoneNumber, String emailAddress){
        this.firstName = firstName;
        this.lastName = lastName;
        this.barangay = barangay;
        this.municipality = municipality;
        this.province = province;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
    }
    //Setter-Getter
    public String getName(){
        return firstName;
    }
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
    public String getBarangay(){
        return barangay;
    }
    public void setBarangay(String barangay){
        this.barangay = barangay;
    }
    public String getMunicipality(){
        return municipality;
    }
    public void setMunicipality(String municipality){
        this.municipality = municipality;
    }
    public String getProvince(){
        return province;
    }
    public void setProvince(String province){
        this.province = province;
    }
    public String gettelephoneNumber(){
        return telephoneNumber;
    }
    public void settelephoneNumber(String telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }
    public String getemailAddress(){
        return emailAddress;
    }
    public void setemailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getfullName(){
        return this.firstName + " " + this.lastName;
    }
    public String getfullAddress(){
        return this.barangay + ", " + this.municipality + ", " + this.province;
    }
}

//10.10.2 AddressBook

//Class for AddressBook
public class AddressBook {
    //Add Entry
    public static void addEntry(ArrayList<AddressBookEntry> getData){
       Scanner in = new Scanner(System.in);
       System.out.print("How many employee/s would you like to add?: ");
       int addSize = in.nextInt();
       System.out.println();
       System.out.println("-------------------------------");
       System.out.println("+x+x+x+x+Add Entry/ies+x+x+x+x+");
       System.out.println("-------------------------------");
       for(int i = 0; i < addSize; i++){
            AddressBookEntry newaddressBook = new AddressBookEntry(null, null, null, null, null, null, null);
            System.out.print("Enter First Name: ");
            newaddressBook.setfirstName(in.next());
            System.out.print("Enter Last Name: ");
            newaddressBook.setlastName(in.next());
            System.out.print("Enter Barangay: ");
            newaddressBook.setBarangay(in.next());
            System.out.print("Enter Municipality: ");
            newaddressBook.setMunicipality(in.next());
            System.out.print("Enter Province: ");
            newaddressBook.setProvince(in.next());
            System.out.print("Enter Telephone Number: ");
            newaddressBook.settelephoneNumber(in.next());
            System.out.print("Enter Email Address: ");
            newaddressBook.setemailAddress(in.next());
            
            getData.add(newaddressBook);
            System.out.println("-------------------------------");
       }
       getMenu(getData);
    }  
    //Delete Entry
    public static void deleteEntry(ArrayList<AddressBookEntry> getData){
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("+x+x+x+x+Delete Entry/ies+x+x+x+x+");
        System.out.println("----------------------------------");
        int i = 0;
        for(AddressBookEntry a : getData){
            System.out.println(i+1 + ".");
            System.out.println("Name               : " + a.getfullName());
            System.out.println("Address            : " + a.getfullAddress());
            System.out.println("Telephone Number   : " + a.gettelephoneNumber());
            System.out.println("Email Address      : " + a.getemailAddress());
            i++;
        }
        System.out.println("----------------------------------");
        System.out.print("Enter number to delete: ");
        int index = in.nextInt() - 1;

        getData.remove(index);
                    
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("You have successfully delete an entry");
        System.out.println("----------------------------------");
        System.out.println();
        
        getMenu(getData);
    }
    //View Entry
    public static void viewEntry(ArrayList<AddressBookEntry> getData){
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("+x+x+x+x+View Entries+x+x+x+x+");
        System.out.println("------------------------------");
        int i = 0;
        for(AddressBookEntry a : getData){
            System.out.println(i+1 + ".");
            System.out.println("Name               : " + a.getfullName());
            System.out.println("Address            : " + a.getfullAddress());
            System.out.println("Telephone Number   : " + a.gettelephoneNumber());
            System.out.println("Email Address      : " + a.getemailAddress() + "\n");
            i++;
        }
        getMenu(getData);
    }
    //Update Entry
    public static void updateEntry(ArrayList<AddressBookEntry> getData){
        Scanner in = new Scanner(System.in);
        char ans = 'Y';
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("+x+x+x+x+Update Entry/ies+x+x+x+x+");
        System.out.println("----------------------------------");
        int i = 0;
        for(AddressBookEntry a : getData){
            System.out.println(i+1 + ".");
            System.out.println("Name               : " + a.getfullName());
            System.out.println("Address            : " + a.getfullAddress());
            System.out.println("Telephone Number   : " + a.gettelephoneNumber());
            System.out.println("Email Address      : " + a.getemailAddress());
            i++;
        }
        System.out.println("----------------------------------");
        System.out.print("Who do you want to change?: ");
        int index = in.nextInt() - 1;
        System.out.println("----------------------------------");
        System.out.println("1. First Name");
        System.out.println("2. Last Name");
        System.out.println("3. Barangay");
        System.out.println("4. Municipality");
        System.out.println("5. Province");
        System.out.println("6. Telephone Number");
        System.out.println("7. Email Address");
        System.out.println("------------------------------"); 
        System.out.print("What will you update?: ");
        int update = in.nextInt();
        System.out.println("------------------------------"); 
        switch(update){
            case 1:
                System.out.print("Enter New First Name: ");
                getData.get(index).setfirstName(in.next());
                break;
            case 2:
               System.out.print("Enter New Last Name: ");
               getData.get(index).setlastName(in.next());
               break;
            case 3:
               System.out.print("Enter New Barangay: ");
               getData.get(index).setBarangay(in.next());
               break;
            case 4:
               System.out.print("Enter New Municipality: ");
               getData.get(index).setMunicipality(in.next());
               break;
            case 5:
               System.out.print("Enter New Province: ");
               getData.get(index).setProvince(in.next());
               break;
            case 6:
               System.out.print("Enter New Telephone Number: ");
               getData.get(index).settelephoneNumber(in.next());
               break;
            case 7:
               System.out.print("Enter New Email Address: ");
               getData.get(index).setemailAddress(in.next());
               break;
        }
        System.out.println();
        getMenu(getData);
    }
    public static void main(String[] args) {
        ArrayList<AddressBookEntry> getData = new ArrayList<AddressBookEntry>(100);
        getMenu(getData);
    }
    public static void getMenu(ArrayList<AddressBookEntry> getData){
        Scanner in = new Scanner(System.in);
        System.out.println("+x+x+x+x+Employees' Address Book +x+x+x+x+");
        System.out.println("1. Add entry");
        System.out.println("2. Delete entry");
        System.out.println("3. View all entries");
        System.out.println("4. Update an entry");
        System.out.println("-------------------------");
        System.out.print("Select an option: ");
        int option = in.nextInt();
        System.out.println("-------------------------"); 
        switch(option){
            case 1:
                addEntry(getData);
                break;
            case 2:
                deleteEntry(getData);
                break;
            case 3:
                viewEntry(getData);
                break;
            case 4:
                updateEntry(getData);
                break;
        }
    } 
}
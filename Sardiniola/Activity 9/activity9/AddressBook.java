
package activity9;
import java.util.Scanner;
public class AddressBook {
    private AddressBookEntry arr[] = new AddressBookEntry[5];
    private Scanner in = new Scanner(System.in);
    private int count = AddressBookEntry.getContactCount();
    private String format = "| %-22s| %-21s| %-16s| %-35s|\n";
    public void add(String name, String address, String telNum, String email) {
        try {
        arr[count] = new AddressBookEntry(name, address, telNum, email);
        count = AddressBookEntry.getContactCount();
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public AddressBookEntry[] returnArr () {
        return arr;
    }
    
    public void view () {
        int count = AddressBookEntry.getContactCount();
        System.out.println("+=====================================================================================================+");
        System.out.printf("|          %48s                                           |\n", "ADDRESS BOOK");
        System.out.println("+=======================+======================+=================+====================================+");
        System.out.println("|         NAME          |        ADDRESS       |   TELEPHONE #   |                 EMAIL              |");
        System.out.println("+=======================+======================+=================+====================================+");
        for (int i = 0; i < count; i++) {
            System.out.printf(format, arr[i].getName(), arr[i].getAddress(), arr[i].getTelNum(), arr[i].getEmail());
            System.out.println("+=======================+======================+=================+====================================+");
        }
    }
    
    public void update (String nameToBeUpdated, String name, String address, String telNum, String email) {
        int index = search(nameToBeUpdated);
        if (index == -1) {
            System.out.println("Contact not found.");
        }
        else {
            arr[index].setName(name);
            arr[index].setAddress(address);
            arr[index].setTelNum(telNum);
            arr[index].setEmail(email);
        }
    }
    public void delete (String nameToBeDeleted) {
        int index = search(nameToBeDeleted);
        if (index == -1) {
            System.out.println("Contact not found.");
        }
        else {
            for (int i = index; i < count-1; i++) {
                arr[i] = arr[i+1];
            }
            count--;
            AddressBookEntry.setContactCount(count);
        }
    }
    
    public int getCount() {
        return count;
    }
    
    private int search (String name) {
        count = AddressBookEntry.getContactCount();
        for (int i = 0; i < count; i++) {
            if (arr[i].getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }
    
}

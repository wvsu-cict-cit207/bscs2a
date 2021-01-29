package addressbook;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class AddressBook{
    public static void main(String[] args){
        ArrayList<AddressBookEntry> getData = new ArrayList<AddressBookEntry>();
        backMenu(getData);
    }
    public static void backMenu(ArrayList<AddressBookEntry> getData){
       
        String menu = JOptionPane.showInputDialog("=======Options=======" + "\n" + "Enter A to (A)dd entry" + "\n" + "Enter D to (D)elete entry" + "\n" + "Enter V to (V)iew all entries" + "\n" + "Enter U to (U)pdate an entry" + "\n" + "Enter E to (E)xit" + "\n" + "Select your Choice: ");
        char choice = menu.toUpperCase().charAt(0);

        switch(choice){
            case 'A':
                addData(getData);
                break;
            case 'D':
                deleteData(getData);
                break;
            case 'V':
                viewData(getData);
                break;
            case 'U':
                updateData(getData);
            case 'E':
                System.exit(0);
        }
    }
        public static void addData(ArrayList<AddressBookEntry> getData){
            String add = JOptionPane.showInputDialog("How many data would you like to add?");
            int numOfInputs = Integer.parseInt(add);
             for(int i = 0; i < numOfInputs; i++){
            AddressBookEntry newAddressBookEntry = new AddressBookEntry(null, null, null, null);
            newAddressBookEntry.setname(JOptionPane.showInputDialog("Enter username:"));
            newAddressBookEntry.setaddress(JOptionPane.showInputDialog("Enter address:"));
            newAddressBookEntry.settelephoneNumber(JOptionPane.showInputDialog("Enter telephone Number:"));
            newAddressBookEntry.setemailAddress(JOptionPane.showInputDialog("Enter email address:"));
            getData.add(newAddressBookEntry);
        }
             backMenu(getData);
    }
        public static void deleteData(ArrayList<AddressBookEntry> getData){
            int matches = 1;
            String outcome = "";
                 for(AddressBookEntry data : getData){
                     String name = data.getname();
                     String address = data.getaddress();
                     String telephoneNumber = data.gettelephoneNumber();
                     String emailAddress = data.getemailAddress ();
                     outcome += "\n" + matches + ". " + "Name: " + name + "\n" + "Address: " + address + "\n" + "Telephone Number: " + telephoneNumber + "\n" + "Email Address: " + emailAddress + "\n";
                     matches++;
            }
            String remove = JOptionPane.showInputDialog("Data Record" + outcome + "\n\n" + "Enter number to delete:");
            int numToRemove = Integer.parseInt(remove) - 1;
            getData.remove(numToRemove);
            JOptionPane.showMessageDialog(null, "There is/are " + getData.size() + " left found in the list");
            backMenu(getData);
        }
        public static void viewData(ArrayList<AddressBookEntry> getData){
            int matches = 1;
            String outcome = "";
            for(AddressBookEntry data : getData){
                     String name = data.getname();
                     String address = data.getaddress();
                     String telephoneNumber = data.gettelephoneNumber();
                     String emailAddress = data.getemailAddress ();
                     outcome += "\n" + matches + ". " + "Name: " + name + "\n" + "Address: " + address + "\n" + "Telephone Number: " + telephoneNumber + "\n" + "Email Address: " + emailAddress + "\n";
                     matches++;
            }
            JOptionPane.showMessageDialog(null, "Data Record" + outcome);
            backMenu(getData);
}
        public static void updateData(ArrayList<AddressBookEntry> getData){
            int matches = 1;
            String outcome = "";
            for(AddressBookEntry data : getData){
                     String name = data.getname();
                     String address = data.getaddress();
                     String telephoneNumber = data.gettelephoneNumber();
                     String emailAddress = data.getemailAddress ();
                     outcome += "\n" + matches + ". " + "Name: " + name + "\n" + "Address: " + address + "\n" + "Telephone Number: " + telephoneNumber + "\n" + "Email Address: " + emailAddress + "\n";
                     matches++;
            }
            String update = JOptionPane.showInputDialog("Data Record" + outcome + "\n\n" + "Who do you want to update? (Choose a number:)");
            int dataUpdate= Integer.parseInt(update) - 1;
            getData.get (dataUpdate).setname(JOptionPane.showInputDialog("Enter new name:"));
            getData.get(dataUpdate).setaddress(JOptionPane.showInputDialog("Enter new address: "));
            getData.get(dataUpdate).settelephoneNumber(JOptionPane.showInputDialog("Enter telephone number: "));
            getData.get(dataUpdate).setemailAddress(JOptionPane.showInputDialog("Enter new email address: "));
            backMenu(getData);
            }           
}    
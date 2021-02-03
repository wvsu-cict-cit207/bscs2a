//10.10.3 AddressBook
package addressbook;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class AddressBook {
    public static void main(String[] args) {
        ArrayList<addressBookEntry> collectInput = new ArrayList<>();
        mainMenu(collectInput); 
    }
    public static void addItem(ArrayList<addressBookEntry> collectInput){
        //Add entry
        String a = JOptionPane.showInputDialog("How many entries would you like to add?");
        int add = Integer.parseInt(a);
        for(int i = 0; i < add; i++){
            addressBookEntry newaddressBookEntry = new addressBookEntry(null, null, null ,null );
            newaddressBookEntry.setname(JOptionPane.showInputDialog("Input name:"));
            newaddressBookEntry.setaddress(JOptionPane.showInputDialog("Input address:"));
            newaddressBookEntry.settelephoneNum(JOptionPane.showInputDialog("Input telephone number:"));
            newaddressBookEntry.setemailAdd(JOptionPane.showInputDialog("Input email address"));
            
            collectInput.add(newaddressBookEntry);
        }
        mainMenu(collectInput);
    }
    public static void deleteItem(ArrayList<addressBookEntry> collectInput){
        //Delete entry
        String d = JOptionPane.showInputDialog("       What entry would you like to delete?" 
        + "\n" + "1. Delete an entry" + "\n" + "2. Delete all saved entries" + "\n" + "3. Go back");
        int delete = Integer.parseInt(d);
        switch(delete){
            case 1://Deletes an entry
                String sentence = "";
                int input = 1;
                for(addressBookEntry a : collectInput){
                    String data1 = a.getname();
                    String data2 = a.getaddress();
                    String data3 = a.gettelephonNum();
                    String data4 = a.getemailAdd();
                    sentence += "\n" + input + ". " + "\n" + "Name: " + data1 + "\n" + "Address: " + data2 + "\n" + "Telephone Number: " + data3 + "\n" + "Email Address: " + data4 + "\n";
                    input++;
                }
                String del1 = JOptionPane.showInputDialog("       List of Persons" + sentence + "\n\n" +
                        "Choose an entry you want to delete:");
                int index = Integer.parseInt(del1) - 1;
                
                collectInput.remove(index);
                
                JOptionPane.showMessageDialog(null, "Successfully deleted!");
                break;
            case 2://Deletes all entries
                String del2 = JOptionPane.showInputDialog("       Are you sure you want to delete all saved entries?" 
                + "\n" + "1. Yes" + "\n" + "2. No" + "\n\n" + "Enter number:");
                int num2 = Integer.parseInt(del2);
                switch(num2){
                    case 1://Yes(Clears all entries)
                        collectInput.clear();
                        
                        JOptionPane.showMessageDialog(null, "Entries are successfully deleted!");
                        break;
                    case 2://No(Goes backsto deleteItem())
                        deleteItem(collectInput);
                        break;
                }
                break;
            case 3://Goes back to mainMenu()
                mainMenu(collectInput);
        }
        mainMenu(collectInput);
    }
    public static void viewItem(ArrayList<addressBookEntry> collectInput){
        //View entry
        String sentence = "";
        int input = 1;
        for(addressBookEntry a : collectInput){
            String data1 = a.getname();
            String data2 = a.getaddress();
            String data3 = a.gettelephonNum();
            String data4 = a.getemailAdd();
            sentence += "\n" + input + ". " + "\n" + "Name: " + data1 + "\n" + "Address: " + data2 + "\n" + "Telephone Number: " + data3 + "\n" + "Email Address: " + data4 + "\n";
            input++;
        }
        JOptionPane.showMessageDialog(null, "       List of Persons" + sentence);
        
        mainMenu(collectInput);
    }
    public static void updateItem(ArrayList<addressBookEntry> collectInput){
        //Update entry
        String sentence = "";
        int input = 1;
        for(addressBookEntry a : collectInput){
            String data1 = a.getname();
            String data2 = a.getaddress();
            String data3 = a.gettelephonNum();
            String data4 = a.getemailAdd();
            sentence += "\n" + input + ". " + "\n" + "Name: " + data1 + "\n" + "Address: " + data2 + "\n" + "Telephone Number: " + data3 + "\n" + "Email Address: " + data4+ "\n";
            input++;
        }
        String u = JOptionPane.showInputDialog("       List of Persons" + sentence + "\n\n" +
                "Choose an entry to change:");
        int index = Integer.parseInt(u) - 1;
        collectInput.get(index).setname(JOptionPane.showInputDialog("Enter new name:"));
        collectInput.get(index).setaddress(JOptionPane.showInputDialog("Enter new address:"));
        collectInput.get(index).settelephoneNum(JOptionPane.showInputDialog("Enter new telephone number:"));
        collectInput.get(index).setemailAdd(JOptionPane.showInputDialog("Enter new email address:"));
        
        
        mainMenu(collectInput);
    }
    public static void mainMenu(ArrayList<addressBookEntry> collectInput){
        //Main menu
        String m = JOptionPane.showInputDialog("                         Home" + "\n"
        + "       1. Add Entry" + "\n" + "       2. Delete Entry" + "\n" + "       3. View all Entries"
        + "\n" + "       4. Update Entries" + "\n" + "       5. Exit" + "\n\n" + "Select option:");
        int option = Integer.parseInt(m); 
        switch(option){
            case 1:
                addItem(collectInput);
                break;
            case 2:
                deleteItem(collectInput);
                break;
            case 3:
                viewItem(collectInput);
                break;
            case 4:
               updateItem(collectInput);
                break;
            case 5:
                System.exit(0);
        }
    }    
}

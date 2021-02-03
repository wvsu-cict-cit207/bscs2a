package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static ArrayList<AddressBookEntry>  entry = new ArrayList<AddressBookEntry>();
 
public static void main(String[] args) {
        menu();
    }
public static void menu(){
        String input;
        Scanner in = new Scanner(System.in);
    
        System.out.println("Main Menu");  
        System.out.println("1. Add an Entry");
        System.out.println("2. Delete an Entry");
        System.out.println("3. View Entries");
        System.out.println("4. Update an Entry");
        System.out.println("5. Exit");
        System.out.print("Please enter Choices from 1 to 5: "); 
        input =(in.nextLine());
    

            switch (input) {
                case "1":
                    add();
                    menu();
                    break;
                    
                case "2":
                    delete();
                    menu();
                    break;

                case "3":
                    view();
                    menu();
                    break;
                case "4":
                    update();
                    menu();
                     break;
                case "5":
                    System.exit(0);
                    break;
                default:
                System.out.println("You have entered an invalid choice. Please try again");
                    break;
            }   
    }    

public static void add(){
        Scanner in = new Scanner(System.in);

        System.out.println("    === Add Entry === ");
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Address: ");
        String address = in.nextLine();
        System.out.print("Telephhone Number: ");
        String telephoneNum = in.nextLine();
        System.out.print("Email Address: ");
        String emailAddress= in.nextLine();
        AddressBookEntry data = new AddressBookEntry(name, address,  telephoneNum, emailAddress);
        entry.add(data);
        System.out.println("***AddedEntry/Entries\n");
    }
public static void delete(){ 
        Scanner in = new Scanner(System.in);
        
        System.out.println("    === Delete Entry ===");
            if(entry.isEmpty()){
                System.out.println("The list is empty " +"\n");
            }
            else{
                System.out.println("        List of Entries:");
                for(int i=0 ; i<entry.size();i++)
                    {
                    System.out.println( i + ". " + entry.get(i) + " ");
                    }
                System.out.println(" Enter the index that you want to delete: ");
                int num = in.nextInt();
                entry.remove(num);
                System.out.println("The data under index " + num + " was successfully deleted ");
            }
       }
public static void view(){
        System.out.println("    === View all Entries ===");
        if(entry.isEmpty()){
            System.out.println("The list is empty. \nPress 1 to add entries" );     
        }
        else{
            for(int i=0 ; i<entry.size();i++)
                    System.out.println(i+". "+ entry.get(i)+ " ");
            }
        }
public static void update(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("    === Update Entry ===");
        System.out.println(" List of Entries:");        
        for(int i=0 ; i<entry.size();i++){
            System.out.println(i+". "+ entry.get(i)+ " ");
        }

        try{    
            System.out.println("Enter index of the data that you want to update");
            int num=Integer.parseInt(in.nextLine()); //to avoid the scanner to skip the nextLine()          
            System.out.print("Name: ");
            String name=in.nextLine();
            System.out.print("Address: ");
            String address=in.nextLine();
            System.out.print("Telephone Number: ");
            String telephoneNum=in.nextLine();
            System.out.print("Email Address: ");
            String emailAddress=in.nextLine();
            AddressBookEntry data = new AddressBookEntry(name, address, telephoneNum, emailAddress);
            entry.set(num, data);
            System.out.println("The name " +name + " was successfully added to the list \n");
        } 
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of Bounds");   
        }


    }
}

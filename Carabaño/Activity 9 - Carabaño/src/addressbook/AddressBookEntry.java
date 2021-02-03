package addressbook;

import java.util.ArrayList;

public class AddressBookEntry {
    
    private String name;
    private String address;
    private String telephoneNum;
    private String emailAddress;
    
    static ArrayList<AddressBookEntry>  entry = new ArrayList<AddressBookEntry>();
//constructor   
//default constructor
    public AddressBookEntry(){
        this.name = "none" ;
        this.address = "none";
        this.telephoneNum = "none";
        this.emailAddress = "none";
    }
//constructor with two parameters
    public AddressBookEntry(String name, String address, String telephoneNum, String emailAddress){
        this.name = name;
        this.address = address;
        this.telephoneNum = telephoneNum;
        this.emailAddress = emailAddress;
    }

// mutator methods
     public void setName(String temp){
       this.name = temp;
    }
     
     public void setAddress(String temp){
       this.address= temp;
    }
     
     public void setTelephoneNum(String temp){
       this.telephoneNum= temp;
    }
     
    public void setEmailAddress(String temp){
       this.emailAddress = temp;
    }
   
//accessor methods
    public String getName(){ 
        return name;  
    }
    
    public String getAddress(){ 
        return address;  
    }
    
    public String getTelephoneNum(){
        return telephoneNum;
    }
    
    public String getEmailAddress(){
        return emailAddress;
    }
    
    public String toString(){
         return "Name: " + name + "\n    Address: " + address +
         "\n    Mobile Number: " + telephoneNum + "\n    Email Address: " + emailAddress;        
    }
}
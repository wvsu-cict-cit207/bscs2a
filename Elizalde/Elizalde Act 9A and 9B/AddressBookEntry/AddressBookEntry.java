//10.10.1 Address Book Entry
package AddressBookEntry;
public class AddressBookEntry{
    private String name;
    private String address;
    private String telephoneNumber;
    private String emailAddress;
    public AddressBookEntry(){
        //constructor
    }
    public AddressBookEntry(String name, String address, String telephoneNumber, String emailAddress){
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getTelephoneNumber(){
        return this.telephoneNumber;
    }
    public void setTelephoneNumber(String telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
}

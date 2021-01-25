package addressbook;
public class AddressBookEntry {
    private String name;
    private String address;
    private String telephoneNumber;
    private String emailAddress;

    public AddressBookEntry(String name, String address, String telephoneNumber, String emailAddress){
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
    }
    public String getname(){
        return this.name;
    }
    public void setname(String name){
        this.name = name;
    }
    
    public String getaddress(){
        return this.address;
    }
    public void setaddress(String address){
        this.address = address;
    }
    
    public String gettelephoneNumber(){
        return this.telephoneNumber;
    }
    public void settelephoneNumber(String telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }
    
    public String getemailAddress(){
        return this.emailAddress;
    }
    public void setemailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
}

package activity9;

public class AddressBookEntry {
    private String name;
    private String address;
    private String telNum;
    private String email;
    
    private static int contactCount;
    
    public AddressBookEntry () {
        contactCount++;
    }
    
    public AddressBookEntry(String name, String address, String telNum, String email) {
        this.name = name; 
        this.address = address;
        this.telNum = telNum;
        this.email = email;
        
        contactCount++;
    }
    
    public String getName (){
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getTelNum() {
        return telNum;
    }
    
    public String getEmail() {
        return email;
    }
    
    public static int getContactCount() {
        return contactCount;
    }
    
    public static void setContactCount(int count) {
        contactCount = count;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setTelNum (String telNum) {
        this.telNum = telNum;
    }
    
    public void setEmail (String email) {
        this.email = email;
    }
}

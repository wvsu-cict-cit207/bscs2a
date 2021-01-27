package addressbook;
public class addressbookEntry {
    private String name;
    private String address;
    private int telNumber;
    private String email;
    private static int totalCount;

    //Constructor
    
    public addressbookEntry() {
    }

    public addressbookEntry(String name, String address, int telNumber, String email) {
        this.name = name;
        this.address = address;
        this.telNumber = telNumber;
        this.email = email;
        totalCount++;
    }

    //Getters

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public String getEmail() {
        return email;
    } 

    public static int getTotalCount() {
        return totalCount;
    }
    
    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelNumber(int telNumber) {
        this.telNumber = telNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void setTotalCount() {//counter minus 1
        addressbookEntry.totalCount = totalCount-1;
    }
}

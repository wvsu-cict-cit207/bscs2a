package addressbook;

class AddressBookEntry {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public AddressBookEntry() {

    }
    public AddressBookEntry(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public String getNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setNumber(String telephoneNumber) {
        this.phoneNumber = telephoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
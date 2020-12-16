class AddressBookEntry {
    //Properties/Attributes
    private String name;
    private String address;
    private String telephoneNumber;
    private String emailAddress;
    
    //Constructor
    public AddressBookEntry() {
        
    }
    
    public AddressBookEntry(String name, String address, String telephoneNumber, String emailAddress) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.emailAddress = emailAddress;
    }
    
    //Accessor - get
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public String getNumber() {
        return telephoneNumber;
    }
    public String getEmail() {
        return emailAddress;
    }
    //Mutator - set
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    public void setEmail(String email) {
        this.emailAddress = email;
    }
}
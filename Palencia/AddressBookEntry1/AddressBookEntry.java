package AddressBookEntry1;

public class AddressBookEntry {
	
	private String name;
	private String address;
	private int telNum;
	private String email;

	public AddressBookEntry() {}

	public AddressBookEntry(String name, String address, int telNum, String email){
	        this.name = name;
	        this.address = address;
	        this.telNum = telNum;
	        this.email = email;
	}

	public String getName(){
	        return name;
	}
	public String getAddress(){
        	return address;
	}
	public int getTelNum(){
        	return telNum;
	}
	public String getEmail(){
        	return email;
}
	public void setName(String name){
	        this.name = name;
	}

	public void setAddress(String address){
	        this.address = address;
	}

	public void setTelNum(int telNum){
	        this.telNum = telNum;
	}

	public void setEmailAddress(String emailaddress){
	        this.email = email;
	        }

	public String toString(){
	        return "Name: " + name + ", Address: " + address +
	        ", Telephone Number: " + telNum + ", Email Address: " + email;
	  }
}

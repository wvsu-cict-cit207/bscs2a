 //10.10.2 Address Book Entry
package addressbook;
public class addressBookEntry {

    private String name;
    private String address;
    private String telephoneNum;
    private String emailAdd;
    
    public addressBookEntry(String name, String address, String telephoneNum, String emailAdd){
        this.name = name;
        this.address = address;
        this.telephoneNum = telephoneNum;
        this.emailAdd = emailAdd;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getaddress(){
        return address;
    }
    public void setaddress(String address){
        this.address = address;
    }
    public String gettelephonNum(){
        return telephoneNum;
    }
    public void settelephoneNum(String telephoneNum){
        this.telephoneNum = telephoneNum;
    }
    public String getemailAdd(){
        return emailAdd;
    }
    public void setemailAdd(String emailAdd){
        this.emailAdd = emailAdd;
    } 
}
  

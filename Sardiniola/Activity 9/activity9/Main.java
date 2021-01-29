
package activity9;

public class Main {
    public static void main (String[] args) {
        AddressBook a = new AddressBook();
        
        a.add("Vernon Chwe", "New York", "0217", "vernon@gmail.com");
        a.add("Xu Minghao", "China", "2366", "the8@gmail.com");
        a.add("Kim Mingyu", "South Korea", "2345", "mingyu@gmail.com");
        a.add("Lee Dokyeom", "South Korea", "3456", "dk@gmail.com");
        
        
        a.view();
        a.delete("Vernon Chwe");
        a.view();
//        for (int i = 0; i < a.getCount(); i++) {
//             System.out.println(a.view()[i].getName()+ "\n" + a.view()[i].getAddress() + "\n" + a.view()[i].getTelNum() + "\n" + a.view()[i].getEmail());
//        }
        
        a.add("Hoshi", "South Korea", "4567", "hoshi@gmail.com");
//        for (int i = 0; i < a.getCount(); i++) {
//             System.out.println(a.view()[i].getName()+ "\n" + a.view()[i].getAddress() + "\n" + a.view()[i].getTelNum() + "\n" + a.view()[i].getEmail());
//             System.out.println("========================================================");
//        }
a.view();
    }
}

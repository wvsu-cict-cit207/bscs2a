package activity5;
import java.util.Scanner;
public class number2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ITEM NO.2");
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        
        for (int i = 0; i < a; i++) {
            System.out.print("*  ");
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
    }
}
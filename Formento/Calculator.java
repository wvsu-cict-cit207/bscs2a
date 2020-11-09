
package calculator;
import java.util.Scanner;

public class Calculator {

  
    public static void main(String[] args) {
     Scanner s =new Scanner(System.in);
     System.out.print("1st number: ");
     int n1= s.nextInt();
     System.out.print("2nd number: ");
    int n2= s.nextInt();
    System.out.println("n1 + n2 = " + (n1+n2));
    System.out.println("n1 * n2 = " + (n1*n2));
    System.out.println("n1 - n2 = " + (n1-n2));
    System.out.println("n1 / n2 = " + (n1/n2));
    System.out.println("n1 % n2 = " + (n1%n2));


    }
    
}

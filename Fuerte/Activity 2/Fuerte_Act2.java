import java.util.Scanner;
public class Fuerte_Act2 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: "); 
        int x = Integer.parseInt(input.nextLine());
        System.out.println("Enter the second number: "); 
        int y = Integer.parseInt(input.nextLine());
        System.out.println("Sum: " + (x+y)); 
        System.out.println("Difference: " + (x-y));
        System.out.println("Product: " + (x*y));
        System.out.println("Quotient: " + (x/y));
        System.out.println("Remainder: " + (x%y));
    }
    
}

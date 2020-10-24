package sumproductdifferencequotient;
import java.util.Scanner;
public class SumProductDifferenceQuotient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int int1 = in.nextInt();
        System.out.print("Enter 2nd integer: ");
        int int2 = in.nextInt();
        
        System.out.print("\n");
        System.out.printf("Sum = %d%n", int1 + int2);
        System.out.printf("Product = %d%n", int1 * int2);
        System.out.printf("Difference = %d%n", int1 - int2);
        System.out.printf("Quotient = %d%n", int1 / int2);
        System.out.printf("Remainder = %d%n", int1 % int2);
    }
    
}

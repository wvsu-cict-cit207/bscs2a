import java.util.Scanner;

public class Act2
{

   public static void main(String[] args) 
   {
        
  
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number :");
        int num1 = in.nextInt();
        System.out.println("Enter second number :");
        int num2 = in.nextInt();
        

        int sum 	= num1 + num2;
        int difference 	= num1 - num2;
        int product 	= num1 * num2;
        int quotient	= num1 / num2;
        int modulo	= num1 % num2;
        

        // Print result to console.
        System.out.println(num1  +  " + " + num2  + " = "  + sum);
        System.out.println(num1  +  " - " + num2  + " = "  + difference);
        System.out.println(num1  +  " * " + num2  + " = "  + product);
        System.out.println(num1  +  " / " + num2  + " = "  + quotient);
        System.out.println(num1  +  " % " + num2  + " = "  + modulo);
    }
}
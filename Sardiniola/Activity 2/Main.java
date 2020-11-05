import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main (String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        String num1 = "";
        String num2 = "";
        
        //Get user input
        try {
            System.out.print("Enter 1st number: ");
            num1 = dataIn.readLine();
            
            System.out.print("Enter 2nd number: ");
            num2 = dataIn.readLine();
        }
        catch (IOException e) {
            System.out.println(e.toString());
        }
        
        //Typecast
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        
        int sum = n1 + n2;
        int difference = n1 - n2;
	int product = n1 * n2;
        int qoutient = n1 / n2;
        int remainder = n1 % n2;
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
	System.out.println("Product: " + product);
        System.out.println("Qoutient: " + qoutient);
        System.out.println("Remainder: " + remainder);
    }
}
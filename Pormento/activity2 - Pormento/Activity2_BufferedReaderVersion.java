import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Activity2_BufferedReaderVersion {
    public static void main(String[] args) {
        //Buffered Reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        try {
            String numStr1 = br.readLine();
            System.out.print("Enter second number: ");
            String numStr2 = br.readLine();
            
            int num1 = Integer.parseInt(numStr1);
            int num2 = Integer.parseInt(numStr2);
            
            System.out.println((num1) + " + " + (num2) + " = " + (num1+num2));
            System.out.println((num1) + " - " + (num2) + " = " + (num1-num2));
            System.out.println((num1) + " * " + (num2) + " = " + (num1*num2));
            System.out.println((num1) + " / " + (num2) + " = " + (num1/num2));
            System.out.println((num1) + " % " + (num2) + " = " + (num1%num2));
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
}

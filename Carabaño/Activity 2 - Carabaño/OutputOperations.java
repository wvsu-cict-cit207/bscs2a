package outputoperations;

import java.io.*;

public class OutputOperations {
 
    public static void main(String[] args) {
       BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
       try{
           System.out.print("Enter a number: ");
           String num1Str = br.readLine();
           System.out.print("Enter another number: ");
           String num2Str = br.readLine();
           
           //conversion from String to int
           int num1 = Integer.parseInt(num1Str);
           int num2 = Integer.parseInt(num2Str);
           
           System.out.println("The sum of two numbers: " + num1+ " + " + num2+ " = " + (num1 + num2));
           System.out.println("The product of two numbers: " + num1+ " * " + num2+ " = " + (num1 * num2));
           System.out.println("The difference of two numbers: " + num1+ " - " + num2+ " = "+ (num1 - num2));
           System.out.println("The qoutient of two numbers: " + num1+ " / " + num2+ " = " + (num1 / num2));
           System.out.println("The remainder of two numbers: " + num1+ " % " + num2+ " = " + (num1 % num2));  
       }
       catch(Exception e)
       {
         System.out.println(e);
       }
    }   
}

package javaapplication.Activity1;

import java.util.Scanner;

public class Sum_Difference_Product_Qoutient_Remainder_Of_Two_Numbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter first number: ");
        int num = scanner.nextInt();
        
        System.out.print("\nEnter second number: ");
        int num2 = scanner.nextInt();
        
        int add = num + num2;
        int subtract = num - num2;
        int multiply = num * num2;
        int divide = num / num2;
        int remainder = num % num2;
        
        System.out.println("Addition: " + num + " + " + num2 + " = " + add);
        System.out.println("Subtraction: " + num + " - " + num2 + " = " + subtract);
        System.out.println("Multiplication: " + num + " * " + num2 + " = " + multiply);
        System.out.println("Division: " + num + " / " +  num2 + " = " + divide);
        System.out.println("Modulus: " + num + " % " + num2 + " = " + remainder);
        
    }

}
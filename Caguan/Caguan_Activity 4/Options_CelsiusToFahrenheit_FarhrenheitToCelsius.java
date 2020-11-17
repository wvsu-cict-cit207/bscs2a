package javaapplication.Activity1;

import java.util.Scanner;

public class Options_CelsiusToFahrenheit_FarhrenheitToCelsius {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Options "
                + "\n (1) Celsius to Farhenheit "
                + "\n (2) Fahrenheit to Celsius"
                + "\n Choose: ");
        
        int opt = scanner.nextInt();
        
        double fahr, cel;
        switch(opt){
            case 1:
                System.out.print("\n Degree Celsius: ");
                cel = scanner.nextDouble();
        
                fahr = cel * 9/5 + 32;
        
                System.out.println(cel + " degrees Celsius = " + fahr + " degrees Fahrenheit");
                break;
            case 2:
                System.out.print("\n Degree Fahrenheit: ");
                fahr = scanner.nextDouble();
        
                cel = (fahr - 32) * 5/9;
        
                System.out.println(fahr + " degrees Fahrenheit = " + cel + " degrees Celsius");
                break;
            default:
                System.out.println("Invalid Choice!");
                break;
        }
        
    }
}

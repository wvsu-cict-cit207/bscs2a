package javaapplication.Activity1;

import java.util.Scanner;

public class Celsius_to_Farhenheit {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Degrees Celsius: ");
        double cel = scanner.nextDouble();
        
        double fahr = cel * 9/5 + 32;
        
        System.out.println(cel + " degrees Celsius = " + fahr + " degrees Fahrenheit");
    }
}

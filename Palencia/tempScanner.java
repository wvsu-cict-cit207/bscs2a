package activity3;

import java.util.Scanner;

public class tempScanner{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a temperature in Celsius: ");
        float C = sc.nextFloat();
        float F = C * (9f / 5) + 32;
        System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");
       
    }
}
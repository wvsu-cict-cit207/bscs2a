
package javaactivity4;
import java.util.Scanner;

public class JavaActivity4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Click 1 to convert Celsius to Fahrenheit. ");
        System.out.println("Click 2 to convert Fahrenheit to Celsius. ");

        int choice = sc.nextInt();

        double temperature;
        double converted;

        if (choice == 1) {

            System.out.println("Enter the temperature in Celsius. ");
            temperature = sc.nextDouble();
            converted = (temperature * 9 / 5.0) + 32;
            System.out.println("Temperature in fahrenheit= " + converted);

        } else if (choice == 2) {

            System.out.println("Enter the temperature in Fahrenheit.");
            temperature = sc.nextDouble();
            converted = (temperature - 32) * 5 / 9.0;
            System.out.println("Temperature in celsius= " + converted);
        }

    }

}

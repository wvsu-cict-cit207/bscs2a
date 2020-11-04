// @author Maria Arlyn Fuerte (BSCS 2A)

import java.util.Scanner;

public class Fuerte_Act4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to convert?");
        System.out.println("Choices:");
        System.out.println("(1) Celsius(°C) to Fahrenheit(°F)");
        System.out.println("(2) Fahrenheit(°F) to Celsius(°C)");
        System.out.print("Enter Choice: ");
        int choice = Integer.parseInt(input.nextLine());
        System.out.println("---------------------------");
        double celsius;
        double fahrenheit;
        switch (choice){
            case 1 -> {
                System.out.print("\nEnter temperature in Celsius(°C): ");
                celsius = Double.parseDouble(input.nextLine());
                fahrenheit = (9 * celsius/5 + 32);
                System.out.println("The Temperature in Fehrenheit is " + fahrenheit);
                System.out.println(celsius + "°C = " + fahrenheit + "°F");
            }
            case 2 -> {
                System.out.print("\nEnter temperature in Fahrenheit(°F): ");
                fahrenheit = Double.parseDouble(input.nextLine());
                celsius = (fahrenheit - 32 * 5/9);
                System.out.println("The Temperature in Celsius is " + celsius);
                System.out.println(fahrenheit + "°F = "+ celsius + "°C");
            }
            default -> System.out.println("Invalid Input");
        }
    }
}

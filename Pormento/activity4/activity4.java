package activity4;
import java.util.Scanner;
public class activity4 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int op;
        double num;
        System.out.println("Temperature Converter Java Edition");
        System.out.println("1. Celsius - Fahrenheit\n2. Fahrenheit - Celsius ");
        System.out.print("Enter Choice: ");
        op = sc.nextInt();
        switch (op){
            case 1: //Celsius - Fahrenheit
                System.out.println("\nCelsius - Fahrenheit");
                System.out.print("Enter Value: ");
                num = sc.nextDouble();
                System.out.println("Fahrenheit: " + ((num*1.8)+32));
                break;
                
            case 2: //Fahrenheit - Celsius
                System.out.println("\nFahrenheit - Celsius");
                System.out.print("Enter Value: ");
                num = sc.nextDouble();
                System.out.println("Celsius: " + (num-32)/1.8);
                break;
            default:
                System.out.println("Invalid Selection");
        }
    }
}

package activity3;
import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double num = sc.nextDouble();
        System.out.println("Temperature in Fahrenheit: " + ((num*1.8)+32)); //multiply by 1.8 and add 32
    }
}
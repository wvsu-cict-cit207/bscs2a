import java.util.Scanner;
public class Fuerte_Act3 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius(°C): ");
        double celsius = Double.parseDouble(input.nextLine());
        double fahrenheit = (9*celsius/5 + 32);
        System.out.println("The temperature in Fahrenheit: " + fahrenheit + "°F");
    }
    
}

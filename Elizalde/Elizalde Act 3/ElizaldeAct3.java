import java.util.Scanner;
        
public class ElizaldeAct3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Temperature in Celsius: ");
        double celsius = Double.parseDouble(input.nextLine());
        double fahrenheit = (((9*celsius)/5) + 32);
        System.out.println("Temperature in Fahrenheit: "+fahrenheit);
        
    }
}

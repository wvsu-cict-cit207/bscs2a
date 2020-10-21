import java.util.Scanner;
        
public class ElizaldeAct4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choices:");
        System.out.println("1 - Celsius to Fahrenheit");
        System.out.println("2 - Fahrenheit to Celsius");
        System.out.print("Enter Choice: ");
        int choice = Integer.parseInt(input.nextLine());
        double celsius;
        double fahrenheit;
        switch(choice){
            case 1:
                System.out.print("Enter value in  Celsius (°C): ");
                celsius = Double.parseDouble(input.nextLine());
                fahrenheit = (((9*celsius)/5) + 32);
                System.out.println(celsius + " °C = " + fahrenheit + " °F");
                break;
            case 2:
                System.out.print("Enter value in Fahrenheit (°F): ");
                fahrenheit = Double.parseDouble(input.nextLine());
                celsius = (((fahrenheit - 32)*5)/9);
                System.out.println(fahrenheit + " °F = "+ celsius + " °C");
                break;
            default:
                System.out.println("Invalid Input");
        }
        
        
    }
}

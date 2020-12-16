
package celsiustofahrenheit;
import java.util.Scanner;

public class Celsiustofahrenheit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Celsius to Fahrenheit");
        double fahr, cel;
        System.out.print("Degree Celsius: ");
        cel=s.nextDouble();
        fahr=cel*9/5 +32;
        System.out.println(cel + "°C is " + fahr + "°F");
 
    }
    
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CelsiusFahrenheit {
    public static void main (String[] args) {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        try{
        System.out.println("Options: \n1) Celsius to Fahrenheit \n2 Fahrenheit to Celsius");
        System.out.print("Enter the number of your option: ");
        int option = Integer.parseInt(in.readLine());
        if (option > 2) {
            System.err.println("Invalid input!");
            return;
        }
        if (option == 1) {
            //Celsius to Fahrenheit
            System.out.print("Enter temperature value in Celsius: ");
            double celsius = Double.parseDouble(in.readLine());
            
            double convertedFahrenheit = ((celsius * 9)/5) + 32;
            System.out.println(celsius + " degree Celsius = " + convertedFahrenheit + " degree Fahrenheit");
        }
        else if (option == 2) {
            //Fahrenheit to Celsius
            System.out.print("Enter temperature value in Fahrenheit: ");
            double fahrenheit = Double.parseDouble(in.readLine());
            
            double convertedCelsius = ((fahrenheit-32) * 5) / 9;
            System.out.println(fahrenheit + " degree Fahrenheit = " + convertedCelsius +  " degree Celsius");
        }
        }
        catch(IOException e) {
            System.err.println(e);
        }
    }
}
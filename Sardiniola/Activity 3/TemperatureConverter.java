import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TemperatureConverter {
    public static void main (String[] args) {
        
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        try {
            System.out.print("Enter temperature (in Celsius): ");
            String strTempInCelsius = dataIn.readLine();
            
            //Typecast
            double tempInCelsius = Double.parseDouble(strTempInCelsius);
            
            //Solve
            double tempInFahrenheit = (1.8*tempInCelsius) + 32;
            
            System.out.println("Temperature in Fahrenheit: " + tempInFahrenheit);
        }
        catch (IOException e) {
            System.err.println(e);
        }
    }
}
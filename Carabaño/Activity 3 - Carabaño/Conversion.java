package conversion;
import java.io.*;
public class Conversion {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        try{
           System.out.print("Enter temperature in Celsius: ");
           String celsiusStr = br.readLine();
           
          //convert String to float
          float celsius = Float.parseFloat(celsiusStr);
          float farenheit = ((celsius * 9)/5)+32;
          
          System.out.println("The temperature in Farenheit is: " + farenheit);
           
    }
      catch(Exception e)
      {
         System.out.println(e);
       }
    }
}
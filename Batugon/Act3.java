
package act3;

import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Degrees Celcius: ");
      float cel = sc.nextFloat();
      float fahr = cel * 9/5 + 32;
      System.out.println(cel + " degrees Celsius = " + fahr + " degrees Fahrenheit ");
           
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiusfahrenheit;
import java.util.Scanner;
/**
 *
 * @author Shaina Gencianeo
 */
public class CelsiusFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double a;
        double total=0;
        
        int option;
        System.out.println("***** O P T I O N ******");
        System.out.println("1] Celsius - Fahrenheit");
        System.out.println("2] Fahrenheit - Celsius");
        option= scan.nextInt();
        if(option==1)
        {
            System.out.println("Enter Temperature in Celsius");
            a=scan.nextDouble();
            total= a/5*9+32;
            System.out.println("Celsius - Fahrenheit");
            System.out.println(a + " Celsius = " + total + " Fahrenheit");
            }
        else if( option==2)
        {
            System.out.println("Enter Temperature in Fahrenheit");
            a=scan.nextDouble();
            total= a-32*5/9;
            System.out.println("Fahrenheit - Celsius");
            System.out.println(a + " Fahrenheit = " + total + " Celsius");
            
        }
        else
            System.out.println("Invalid Input");
        // TODO code application logic here
    }
    
}

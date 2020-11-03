/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Activity3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Celcius: ");
        double celsius = input.nextDouble();

        double  fahrenheit =((celsius*9)/5)+32;
        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");
    }
    
}

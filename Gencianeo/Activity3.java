/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity3;
import java.util.Scanner;
/**
 *
 * @author Shaina Gencianeo
 */
public class Activity3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double a;
        double total;
        System.out.println("Enter temperature in Celsius");
        a=scan.nextDouble();
        total= a/5*9+32;
        System.out.println(a +" Celsius = "+ total + " Farenheit");
        // TODO code application logic here
    }
    
}

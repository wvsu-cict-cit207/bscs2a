/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Activity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int num1 = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int num2 = in.nextInt();

        System.out.printf("Sum: %d%n", num1 + num2);
        System.out.printf("Product: %d%n", num1 * num2);
        System.out.printf("Difference: %d%n", num1 - num2);
        System.out.printf("Quotient: %d%n", num1 / num2);
        System.out.printf("Remainder: %d%n", num1 % num2);
        
        
    }
}

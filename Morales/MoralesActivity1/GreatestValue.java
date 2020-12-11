/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatestvalue;

/**
 *
 * @author Admin
 */
public class GreatestValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 10, b = 23, c = 5;
        int greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("number 1 = " + a);
        System.out.println("number 2 = " + b);
        System.out.println("number 3 = " + c);
        System.out.println("The highest number is = " + greatest);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaacitivty3;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class JavaAcitivty3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input temperature in celsius");
        
        float dc = scan.nextFloat();
        System.out.println("Your temperature in Fahrenheit is:" + ((dc*1.8)+32));
    }
    
    
}

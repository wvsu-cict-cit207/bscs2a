/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivity2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class JavaActivity2 {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,sum,difference,product,quotient,remainder;
        System.out.println("Enter two numbers");
        
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        
        sum = num1+num2;
        product = num1*num2;
        difference = num1-num2;
        quotient = num1/num2;
        remainder = num1%num2; 
        
        System.out.println("sum: "+sum);
        System.out.println("product: "+product);
        System.out.println("diffrence: "+difference);
        System.out.println("quotient: "+quotient);
        System.out.println("remainder: "+remainder);
        
        
        
    }  
    
}

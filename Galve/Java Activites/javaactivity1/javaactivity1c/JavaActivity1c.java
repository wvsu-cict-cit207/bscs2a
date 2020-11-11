/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaactivity1c;

/**
 *
 * @author ACER
 */
public class JavaActivity1c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, num2, num3, highestNum;
        
        num1 = 10;
        num2 = 23;
        num3 = 5;
        

        highestNum = num3(num1>num2 ? num1:num2)? num3:((num1>num2)?num1:num2);
        System.out.println("number 1: "+num1);
        System.out.println("number 2: "+num2);
        System.out.println("number 3: "+num3);
        System.out.println("The highest number is "+highestNum);


                
         
                
              
    }

    public static boolean num3(int i) {
       return false;
    }
    
}

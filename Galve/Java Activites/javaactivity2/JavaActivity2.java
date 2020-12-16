package javaactivity2;

import java.util.Scanner;

    public class JavaActivity2 
   
         public static void main(String[] args) {
        
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

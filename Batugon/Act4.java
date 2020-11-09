
package act4;

import java.util.Scanner;

public class Act4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Options: " 
                + "\n 1 Celsius to Farhenheit " 
                + "\n 2 Fahrenheit to Celsius " 
                + "\n Enter Option: ");
        int opt = sc.nextInt();
        double cel, fahr;
        switch(opt){
            case 1:
                System.out.print(" Degree Celsius: ");
                cel = sc.nextDouble();
                fahr = cel * 9/5 + 32;
                System.out.println(cel + " degrees Celsius = "
                        + fahr + " degrees Fahrenheit ");
                        break;
            case 2:
                System.out.println(" Degree Fahrenheit: ");
                fahr = sc.nextDouble();
                cel = fahr - 32 * 5/9;
                System.out.println(fahr + " degrees Fahrenheit = "
                        + cel + " degrees Celsius ");
                        break;            
                                
        }
        
    }
    
}

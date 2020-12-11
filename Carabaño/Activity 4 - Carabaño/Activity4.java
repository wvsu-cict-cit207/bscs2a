package activity4;
import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {
       int choice;
       double temp;
       Scanner input = new Scanner(System.in);
       
        System.out.println("Options");
        System.out.println("1. C -> F ");
        System.out.println("2. F -> C ");
        System.out.println("Enter your Choice: ");
       
        choice = input.nextInt();
        
        System.out.println("Enter Value: ");
        temp = input.nextDouble();
        
         switch(choice){
            case 1:
                // C -> F
                double fahrenheit = (temp * 9/5) + 32;
                System.out.println(temp +" degrees Celsius = "+ fahrenheit +" degees Fahrenheit");
                break;
            case 2:
                // F -> C
                double celsius = (temp - 32) * 5/9 ;
                System.out.println(temp +" degrees Fahrenheit = "+ celsius +" degees Celsius");
                break;
            }
      }
}
 
    
    


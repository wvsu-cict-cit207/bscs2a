
package temperatureconverter;

import java.util.Scanner;


public class TemperatureConverter {
public static void main(String[] args) {
 double fahr,cel;
      Scanner sc=new Scanner(System.in);
	    System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit ");
                   int ch=sc.nextInt();
	    switch(ch)
	    {
	    case 1:  System.out.println("Enter  Fahrenheit temperature");
                   	  fahr=sc.nextDouble();
	    	  cel=(fahr-32)*5/9;
	    	  System.out.println("Celsius temperature is = "+cel);
		  break;
	    case 2:  System.out.println("Enter  Celsius temperature");
                   	  cel=sc.nextDouble();
	    	  fahr=((9*cel)/5)+32;
	    	  System.out.println("Fahrenheit temperature is = "+fahr);
		  break;
	   default:  System.out.println("please choose valid choice");
	   }  
            
    
    }
}

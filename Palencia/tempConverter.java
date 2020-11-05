import java.util.Scanner;
public class tempConverter {

	public static void main(String[] args) {
	    double celsius;
	    double fahrenheit;
 	    Scanner sc =new Scanner(System.in);
 	    System.out.println("Options \r\n 1.C => F  \r\n 2.F => C");
 	    System.out.print("Enter Choice:");
 	    
 	    int choice =sc.nextInt();
 	    
 	    switch(choice){
 	    	case 1:  
 	    		System.out.println("Enter Value:");
       	  		celsius=sc.nextDouble();
       	  		fahrenheit=((9*celsius)/5)+32;
       	  		System.out.println(celsius + " degrees Celsius"+ " = "+ fahrenheit + " degrees Fahrenheit");
       	  		break;
 	    	case 2:  
 	    		System.out.println("Enter Value: ");
 	    		fahrenheit=sc.nextDouble();
 	    		celsius=(fahrenheit-32)*5/9;
 	    		System.out.println(fahrenheit + " degrees fahrenheit"+ " = "+ celsius + " degrees celsius");
 	    		break;
 	    	default:  
 	    		System.out.println("Invalid number");
       } 

	}

}

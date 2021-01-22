import java.util.Scanner;

public class Temperature 
{
     
    public static void main (String args[])
	{
		Scanner scan= new Scanner(System.in);

		System.out.println("Enter 1 to convert from C to F: ");
		System.out.println("Enter 2 to convert from F to C.");
		int choice = scan.nextInt();
		
		double temperature= 0.0;
		double converted= 0.0;

		if(choice==1)
			{
				System.out.println("Enter the temperature in Celcius.");
				temperature = scan.nextDouble();
				converted = 9/5*temperature+32;
				System.out.println("Celcius in Farenheit = " + converted);
			}
	
		else if(choice==2)
			{
				System.out.println("Enter the temperature in Farenheit.");
				temperature = scan.nextDouble();
				converted = (temperature - 32) * 5/9;
				System.out.println("Farenheit in Celcius = " + converted);
			}

		else 
			System.out.println("Error. Wrong Input. Please try again");
	}
}
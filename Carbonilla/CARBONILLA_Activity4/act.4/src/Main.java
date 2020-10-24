import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter 1 to convert Fahrenheit to Celsius");
        System.out.println("Enter 2 to convert Celsius to Fahrenheit");

        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);
        if (ch=='1')
        {
            System.out.println("Enter Fahrenheit value");
            double f = scan.nextDouble();
            double c = (f-32)*5/9;
            System.out.println( f+" in Fahrenheit, "+ c + " in Celsius ");
        }

        else if (ch=='2')
        {
            System.out.println("Enter Celsius value");
            double c = scan.nextDouble();
            double f = c*9/5+32;
            System.out.println( c + " in Celsius, " + f + " in Fahrenheit");
        }

        else
        {
            System.out.println("Invalid Entry");
        }
    }
}
package convertedtemp;
import java.util.Scanner;
public class ConvertedTemp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Option" + "\n");
        System.out.print("1. C --> F" + "\n");
        System.out.print("2. F --> C" + "\n");
        System.out.print("Enter option: ");
        int option = in.nextInt();
        switch(option){
            case 1:
                System.out.print("Enter value: ");
                float C = in.nextFloat();
                float F = C * (9f / 5) + 32;
                System.out.print(C + " degrees Celsius = " + F + " degrees Farenheit" + "\n");
                break;
            case 2:
                System.out.print("Enter value: ");
                double f = in.nextFloat();
                double c = (( 5 *(f - 32.0)) / 9.0);
                System.out.print(f + " degress Farenheit = " + c + " degrees Celsius" + "\n");
                break;
            
        }
    }
    
}

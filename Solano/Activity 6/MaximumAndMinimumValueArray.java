package maximumandminimumvaluearray;
import java.util.Scanner;
public class MaximumAndMinimumValueArray {

    public static void main(String[] args) {
        int digit[] = new int [10];
        Scanner input=new Scanner (System.in);
        
        System.out.print("Enter elements of array: ");
        
        for(int i=0; i<=9; i++){
            digit [i] = input.nextInt();
        }
        int smallest=digit[0];
        int largest=digit[0];
        
        for (int i=0; i<=9; i++){
            if (digit[i]<smallest) smallest=digit[i];
            if (digit[i]>largest) largest=digit[i];
        }
        System.out.println("Smallest value is: " + smallest);
        System.out.println("Largest value is: " + largest);
        }
      }
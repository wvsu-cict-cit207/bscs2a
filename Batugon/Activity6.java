
package activity6;

import java.util.Scanner;
import java.util.Arrays;

public class Activity6 {
  
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int[] myArray = new int[10];
      
      System.out.println("Enter Values: ");
      for (int i = 0; i < myArray.length; i++ ){
           int j = input.nextInt();
          myArray[i] = j;
      }
                Arrays.sort(myArray);
      System.out.println("Maximum number = " + myArray[myArray.length - 1]
      + " Minimum number = " + myArray[0]);
    }
    
}

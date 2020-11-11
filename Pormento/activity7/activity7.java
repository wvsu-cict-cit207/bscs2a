package activity7;
import java.util.Scanner;
public class activity7 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size (in integers): ");
        int n = sc.nextInt();
        int[] array1;
        array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();
            array1[i] = number;
        }
        System.out.println();
        System.out.println("Array Elements: ");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        int max = getMax(array1);
        int min = getMin(array1);
        
        System.out.println();
        System.out.println("Maximum value: "+max);
        System.out.println("Minimum value: "+min);
    }
    
    public static int getMax(int[] inputArray){ 
    int maxValue = inputArray[0]; 
    for(int i=1;i < inputArray.length;i++){ 
      if(inputArray[i] > maxValue){ 
         maxValue = inputArray[i]; 
      } 
    } 
    return maxValue; 
  }
    public static int getMin(int[] inputArray){ 
    int minValue = inputArray[0]; 
    for(int i=1;i<inputArray.length;i++){ 
      if(inputArray[i] < minValue){ 
        minValue = inputArray[i]; 
      } 
    } 
    return minValue; 
  } 
}
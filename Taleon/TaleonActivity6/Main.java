import java.util.*;

public class Main{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        
        //Receiving Input
        System.out.println("Print 10 integers:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i+1 + ": ");
            array[i] = sc.nextInt();
        }
        
        //Sort Array
        Arrays.sort(array);
        
        //Print Min and Max
        System.out.println("\nMin: " + array[0]);
        System.out.println("Max: " + array[array.length-1]);
    }
}
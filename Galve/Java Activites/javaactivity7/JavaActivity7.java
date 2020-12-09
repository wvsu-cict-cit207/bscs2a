package javaactivity7;
import java.util.*;
public class JavaActivity7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<Integer>();
        
        System.out.print("Input number of elements in the array: ");
        int size = sc.nextInt();
        
        System.out.println("Enter " + size + " numbers.");
        for(int i = 0; i < size; i++){
            System.out.print("");
            int digit = sc.nextInt();
            numList.add(digit);
            
        }
        System.out.println("Largest element: " + max(numList));
        System.out.println("Smallest element: " + min(numList));
    }
    public static int min(ArrayList<Integer> list){
        int min = list.get(0);
        for(int a = 0; a < list.size(); a++){
            if(list.get(a) < min){
                min = list.get(a);
            }
        }
        return min;
    }
    public static int max(ArrayList<Integer> list){
        int max = 0;
        for(int a = 0; a < list.size(); a++){
            if(list.get(a) > max){
                max = list.get(a);
            }
        }
        return max;
    }
}

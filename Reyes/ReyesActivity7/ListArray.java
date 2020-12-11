package listarray;
import java.util.Scanner;
public class ListArray {
    public int max(int[]array){
        int max = 0;
        for(int x = 0; x < array.length; x++){
            if(array[x] > max){
                max = array[x];
            }
        }
        return max;
    } 
    public int min(int[]array){
        int min = array[0];
        for(int x = 0; x < array.length ; x++){
            if(array[x] < min){
                min = array[x];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a = in.nextInt();
        System.out.print("Enter " + a + " integers." +"\n");
        int [] array;
        array = new int [a];
        for(int i=0; i<array.length; i++){
            System.out.print("");
            int num = in.nextInt();
            array[i] = num;
        }
        ListArray l = new ListArray();
        System.out.println("Largest element: " + l.max(array) + " Smallest element: " + l.min(array));
    }
}
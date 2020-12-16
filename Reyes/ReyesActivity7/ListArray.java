package listarray;
import java.util.Scanner;
import java.util.ArrayList;
public class ListArray {
    public static int max(ArrayList<Integer> array){
        int max = 0;
        for(int x = 0; x < array.size(); x++){
            if(array.get(x) > max){
                max = array.get(x);
            }
        }
        return max;
    } 
    public static int min(ArrayList<Integer> array){
        int min = array.get(0);
        for(int x = 0; x < array.size(); x++){
            if(array.get(x) < min) {
                min = array.get(x);
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<Integer>();
        
        System.out.print("Enter the size of the array: ");
        int a = in.nextInt();
        
        System.out.print("Enter " + a + " integers." +"\n");
        for(int i = 0; i < a; i++){
            System.out.print("");
            int num = in.nextInt();
            intList.add(num);
        }
        System.out.println("Largest element: " + max(intList) + " Smallest element: " + min(intList));
    }
}
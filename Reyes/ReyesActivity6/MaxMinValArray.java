package maxminvalarray;
import java.util.Arrays;
public class MaxMinValArray {
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
    public static void main(String args[]){
        int[] Array = {22, 54, 39, 11, 47, 68, 98, 73, 85, 101};
        MaxMinValArray m = new MaxMinValArray();
        System.out.println("Array: " + Arrays.toString(Array));
        System.out.println("Max Value = " +m.max(Array));
        System.out.println("Min Value = " +m.min(Array));
    }
}

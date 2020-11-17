package javaapplication.Activity1;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    public static Integer findMin(ArrayList<Integer> list){
        Integer min = Integer.MAX_VALUE;
        
        for(Integer i : list){
            if(min > i){
                min = i;
            }
        }
        return min;
    }
    public static Integer findMax(ArrayList<Integer> list){
        Integer max = Integer.MIN_VALUE;
        
        for(Integer i : list){
            if(max < i){
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int i, j, value, size, min, max;
        System.out.print("Enter the size of the array: ");
        
        size = scanner.nextInt();
        
        System.out.print("\nEnter " + size + " values: ");
        for(i = 0; i < size; i++){
            value = scanner.nextInt();
            numbers.add(value);
        }
        
        System.out.println("Largest value = " + findMax(numbers));
        System.out.println("Smallest value = " + findMin(numbers));
    }
}

//@author Maria Arlyn R. Fuerte (BSCS-2A)
//Activity 7

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Fuerte_Act7 {

    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        ArrayList <Integer> list = new ArrayList <Integer>();
        int num = size.nextInt();
        
        System.out.println("Enter " + num + " numbers: ");
        for (int n = 0; n < num; n++){
            list.add(size.nextInt());
        }
        
        Collections.sort(list);
        System.out.println(list);
        System.out.println("---------------------");
        System.out.println(list.get(num-1)+ " is the largest number");
        System.out.println(list.get(0) + " is the smallest number");
    }
    
}

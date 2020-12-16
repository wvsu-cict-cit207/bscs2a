package arraylistactivity;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListActivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> array = new ArrayList <> ();
        int min=0;
        int max=0;
        int num = array.size();

        System.out.println("Enter the size of the array: ");
        num = sc.nextInt();  
       
        System.out.println("Enter " + num +" elements:");
        for(int i = 0; i < num; i++ ){
           array.add(sc.nextInt());
        }

        max = Collections.max(array);
        min = Collections.min(array);
        
        System.out.println("Largest element: " + max);
        System.out.println("Smallest element: " + min);
    }
}

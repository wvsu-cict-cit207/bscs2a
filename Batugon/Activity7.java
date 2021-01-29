
package activity7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Activity7 {
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of array: ");
        int array = input.nextInt();
        
        System.out.print("Enter integer: ");
        System.out.println();
        for(int i = 0; i < array; i++) {
            int element = input.nextInt();
            list.add(element);
        }
        
        System.out.println("The largest element is " + Collections.max(list));
        System.out.println("The smallest element is " + Collections.min(list));
        
    }
    
}

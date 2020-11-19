package javaarraylist;
import java.util.*;
public class JavaArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer>numberList=new ArrayList<Integer>();
        
        System.out.print("Enter the number of elements: ");
        int size =input.nextInt();
        
        System.out.println("Enter " + size + " numbers: ");
        for (int i = 0; i<size; i++) {
            numberList.add(input.nextInt());
        }
       
        Collections.sort (numberList);
        
        System.out.println("Smallest number is: " + numberList.get(0) + " Largest number is: " + numberList.get(numberList.size()-1));       
        
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Integer findMininimum(ArrayList<Integer> list){
        Integer minimum = Integer.MAX_VALUE;

        for(Integer g : list){
            if(minimum > g)
                minimum = g;

        }
        return minimum;
    }
    public static Integer findMaximum(ArrayList<Integer> list){
        Integer maximum = Integer.MIN_VALUE;

        for(Integer g : list){
            if(maximum < g){
                maximum = g;
            }
        }
        return maximum;
    }
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList< >();
        Scanner scanner = new Scanner(System.in);
        int i, value, size;
        System.out.print("Enter the size of the array: ");

        size = scanner.nextInt();

        System.out.print("\nEnter " + size + " values: ");
        for(i = 0; i < size; i++){
            value = scanner.nextInt();
            num.add(value);
        }

        System.out.println("Largest value = " + findMaximum(num));
        System.out.println("Smallest value = " + findMininimum(num));
    }
}

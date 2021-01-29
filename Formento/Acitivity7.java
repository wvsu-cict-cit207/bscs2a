package acitivity7;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Acitivity7 {

    public static void main(String[] args) {
                ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);

		System.out.print("Entet the size of array: ");
		int array = s.nextInt();

		System.out.print("Enter integers: ");
		System.out.println();
		for (int i = 0; i < array; i++) {
			int element = s.nextInt();
			list.add(element);
		}
		
		System.out.println("The maximum number is " + Collections.max(list));
		System.out.println("The minimum number is " + Collections.min(list));
    }
    
}

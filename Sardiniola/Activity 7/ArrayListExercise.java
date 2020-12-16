import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ArrayListExercise {
    public static void main (String [] args) {
	Scanner in = new Scanner(System.in);
	ArrayList <Integer> num = new ArrayList <Integer>();

	System.out.print("Enter the size of the array: ");
	int sizeOfArray = in.nextInt();

	for (int i = 0; i < sizeOfArray; i++) {
		System.out.print("Enter number " + (i+1) + ": ");
		num.add(in.nextInt());
	}

	Collections.sort(num);
	
	System.out.println("Largest element: " + num.get(0));
	System.out.println("Smallest element: " + num.get(num.size() - 1));
    }
}
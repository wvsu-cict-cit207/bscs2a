import java.util.Arrays;
import java.util.Scanner;
public class MinimumAndMaximum {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("The size of the array is 10");
		System.out.println("Enter 10 integers: ");
		int a[]= new int[10];
				
		for(int i =0; i < 10; i++) {
		a[i] = in.nextInt();
			}
		int min=a[0];
		for(int i=0; i<10; i++) {
			if(min > a[i]) {
			min= a[i];
		}
	}
		int max =a[0];
		for(int i=0; i<10; i++) {
			if(max < a[i]) {
			max = a[i];
		}
	}
		System.out.println("Maximum element: " + max);
		System.out.println("Minimum element: " + min);
		in.close();			
	}
				
}
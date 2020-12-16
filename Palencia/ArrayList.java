import java.util.Arrays;
import java.util.Scanner;
public class ArrayList {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size =in.nextInt();
		System.out.println("Enter" +" "+ size +" "+"integers.");
		int a[]= new int[size];
				
		for(int i =0; i < size; i++) {
		a[i] = in.nextInt();
			}
		int min=a[0];
		for(int i=0; i<size; i++) {
			if(min > a[i]) {
			min= a[i];
		}
	}
		int max =a[0];
		for(int i=0; i< size; i++) {
			if(max < a[i]) {
			max = a[i];
		}
	}
		System.out.print("Largest element: " + max+" ");
		System.out.print("Smallest element: " + min);
		in.close();			
	}

}

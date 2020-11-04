import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFinal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		System.out.print("Enter the size of array: ");
		int n = scanner.nextInt();
		
		System.out.println("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			int x = scanner.nextInt();
			num.add(x);
		}
		
		/*for (int i = 0; i < num.size(); i++) {
			System.out.println(num.get(i));
		}*/
		
		System.out.println("Largest element: " + Collections.max(num));
		System.out.println("Smallest element: " + Collections.min(num));
		
	}
}
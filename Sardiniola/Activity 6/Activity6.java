import java.util.Scanner;
import java.util.Arrays;
public class Activity6 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int num[] = new int[10];

		//get user input
		for (int i = 0; i < num.length; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			num[i] = input.nextInt();
		}

		//sort array
		Arrays.sort(num);

		System.out.println("Maximum value: " + num[num.length-1]);
		System.out.println("Largest value: " + num[0]);
	}
}
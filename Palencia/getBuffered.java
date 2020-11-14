import java.io.*;
import java.io.InputStreamReader;
import java.io.IOException;

public class getBuffered {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter First Number: ");
			String Str1 = br.readLine();
			System.out.print("Enter Second Number: ");
			String Str2 = br.readLine();
			
			int num1 = Integer.parseInt(Str1);
			int num2 = Integer.parseInt(Str2);
			
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
			
		} catch (IOException e) {
			System.err.println(e);
		}
		

	}

}

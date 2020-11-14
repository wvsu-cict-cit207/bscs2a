package activity3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class tempBuffered {
     
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter temperature in Celsius: ");
			String celsius = br.readLine();
			
			float C = Float.parseFloat(celsius);
			float F = C * (9f / 5) + 32;
			System.out.println(C + " degree Celsius is equal to " + F +" degree Fahrenheit.");
		} catch (IOException e) 
		{
			System.err.println(e);
		}
    }
}
import javax.swing.JOptionPane;

public class getJoption {

	public static void main(String[] args) {
		
		String Str1 = JOptionPane.showInputDialog("Enter first number: ");
		String Str2 = JOptionPane.showInputDialog("Enter second number: ");
		
		int num1 = Integer.parseInt(Str1);
		int num2 = Integer.parseInt(Str2);
		
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1 * num2;
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		
		JOptionPane.showMessageDialog(null, "Sum: " + sum + "\r\n" 
										+  "Difference: " + difference + "\r\n"
										+ "Product: " + product + "\r\n"
										+  "Quotient: " + quotient + "\r\n" 
										+ "Remainder: " + remainder);

	}

}

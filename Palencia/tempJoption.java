package activity3;
import javax.swing.JOptionPane;

public class tempJoption {
	   public static void main (String args[]) {
		   
		   String celsius = JOptionPane.showInputDialog("Enter temperature in Celsius: ");
		   float C = Float.parseFloat(celsius);
		   float F = C * (9f / 5) + 32;
		   
		   JOptionPane.showMessageDialog(null, C + " " + " degree Celsius" + " " + "is equal to " + F + " " + "degree Fahrenheit");
	 } 
}

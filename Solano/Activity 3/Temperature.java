package temperature;
import javax.swing.JOptionPane;
public class Temperature {
    public static void main(String[] args) {
     float celsius = Float.parseFloat(
     JOptionPane.showInputDialog("Enter Temperature in Celsius"));
     JOptionPane.showMessageDialog(null, celsius *9/5 + 32 + " Fahrenheit");
    }
}
package convertionofcelsiusandfarehnheit;
import javax.swing.JOptionPane;
public class ConvertionOfCelsiusAndFarehnheit {
public static void main(String[] args) {

    String temp = JOptionPane.showInputDialog("Options" + "\n" + "1. Celsius to Fahrenheit" + "\n" + "2. Fahrenheit to Celsius");
    
    int options = Integer.parseInt(temp);
        switch (options) {
            case 1:
                double celsius = Double.parseDouble(
                JOptionPane.showInputDialog("Celsius to Fahrenheit"));
                JOptionPane.showMessageDialog(null, celsius *9/5 + 32 + " Fahrenheit");
                break;
            case 2:
                double fahrenheit = Double.parseDouble(
               JOptionPane.showInputDialog("Fahrenheit to Celsius"));
               JOptionPane.showMessageDialog(null, (fahrenheit -32) *5/9 + " Celsius");
                break;
        }
    }
}
package celsiustofarenheit;
import javax.swing.JOptionPane;
public class CelsiusToFarenheit {
    public static void main(String[] args) {
        String temp = JOptionPane.showInputDialog("Input a degree in Celsius");
        float f = 0;
        float c = Float.parseFloat(temp);
        f = c * 1.8f + 32;
            JOptionPane.showMessageDialog(null, "Farenheit Temperature = " + f);
    }
}

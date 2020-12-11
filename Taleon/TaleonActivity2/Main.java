import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {
        //Initialization of Variables
        float sum, product, difference, quotient, remainder, firstNum, secondNum;
        JTextField firstInput = new JTextField();
        JTextField secondInput = new JTextField();
        Object[] message = {
                "Enter First Number:", firstInput,
                "Enter Second Number:", secondInput
        };

        //Receiving Input String
        JOptionPane.showConfirmDialog(null, message, "Taleon Activity 2", JOptionPane.OK_CANCEL_OPTION);

        //Conversion of Input to Usable Float
        firstNum = Float.parseFloat(firstInput.getText()); secondNum = Float.parseFloat(secondInput.getText());

        //Calculation
        sum = firstNum + secondNum;
        product = firstNum * secondNum;
        difference = firstNum - secondNum;
        quotient = firstNum / secondNum;
        remainder = firstNum % secondNum;

        //Displaying Output
        String outputMessage = "Sum: " + Float.toString(sum) + "\n" +
                                "Product: " + Float.toString(product) + "\n" +
                                "Difference: " + Float.toString(difference) + "\n" +
                                "Quotient: " + Float.toString(quotient) + "\n" +
                                "Remainder: " + Float.toString(remainder);
        JOptionPane.showMessageDialog(null, outputMessage);
    }
}

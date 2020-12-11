import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //Initialization of variables
        JTextField input = new JTextField();
        String output = "Fahrenheit: ";
        float conversion;
        Object[] field = {"Celsius: ", input, output, "_________________________________\n[OK] to convert again.\n[CANCEL] to exit."};

        //Receiving input string
        int optionResult = JOptionPane.showConfirmDialog(null, field, "Taleon Activity 3  - Celsius to Fahrenheit", JOptionPane.OK_CANCEL_OPTION);

        //Application Loop
        do {
            //Conversion
            conversion = (Float.parseFloat(input.getText()) * 1.8f) + 32;

            //Displaying output
            field[2] = "Fahrenheit: " + Float.toString(conversion);
            optionResult = JOptionPane.showConfirmDialog(null, field, "Taleon Activity 3 - Celsius to Fahrenheit", JOptionPane.OK_CANCEL_OPTION);
        } while (optionResult == JOptionPane.OK_OPTION);
    }
}
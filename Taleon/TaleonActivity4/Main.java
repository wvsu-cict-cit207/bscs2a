import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int optionResult = JOptionPane.OK_OPTION; //Used for the application loop
        do {
            //Variables that persist between two windows
            String currentConversion = "";
            String currentWantedOutput = "";
            String currentWantedInput = "";
            JTextField input = new JTextField();

            //CHOICE WINDOW - Where the user chooses whether to use C->F or F->C.
            boolean invalidChoice = false;
            do {
                char choice;
                Object[] choiceWindow = {"[Celsius <-> Fahrenheit Converter]\n\na ) Celsius to Fahrenheit\nb ) Fahrenheit to Celsius", "\nChoice: ", input};
                JOptionPane.showConfirmDialog(null, choiceWindow, "Taleon Activity 4 - C <-> F", JOptionPane.OK_CANCEL_OPTION);
                switch (input.getText().charAt(0)) {
                    case 'A','a':
                        currentConversion = "Celsius to Fahrenheit";
                        currentWantedOutput = "Fahrenheit";
                        currentWantedInput = "Celsius";
                        invalidChoice = false;
                        break;
                    case 'B','b':
                        currentConversion = "Fahrenheit to Celsius";
                        currentWantedOutput = "Celsius";
                        currentWantedInput = "Fahrenheit";
                        invalidChoice = false;
                        break;
                    default:
                        invalidChoice = true;
                }
            } while (invalidChoice);

            input.setText(""); //Reset Input

            //CONVERSION WINDOW - Where the user converts using chosen conversion.
            float conversion = 0;
            String output = currentWantedOutput + ": ";
            Object[] conversionWindow = {currentWantedInput + ": ", input, output, "_________________________________\n[OK] Convert Again\n[CANCEL] Back to Menu"};
            optionResult = JOptionPane.showConfirmDialog(null, conversionWindow, "Taleon Activity 4 - " + currentConversion, JOptionPane.OK_CANCEL_OPTION);
            if (optionResult == JOptionPane.OK_OPTION) {
                do {
                    switch (currentWantedOutput) {
                        case "Celsius":
                            conversion = (Float.parseFloat(input.getText()) - 32f) / 1.8f; //C = (F-32) / 1.8
                            break;
                        case "Fahrenheit":
                            conversion = (Float.parseFloat(input.getText()) * 1.8f) + 32f; //F = 1.8C+32
                            break;
                    }

                    //Display Output
                    conversionWindow[2] = output + Float.toString(conversion);
                    optionResult = JOptionPane.showConfirmDialog(null, conversionWindow, "Taleon Activity 4 - " + currentConversion, JOptionPane.OK_CANCEL_OPTION);
                } while (optionResult == JOptionPane.OK_OPTION);
            }
        } while (optionResult == JOptionPane.CANCEL_OPTION);

    }
}
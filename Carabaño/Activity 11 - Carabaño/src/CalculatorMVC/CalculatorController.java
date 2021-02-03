package CalculatorMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    CalculatorView calculatorView;
    CalculatorController(CalculatorView calculatorView){
        this.calculatorView = calculatorView;
        calculatorView.allListeners(new ActionButton());
    }
    class ActionButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if(e.getSource()== calculatorView.addbutton){
                int num1 = Integer.parseInt(calculatorView.num1TF.getText());
                int num2 = Integer.parseInt(calculatorView.num2TF.getText());
                int sum = CalculatorModel.addNumbers(num1, num2);
                calculatorView.result.setText(""+sum);
            }
            else if(e.getSource()== calculatorView.subtractbutton){
                int num1 = Integer.parseInt(calculatorView.num1TF.getText());
                int num2 = Integer.parseInt(calculatorView.num2TF.getText());
                int difference = CalculatorModel.subtractNumbers(num1, num2);
                calculatorView.result.setText(""+difference);
            }
            else if(e.getSource()== calculatorView.multiplybutton){
                int num1 = Integer.parseInt(calculatorView.num1TF.getText());
                int num2 = Integer.parseInt(calculatorView.num2TF.getText());
                int product = CalculatorModel.multiplyNumbers(num1, num2);
                calculatorView.result.setText(""+product);
            }
            else if(e.getSource()== calculatorView.dividebutton){
                int num1 = Integer.parseInt(calculatorView.num1TF.getText());
                int num2 = Integer.parseInt(calculatorView.num2TF.getText());
                int quotient = CalculatorModel.divideNumbers(num1, num2);
                calculatorView.result.setText(""+quotient);
            }
            else if(e.getSource()== calculatorView.remainderbutton){
                int num1 = Integer.parseInt(calculatorView.num1TF.getText());
                int num2 = Integer.parseInt(calculatorView.num2TF.getText());
                int remainder =(CalculatorModel.remainderNumbers(num1, num2));
                calculatorView.result.setText(""+remainder);
            }
            else if(e.getSource()== calculatorView.clearbutton){
                calculatorView.num1TF.setText("");
                calculatorView.num2TF.setText("");
                calculatorView.result.setText("");
            }
        }
    }
}

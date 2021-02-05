package mvccalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    View guiView;

    Controller(View view) {
        this.guiView = view;
        guiView.allListeners(new ActionButton());

    }

    class ActionButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int num1 = Integer.parseInt(guiView.num1TF.getText());
            int num2 = Integer.parseInt(guiView.num2TF.getText());

            if (e.getSource() == guiView.button) {
                int sum = Model.addNumbers(num1, num2);
                guiView.num3TF.setText(String.valueOf(sum));

            } else if (e.getSource() == guiView.button1) {
                int difference = Model.subNumbers(num1, num2);
                guiView.num3TF.setText(String.valueOf(difference));

            } else if (e.getSource() == guiView.button2) {
                int product = Model.multiplyNumbers(num1, num2);
                guiView.num3TF.setText(String.valueOf(product));

            } else if (e.getSource() == guiView.button3) {
                int divide = Model.divideNumbers(num1, num2);
                guiView.num3TF.setText(String.valueOf(divide));

            } else if (e.getSource() == guiView.button4) {
                int percent = Model.percentNumbers(num1, num2);
                guiView.num3TF.setText(String.valueOf(percent));

            } else if (e.getSource() == guiView.button5) {
                guiView.num3TF.setText("");
                guiView.num2TF.setText("");
                guiView.num1TF.setText("");

            }
        }
    }
}

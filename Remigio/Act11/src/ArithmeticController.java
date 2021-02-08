import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticController {

    public ArithmeticView view;
    public ArithmeticModel model;

    public ArithmeticController() {
        view = new ArithmeticView(this);
        model = new ArithmeticModel(this);
    }

    public ButtonListener addListener = new ButtonListener(ArithmeticModel.ArithmeticOperations.ADD);
    public ButtonListener subtractListener = new ButtonListener(ArithmeticModel.ArithmeticOperations.SUBTRACT);
    public ButtonListener multiplyListener = new ButtonListener(ArithmeticModel.ArithmeticOperations.MULTIPLY);
    public ButtonListener divideListener = new ButtonListener(ArithmeticModel.ArithmeticOperations.DIVIDE);
    public ButtonListener moduloListener = new ButtonListener(ArithmeticModel.ArithmeticOperations.MODULO);

    public void clearListener() {
        model.reset();
    }

    private class ButtonListener implements ActionListener {

        ArithmeticModel.ArithmeticOperations operation;

        public ButtonListener(ArithmeticModel.ArithmeticOperations operation) {
            this.operation = operation;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            model.changeCurrentOperation(this.operation);
            try {
                model.firstNum = Float.parseFloat(view.firstNumField.getText());
                model.secondNum = Float.parseFloat(view.secondNumField.getText());
                view.resultField.setText(Integer.toString((int) model.getResult()));
            } catch (Exception exception) {
                view.resultField.setText("INPUT NOT CORRECT");
            }
        }
    }
}
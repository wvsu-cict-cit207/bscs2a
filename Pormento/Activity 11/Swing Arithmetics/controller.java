import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller {
    private view theView;
    private model theModel;


    public controller(view theView, model theModel) {
        this.theView = theView;
        this.theModel = theModel;

        //buttons to controller
        this.theView.setAddButtonListener(new addButtonListener());
        this.theView.setSubtractButtonListener(new subtractButtonListener());
        this.theView.setMultiplyButtonListener(new multiplyButtonListener());
        this.theView.setDivideButtonListener(new divideButtonListener());
        this.theView.setClearButtonListener(new clearButtonListener());
        this.theView.setPercentageListener(new percentButtonListener());
    }

    class addButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber, secondNumber = 0;
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addNumbers(firstNumber, secondNumber);

                theView.setResult(theModel.getResult());
            } catch (NumberFormatException exception) {
                theView.displayErrorMessage("Fields cannot be empty.");
            }

        }
    }

    class subtractButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber, secondNumber = 0;
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.subtractNumbers(firstNumber, secondNumber);

                theView.setResult(theModel.getResult());
            } catch (NumberFormatException exception) {
                theView.displayErrorMessage("Fields cannot be empty.");
            }

        }
    }

    class multiplyButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber, secondNumber = 0;
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.multiplyNumbers(firstNumber, secondNumber);

                theView.setResult(theModel.getResult());
            } catch (NumberFormatException exception) {
                theView.displayErrorMessage("Fields cannot be empty.");
            }

        }
    }

    class divideButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber, secondNumber = 0;
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.divideNumbers(firstNumber, secondNumber);

                theView.setResult(theModel.getResult());
            } catch (NumberFormatException exception) {
                theView.displayErrorMessage("Fields cannot be empty.");
            }

        }
    }

    class clearButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            theView.setNum1Field("");
            theView.setNum2Field("");
            theView.setResultDisplay("");
        }
    }

    class percentButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double firstNumber, secondNumber = 0;
                firstNumber = theView.getFirstNumber();
                theModel.percentage(firstNumber);
                theView.setResult(theModel.getResult());
            } catch (NumberFormatException exception) {
                theView.displayErrorMessage("Fields cannot be empty.");
            }
        }
    }
}


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model


public class Controller {

    private View theView;
    private Model theModel;

    public Controller(View theView, Model theModel) {
        this.theView = theView;
        this.theModel = theModel;

        // Tell the View that when ever the calculate button
        // is clicked to execute the actionPerformed method
        // in the CalculateListener inner class
        this.theView.addCalculateListener(new addCalculateListener());
        this.theView.subCalculateListener(new subCalculateListener());
        this.theView.mulCalculateListener(new mulCalculateListener());
        this.theView.divCalculateListener(new divCalculateListener());
        this.theView.modCalculateListener(new modCalculateListener());
        this.theView.cancelCalculateListener(new cancelCalculateListener());
    }

    class addCalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int t1, t2 = 0;

            // Surround interactions with the view with
            // a try block in case numbers weren't
            // properly entered
            try {

                t1 = theView.getFirstNumber();
                t2 = theView.getSecondNumber();

                theModel.addTwoNumbers(t1, t2);

                theView.setCalcSolution(theModel.getCalculationValue());

            } catch (NumberFormatException ex) {

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter 2 Integers");

            }

        }

    }
        class subCalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int t1, t2 = 0;

            // Surround interactions with the view with
            // a try block in case numbers weren't
            // properly entered
            try {

                t1 = theView.getFirstNumber();
                t2 = theView.getSecondNumber();

                theModel.subTwoNumbers(t1, t2);

                theView.setCalcSolution(theModel.getCalculationValue());

            } catch (NumberFormatException ex) {

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter 2 Integers");

            }

        }

    }
        class mulCalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int t1, t2 = 0;

            // Surround interactions with the view with
            // a try block in case numbers weren't
            // properly entered
            try {

                t1 = theView.getFirstNumber();
                t2 = theView.getSecondNumber();

                theModel.mulTwoNumbers(t1, t2);

                theView.setCalcSolution(theModel.getCalculationValue());

            } catch (NumberFormatException ex) {

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter 2 Integers");

            }

        }

    }
        class divCalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int t1, t2 = 0;

            // Surround interactions with the view with
            // a try block in case numbers weren't
            // properly entered
            try {

                t1 = theView.getFirstNumber();
                t2 = theView.getSecondNumber();

                theModel.divTwoNumbers(t1, t2);

                theView.setCalcSolution(theModel.getCalculationValue());

            } catch (NumberFormatException ex) {

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter 2 Integers");

            }

        }

    }
        class modCalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            int t1, t2 = 0;

            // Surround interactions with the view with
            // a try block in case numbers weren't
            // properly entered
            try {

                t1 = theView.getFirstNumber();
                t2 = theView.getSecondNumber();

                theModel.modTwoNumbers(t1, t2);

                theView.setCalcSolution(theModel.getCalculationValue());

            } catch (NumberFormatException ex) {

                System.out.println(ex);

                theView.displayErrorMessage("You Need to Enter 2 Integers");

            }

        }

    }
        class cancelCalculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) 
        {
            System.exit(0);
        }
    }
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavatryController {
    private JavatryView theView;
    private JavatryModel theModel;
     
    public JavatryController(JavatryView theView, JavatryModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
         
        // Tell the View that when ever the calculate button
        // is clicked to execute the actionPerformed method
        // in the CalculateListener inner class
         
        this.theView.addListener(new addListener());
        this.theView.subListener(new subListener());
        this.theView.multiplyListener(new multiplyListener());
        this.theView.divListener(new divListener());
        this.theView.remainderListener(new remainderListener());
        this.theView.clearListener(new clearListener());
    }
     
    class addListener implements ActionListener{
 
        public void actionPerformed(ActionEvent e) {
             
            int firstNumber, secondNumber = 0;
            try{
            
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                 
                theModel.add(firstNumber, secondNumber);
                 
                theView.setResult(theModel.getCalculationValue());
             
            }
 
            catch(NumberFormatException ex){
                 
                System.out.println(ex);
                
                theView.displayErrorMessage("You Need to Enter 2 Integers");
               
            }
             
        }
         
    }
    class subListener implements ActionListener{
 
        public void actionPerformed(ActionEvent e) {
             
            int firstNumber, secondNumber = 0;
            try{
            
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                 
                theModel.subtract(firstNumber, secondNumber);
                 
                theView.setResult(theModel.getCalculationValue());
             
            }
 
            catch(NumberFormatException ex){
                 
                System.out.println(ex);
                
                theView.displayErrorMessage("You Need to Enter 2 Integers");
               
            }
             
        }
         
    }
    class multiplyListener implements ActionListener{
 
        public void actionPerformed(ActionEvent e) {
             
            int firstNumber, secondNumber = 0;
            try{
            
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                 
                theModel.multiply(firstNumber, secondNumber);
                 
                theView.setResult(theModel.getCalculationValue());
             
            }
 
            catch(NumberFormatException ex){
                 
                System.out.println(ex);
                
                theView.displayErrorMessage("You Need to Enter 2 Integers");
               
            }
             
        }
         
    }
    class divListener implements ActionListener{
 
        public void actionPerformed(ActionEvent e) {
             
            int firstNumber, secondNumber = 0;
            try{
            
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                 
                theModel.divide(firstNumber, secondNumber);
                 
                theView.setResult(theModel.getCalculationValue());
             
            }
 
            catch(NumberFormatException ex){
                 
                System.out.println(ex);
                
                theView.displayErrorMessage("You Need to Enter 2 Integers");
               
            }
             
        }
         
    }
    class remainderListener implements ActionListener{
 
        public void actionPerformed(ActionEvent e) {
             
            int firstNumber, secondNumber = 0;
            try{
            
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                 
                theModel.remainder(firstNumber, secondNumber);
                 
                theView.setResult(theModel.getCalculationValue());
             
            }
 
            catch(NumberFormatException ex){
                 
                System.out.println(ex);
                
                theView.displayErrorMessage("You Need to Enter 2 Integers");
               
            }
             
        }
         
    }
    class clearListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
             
            theView.firstNumber.setText("");
            theView.secondNumber.setText("");
            theView.result.setText("");
             
        }
         
    }
}



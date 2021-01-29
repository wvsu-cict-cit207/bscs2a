import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticController {
    private final ArithmeticView theView;
    private final ArithmeticModel theModel;
    int num1, num2;
    
    public ArithmeticController(ArithmeticView theView, ArithmeticModel theModel){
        this.theView = theView;
        this.theModel = theModel;
        
        this.theView.addListener(new addListener());
        this.theView.subListener(new subListener());
        this.theView.mulListener(new mulListener());
        this.theView.divListener(new divListener());
        this.theView.remListener(new remListener());
        this.theView.clrListener(new clrListener());
    }
    boolean getValues(){
        int num1, num2;
        try{
            num1 = theView.getNum1();  
            num2 = theView.getNum2();
            return true;
        }
        catch(NumberFormatException ex){
            System.out.println(ex);
            theView.displayErrorMessage();
            return false;
        }
    }
    class addListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent arg0){
            try{
                num1 = theView.getNum1();
                num2 = theView.getNum2();
                theModel.add(num1, num2);
                theView.setResult(theModel.getResult());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage();
            }
        }
    }
    
    class subListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent arg0){
            try{
                num1 = theView.getNum1();
                num2 = theView.getNum2();
                theModel.subtract(num1, num2);
                theView.setResult(theModel.getResult());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage();
            }
        }
    }
    class mulListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent arg0){
            try{
                num1 = theView.getNum1();
                num2 = theView.getNum2();
                theModel.multiply(num1, num2);
                theView.setResult(theModel.getResult());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage();
            }
        }
    }
    class divListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent arg0){
            try{
                num1 = theView.getNum1();
                num2 = theView.getNum2();
                theModel.divide(num1, num2);
                theView.setResult(theModel.getResult());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage();
            }
        }
    }
    class remListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent arg0){
            try{
                num1 = theView.getNum1();
                num2 = theView.getNum2();
                theModel.remainder(num1, num2);
                theView.setResult(theModel.getResult());
            }
            catch(NumberFormatException ex){
                System.out.println(ex);
                theView.displayErrorMessage();
            }
        }
    }
    class clrListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent arg0){
            theView.field1.setText(null);
            theView.field2.setText(null);
            theView.result.setText(null);
        }
    }
}

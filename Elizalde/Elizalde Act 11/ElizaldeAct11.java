public class ElizaldeAct11 {
    public static void main(String[] args) {
        ArithmeticView theView = new ArithmeticView();
        ArithmeticModel theModel = new ArithmeticModel();
        ArithmeticController theController = new ArithmeticController(theView,theModel);
        
        theView.setVisible(false);
    }
}

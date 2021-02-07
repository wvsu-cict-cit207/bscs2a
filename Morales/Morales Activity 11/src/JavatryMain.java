public class JavatryMain {
     
    public static void main(String[] args) {
         
        JavatryView theView = new JavatryView();
         
        JavatryModel theModel = new JavatryModel();
         
        JavatryController theController = new JavatryController(theView,theModel);
         
        theView.setVisible(true);
        
    }
}


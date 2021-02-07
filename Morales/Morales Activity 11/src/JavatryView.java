import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class JavatryView extends JFrame{
    
    
    JPanel calcPanel = new JPanel();
    
    private JLabel label1 = new JLabel ("First Number");
    JTextField firstNumber  = new JTextField();
    private JLabel label2 = new JLabel ("Second Number");
    JTextField secondNumber = new JTextField();
    private JLabel label3 = new JLabel ("Result");
    JTextField result = new JTextField();
    private JButton clrButton = new JButton("Clr");
    private JButton divButton = new JButton ("/");
    private JButton multiplyButton = new JButton ("*");
    private JButton subButton = new JButton ("-");
    private JButton addButton = new JButton ("+");
    private JButton remainderButton = new JButton ("%");
    
            
     
    JavatryView(){
        this.setSize(250, 200);
        this.setTitle("Swing Arithmetics");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        calcPanel = new JPanel();
        calcPanel.setBorder(new EmptyBorder(10,10,10,10));
        calcPanel.setLayout(new GridLayout(6, 2, 5, 5));
        calcPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
              
        calcPanel.add(label1);
        calcPanel.add(firstNumber);
        firstNumber.setHorizontalAlignment(SwingConstants.RIGHT);
        calcPanel.add(label2);
        calcPanel.add(secondNumber);
        secondNumber.setHorizontalAlignment(SwingConstants.RIGHT);
        calcPanel.add(label3);
        calcPanel.add(result);
        result.setEnabled(false);
        result.setFont(result.getFont().deriveFont(Font.BOLD, 12f));
        result.setHorizontalAlignment(SwingConstants.RIGHT);
        
        calcPanel.add(addButton);
        calcPanel.add(subButton);
        calcPanel.add(multiplyButton);
        calcPanel.add(divButton);
        calcPanel.add(remainderButton);
        calcPanel.add(clrButton);
        this.add(calcPanel);
    }
    
    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }
    public int getSecondNumber(){         

        return Integer.parseInt(secondNumber.getText());
    }
    public int getResult(){
        return Integer.parseInt(result.getText());
      
    }
    public void setResult(int solution){
        result.setText(Integer.toString(solution));
    }
    
    void addListener(ActionListener listenForCalcButton){
        addButton.addActionListener(listenForCalcButton);
    }
    void subListener(ActionListener listenForCalcButton){
        subButton.addActionListener(listenForCalcButton);
    }
    void multiplyListener(ActionListener listenForCalcButton){
        multiplyButton.addActionListener(listenForCalcButton);
    }
    void divListener(ActionListener listenForCalcButton){
        divButton.addActionListener(listenForCalcButton);
    }
    void remainderListener(ActionListener listenForCalcButton){
        remainderButton.addActionListener(listenForCalcButton);
    }
    void clearListener(ActionListener listenForCalcButton){
        clrButton.addActionListener(listenForCalcButton);
    }
    
    
    // Open a popup that contains the error message passed
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    
}

import javax.swing.*;
import java.awt.event.ActionListener;

public class view extends JFrame {
    private JLabel firstNumber = new JLabel("First Number: ");
    private JLabel secondNumber = new JLabel("Second Number: ");
    private JLabel result = new JLabel("Result: ");
    private JTextField num1Field = new JTextField();
    private JTextField num2Field = new JTextField();
    private JTextField resultDisplay = new JTextField();
    private JButton addButton = new JButton("+");
    private JButton subtractButton = new JButton("-");
    private JButton multiplyButton = new JButton("*");
    private JButton divideButton = new JButton("÷");
    private JButton clearButton = new JButton("CLEAR");
    private JButton percentButton = new JButton("%");

    view(){
        JPanel panel = new JPanel();
        this.setTitle("Swing Arithmetics");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350, 300);//Window size
        //Label properties
        firstNumber.setBounds(20, 20, 150, 25);
        secondNumber.setBounds(20, 50, 150, 25);
        result.setBounds(20, 70, 200, 40);


        //text field properties
        num1Field.setBounds(150, 20, 160, 25);
        num1Field.setHorizontalAlignment(SwingConstants.RIGHT);
        num2Field.setBounds(150, 50, 160, 25);
        num2Field.setHorizontalAlignment(SwingConstants.RIGHT);
        resultDisplay.setBounds(150, 80, 160, 25);
        resultDisplay.setEditable(false);
        resultDisplay.setHorizontalAlignment(SwingConstants.RIGHT);

        //button properties
        addButton.setBounds(20, 120, 140, 30);
        subtractButton.setBounds(170, 120, 140, 30);
        multiplyButton.setBounds(20, 160, 140, 30);
        divideButton.setBounds(170,160, 140, 30 );
        percentButton.setBounds(20, 200, 140, 30);
        clearButton.setBounds(170, 200, 140, 30);
        //adding stuff
        panel.setLayout(null);
        panel.add(firstNumber);
        panel.add(num1Field);
        panel.add(secondNumber);
        panel.add(num2Field);
        panel.add(result);
        panel.add(resultDisplay);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(percentButton);
        panel.add(clearButton);
        this.add(panel);

    }

    public double getFirstNumber (){
        return Double.parseDouble(num1Field.getText());
    }
    public double getSecondNumber (){
        return Double.parseDouble(num2Field.getText());
    }
    //setter
    public void setResult (double result){
        resultDisplay.setText(Double.toString(result));
    }

    public void setNum1Field(String num1Field) {
        this.num1Field.setText(num1Field);
    }

    public void setNum2Field(String num2Field) {
        this.num2Field.setText(num2Field);
    }

    public void setResultDisplay(String resultDisplay) {
        this.resultDisplay.setText(resultDisplay);
    }

    void setAddButtonListener (ActionListener listener){
        addButton.addActionListener(listener);
    }
    void setSubtractButtonListener (ActionListener listener){
        subtractButton.addActionListener(listener);
    }
    void setMultiplyButtonListener (ActionListener listener){
        multiplyButton.addActionListener(listener);
    }
    void setDivideButtonListener (ActionListener listener){
        divideButton.addActionListener(listener);
    }
    void setClearButtonListener (ActionListener listener){
        clearButton.addActionListener(listener);
    }
    void setPercentageListener (ActionListener listener){
        percentButton.addActionListener(listener);
    }
    void displayErrorMessage (String errorMsg){
        JOptionPane.showMessageDialog(this, errorMsg);
    }
}

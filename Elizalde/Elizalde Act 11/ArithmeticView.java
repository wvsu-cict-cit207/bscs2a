import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArithmeticView extends JFrame{
    private JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    
    private JLabel label1 = new JLabel("First number ");
    JTextField field1 = new JTextField();
    private JLabel label2 = new JLabel("Second number ");
    JTextField field2 = new JTextField();
    private JLabel label3 = new JLabel("Result ");
    JTextField result = new JTextField();
    private JButton addButton = new JButton("+");
    private JButton subButton = new JButton("-");
    private JButton mulButton = new JButton("*");
    private JButton divButton = new JButton("/");
    private JButton remButton = new JButton("%");
    private JButton clrButton = new JButton("CLEAR");
  
    ArithmeticView(){
        panel.setPreferredSize(new Dimension(400, 200));
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing Arithmetics");
        frame.pack();
        frame.setVisible(true);
        result.setEditable(false);                    
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        panel.setLayout(new GridLayout(6,2));
        
        panel.add(label1);
        panel.add(field1);
        field1.setHorizontalAlignment(SwingConstants.RIGHT);
        
        panel.add(label2);
        panel.add(field2);
        field2.setHorizontalAlignment(SwingConstants.RIGHT);
        
        panel.add(label3);
        panel.add(result);
        result.setHorizontalAlignment(SwingConstants.RIGHT);
                
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(remButton);
        panel.add(clrButton);
    }
    public int getNum1(){
        return Integer.parseInt(field1.getText());
    }
    public int getNum2(){
        return Integer.parseInt(field2.getText());
    }
    public int getResult(){
        return Integer.parseInt(result.getText());
    }
    public void setResult(int solution){
        result.setText(Integer.toString(solution));
    }
    void addListener(ActionListener listener){     
        addButton.addActionListener(listener);
    }
    void subListener(ActionListener listener){     
        subButton.addActionListener(listener);
    }
    void mulListener(ActionListener listener){
        mulButton.addActionListener(listener);
    }
    void divListener(ActionListener listener){
        divButton.addActionListener(listener);
    }
    void remListener(ActionListener listener){
        remButton.addActionListener(listener);
    }
    void clrListener(ActionListener listener){
        clrButton.addActionListener(listener);
    }
    void displayErrorMessage(){
        JOptionPane.showMessageDialog(this, "You Need to Enter 2 Integers");
    }    
}

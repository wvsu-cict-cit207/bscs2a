package CalculatorMVC;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;


public class CalculatorView {
    JButton addbutton;
    JButton subtractbutton;
    JButton multiplybutton;
    JButton dividebutton;
    JButton remainderbutton;
    JButton clearbutton;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JTextField num1TF ;
    JTextField num2TF; 
    JTextField result;
    public CalculatorView() {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    label1 = new JLabel ("First Number");
    label2 = new JLabel ("Second Number");
    label3 = new JLabel ("Result");
    result = new JTextField();
    num1TF = new JTextField();
    num2TF = new JTextField();
    addbutton = new JButton("+");
    subtractbutton = new JButton("-");
    multiplybutton = new JButton("*");
    dividebutton = new JButton("/");
    remainderbutton = new JButton("%");
    clearbutton = new JButton("Clear");
    

    panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
    panel.setLayout(new GridLayout(6, 1));
    panel.add(label1);
    panel.add(num1TF);
    panel.add(label2);
    panel.add(num2TF); 
    panel.add(label3);
    panel.add(result);
    panel.add(addbutton);
    panel.add(subtractbutton);
    panel.add(multiplybutton);
    panel.add(dividebutton);
    panel.add(remainderbutton);
    panel.add(clearbutton);
    
     


   // set up the frame and display it
    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setTitle("Swing Arithmetic");
    frame.pack();
    frame.setVisible(true);
    
    }
    
    public void allListeners(ActionListener a){
        addbutton.addActionListener(a);
        subtractbutton.addActionListener(a);
        multiplybutton.addActionListener(a);
        dividebutton.addActionListener(a);
        remainderbutton.addActionListener(a);
        clearbutton.addActionListener(a);
    }
}

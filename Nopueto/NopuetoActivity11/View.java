package mvccalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View {
    JButton button = new JButton("+");
    JButton button1 = new JButton("-");
    JButton button2 = new JButton("*");
    JButton button3 = new JButton("/");
    JButton button4 = new JButton("%");
    JButton button5 = new JButton("CLEAR");
    JTextField num1TF;
    JTextField num2TF;
    JLabel label2;
    JTextField num3TF;


    public View() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel("First Number");
        JLabel label1 = new JLabel("Second Number");
        num1TF = new JTextField(10);
        num2TF = new JTextField(10);
        label2 = new JLabel("Result");
        num3TF = new JTextField(10);
        num3TF.setEditable(false);

        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setLayout(new GridLayout(0, 2, 10, 3));
        panel.add(label);
        panel.add(num1TF);
        panel.add(label1);
        panel.add(num2TF);
        panel.add(label2);
        panel.add(num3TF);

        // Buttons
        panel.add(button);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);

        // set up the frame 
        frame.add(panel, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing Arithmetics");
        frame.setMinimumSize(new Dimension(300,200));
        frame.pack();
        frame.setVisible(true);

    }
    public void allListeners(ActionListener a){
        button.addActionListener(a);
        button1.addActionListener(a);
        button2.addActionListener(a);
        button3.addActionListener(a);
        button4.addActionListener(a);
        button5.addActionListener(a);
    }



}
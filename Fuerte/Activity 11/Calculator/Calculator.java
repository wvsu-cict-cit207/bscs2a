package Calculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;


public class Calculator extends JFrame implements ActionListener{
    
    private JFrame frame = new JFrame("Calculator");
    private JLabel Firstnum = new JLabel("First Number");
    private JLabel Secondnum = new JLabel("Second Number");
    private JLabel Result = new JLabel("Result");
    private JLabel Name = new JLabel("Maria Arlyn Fuerte");
   
    private JTextField fnum = new JTextField();
    private JTextField snum = new JTextField();
    private JTextField res = new JTextField();
    private JButton Add_Button = new JButton("+");
    private JButton Sub_Button = new JButton("-");
    private JButton Mul_Button = new JButton("*");
    private JButton Div_Button = new JButton("/");
    private JButton Per_Button = new JButton("%");
    private JButton Clr_Button = new JButton("Clear");
     
    public Calculator(){
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600, 450);
        frame.setResizable(true);
        frame.setLayout(null);
        
        //JLabel First Number
        Firstnum.setSize(200, 40);
        Firstnum.setLocation(30, 30);
        Firstnum.setFont(new Font("Courier New", Font.PLAIN, 20));
        frame.add(Firstnum);
        
        //JLabel Second Number
        Secondnum.setSize(200, 40);
        Secondnum.setLocation(30, 70);
        Secondnum.setFont(new Font("Courier New", Font.PLAIN, 20));
        frame.add(Secondnum);
        
        //JLabel Result
        Result.setSize(200, 40);
        Result.setLocation(30, 110);
        Result.setFont(new Font("Courier New", Font.PLAIN, 20));
        frame.add(Result);
        
        //JLabel Name
        Name.setSize(200, 40);
        Name.setLocation(400, 380);
        Name.setFont(new Font("Courier New", Font.PLAIN, 15));
        frame.add(Name);
        
        fnum.setBounds(280, 35, 250, 28); 
        snum.setBounds(280, 75, 250, 28);  
        res.setBounds(280, 115, 250, 28);         
        Add_Button.setBounds(50, 170, 200, 50);
        Sub_Button.setBounds(270, 170, 200, 50);
        Mul_Button.setBounds(50, 230, 200, 50);
        Div_Button.setBounds(270, 230, 200, 50);
        Per_Button.setBounds(50, 290, 200, 50);
        Clr_Button.setBounds(270, 290, 200, 50);
        frame.add(fnum);
        frame.add(snum);
        frame.add(res);
        res.setEditable(false);
        frame.add(Add_Button);
        frame.add(Sub_Button);
        frame.add(Mul_Button);
        frame.add(Div_Button);
        frame.add(Per_Button);
        frame.add(Clr_Button);
        Add_Button.addActionListener(this);
        Sub_Button.addActionListener(this);
        Mul_Button.addActionListener(this);
        Div_Button.addActionListener(this);
        Per_Button.addActionListener(this);
        Clr_Button.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = fnum.getText();  
        String s2 = snum.getText();  
        double a = Integer.parseInt(s1);  
        double b = Integer.parseInt(s2);  
        double c = 0;  

        if(e.getSource() == Add_Button){  
            c = a + b;  
        }
        if(e.getSource() == Sub_Button){  
            c = a - b;
        }
        if(e.getSource() == Mul_Button){
            c = a * b;
        }
        if(e.getSource() == Div_Button){
            c = a / b;
        }
        if(e.getSource() == Per_Button){
            c = a % b;
        }
        else if(e.getSource() == Clr_Button){
            fnum.setText("");
            snum.setText("");
            res.setText(" ");
        }
 
        String result=String.valueOf(c);  
        res.setText(result); 
        }

    public static void main(String[] args) {
        new Calculator();
    }
}
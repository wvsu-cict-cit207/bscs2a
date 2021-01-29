import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener{

    JFrame frame;
    JTextField textfield;
    JTextField textfield2;
    JTextField textfield3;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel labelnote;
    JButton[] funcButtons = new JButton[5];
    JButton aButton, sButton, mButton, dButton, sqButton, sqrtButton;
    JButton clrButton;
    JPanel panel;
 

    Font myFont = new Font("Segoe UI", Font.PLAIN,30);

    Calculator(){

        frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);

        labelnote = new JLabel("Note: Only use textfield of First number for x\u00B2 and \u221A");
        labelnote.setBounds(20, 10, 300, 30);

        textfield = new JTextField();
        textfield.setBounds(120,45,250,50);
        textfield.setFont(myFont);
        textfield.setHorizontalAlignment(JTextField.RIGHT);
        textfield2 = new JTextField();
        textfield2.setBounds(120,100,250,50);
        textfield2.setFont(myFont);
        textfield2.setHorizontalAlignment(JTextField.RIGHT);
        textfield3 = new JTextField();
        textfield3.setBounds(120,155,250,50);
        textfield3.setHorizontalAlignment(JTextField.RIGHT);
        textfield3.setFont(myFont);
        //textfield3.setEditable(false);

        label1 = new JLabel("First number:");
        label1.setBounds(20, 45, 100,50);
        label2 = new JLabel("Second number:");
        label2.setBounds(20,100,100,40);
        label3 = new JLabel("Result:");
        label3.setBounds(20,155,100,50);
    
        aButton = new JButton("+");
        sButton = new JButton("-");
        mButton = new JButton("*");
        dButton = new JButton("/");
        sqButton = new JButton("x\u00B2");
        sqrtButton = new JButton("\u221A");
        clrButton = new JButton("CLR");

        funcButtons[0] = aButton;
        funcButtons[1] = sButton;
        funcButtons[2] = mButton;
        funcButtons[3] = dButton;
        funcButtons[4] = clrButton;

        for(int i=0; i <5; i++){
            funcButtons[i].addActionListener(this);
            funcButtons[i].setFont(myFont);
            funcButtons[i].setFocusable(false);
        }

        aButton.addActionListener(this);
        sButton.addActionListener(this);
        mButton.addActionListener(this);
        dButton.addActionListener(this);
        sqButton.addActionListener(this);
        sqrtButton.addActionListener(this);

       
        clrButton.setBounds(100,430,200,50);
        panel = new JPanel();
        panel.setBounds(100,240,200,200);
        panel.setLayout(new GridLayout(4,4,8,8));

        panel.add(aButton);
        panel.add(sButton);
        panel.add(mButton);
        panel.add(dButton);
        panel.add(sqButton);
        panel.add(sqrtButton);
       
        frame.add(labelnote);
        frame.add(panel);
        frame.add(clrButton);
        frame.add(textfield);
        frame.add(textfield2);
        frame.add(textfield3);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
    
            Calculator calc = new Calculator();
    }

    public void actionPerformed(ActionEvent e){

        try{
        if(e.getSource() == aButton){
            int a  = Integer.parseInt(textfield.getText());
            int b = Integer.parseInt(textfield2.getText());
            int c = a + b;
            textfield3.setText(""+c);
        }
        if(e.getSource() == sButton){
            int a  = Integer.parseInt(textfield.getText());
            int b = Integer.parseInt(textfield2.getText());
            int c = a - b;
            textfield3.setText(""+c);
        }
        if(e.getSource() == mButton){
            int a  = Integer.parseInt(textfield.getText());
            int b = Integer.parseInt(textfield2.getText());
            int c = a * b;
            textfield3.setText(""+c);
        }
        if (e.getSource() == dButton){
            int a  = Integer.parseInt(textfield.getText());
            int b = Integer.parseInt(textfield2.getText());
            int c = a / b;
            textfield3.setText(""+c);
        }

        if (e.getSource() == sqButton){
            double num = Double.parseDouble(textfield.getText());
            double square = Math.pow(num, 2);
            String string = Double.toString(square);
            if (string.endsWith(".01")){
                textfield3.setText(string.replace(".0",""));
            }else {
                textfield3.setText(string);
            }
        }

        if (e.getSource() == sqrtButton){
            double num = Double.parseDouble(textfield.getText());
            Double sqrt = Math.sqrt(num);
            textfield3.setText(Double.toString(sqrt));
        }

        if (e.getSource() == clrButton){
            textfield.setText("");
            textfield2.setText("");
            textfield3.setText("");
        } 

    }
    catch (NumberFormatException e1){
        textfield3.setText("Integers only");
    } catch (ArithmeticException e2){
        textfield3.setText("Can not divide by 0");
    }
    }
}
    


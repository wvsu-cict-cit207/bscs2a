
package act11;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.*;
public class View {
    public JPanel panel;
    public JTextField fieldNum1;
    public JTextField fieldNum2;
    public JLabel result;
    public JButton addBtn;
    public JButton minusBtn;
    public JButton timesBtn;
    public JButton divideBtn;
    public JButton moduloBtn;
    public JButton clearBtn;
    public View() {
        JFrame frame = new JFrame();
        JLabel labelNum1 = new JLabel("First Number");
        JLabel labelNum2 = new JLabel("Second Number");
        JLabel labelResult = new JLabel("Result");
        fieldNum1 = new JTextField();
        fieldNum1.setHorizontalAlignment(JTextField.RIGHT);
        fieldNum2 = new JTextField();
        fieldNum2.setHorizontalAlignment(JTextField.RIGHT);
        result = new JLabel("", JLabel.RIGHT);
        result.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        addBtn = new JButton("+");
        minusBtn = new JButton("-");
        timesBtn = new JButton("*");
        divideBtn = new JButton("/");
        moduloBtn = new JButton("%");
        clearBtn = new JButton("CLEAR");
        panel = new JPanel(new GridLayout(6,2,15,15));
        
        panel.add(labelNum1);
        panel.add(fieldNum1);
        panel.add(labelNum2);
        panel.add(fieldNum2);
        panel.add(labelResult);
        panel.add(result);
        panel.add(addBtn);
        panel.add(minusBtn);
        panel.add(timesBtn);
        panel.add(divideBtn);
        panel.add(moduloBtn);
        panel.add(clearBtn);
        
        frame.pack();
        frame.add(panel, BorderLayout.CENTER);
        frame.setResizable(false);
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Swing Arithmetics");
        frame.setVisible(true);
    }
    public void allListeners(ActionListener b) {
        addBtn.addActionListener(b);
        minusBtn.addActionListener(b);
        timesBtn.addActionListener(b);
        divideBtn.addActionListener(b);
        moduloBtn.addActionListener(b);
        clearBtn.addActionListener(b);
    }
}

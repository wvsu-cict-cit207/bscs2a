
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class View {
    //Declaring Objects

    JFrame f = new JFrame("Swing Arithmetics");
    JLabel l1 = new JLabel("First Number");
    JLabel l2 = new JLabel("Second Number");
    JLabel l3 = new JLabel("Result");

    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();

    JButton b1 = new JButton("+");
    JButton b2 = new JButton("-");
    JButton b3 = new JButton("*");
    JButton b4 = new JButton("/");
    JButton b5 = new JButton("%");
    JButton b6 = new JButton("Cancel");
    JPanel calcPanel = new JPanel();

    View() {
        //Giving Coordinates
        t3.setEditable(false);   
        l1.setBounds(10, 5, 100, 20);
        l2.setBounds(10, 28, 100, 20);
        l3.setBounds(10, 51, 100, 20);

        t1.setBounds(120, 5, 100, 20);
        t2.setBounds(120, 28, 100, 20);
        t3.setBounds(120, 51, 100, 20);

        b1.setBounds(10, 74, 100, 20);
        b2.setBounds(120, 74, 100, 20);
        b3.setBounds(10, 97, 100, 20);
        b4.setBounds(120, 97, 100, 20);
        b5.setBounds(10, 120, 100, 20);
        b6.setBounds(120, 120, 100, 20);

        //Adding components to the frame
        calcPanel.add(l1);
        calcPanel.add(l2);
        calcPanel.add(l3);

        calcPanel.add(t1);
        calcPanel.add(t2);
        calcPanel.add(t3);

        calcPanel.add(b1);
        calcPanel.add(b2);
        calcPanel.add(b3);
        calcPanel.add(b4);
        calcPanel.add(b5);
        calcPanel.add(b6);
        calcPanel.setLayout(null);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(250, 200);
        f.setVisible(true);
        f.add(calcPanel);
    }

    public int getFirstNumber() {

        return Integer.parseInt(t1.getText());
    }

    public int getSecondNumber() {

        return Integer.parseInt(t2.getText());

    }

    public void setCalcSolution(int solution) {
        t3.setText(Integer.toString(solution));

    }

    void addCalculateListener(ActionListener listenForCalcButton) {

        b1.addActionListener(listenForCalcButton);
    }

    void subCalculateListener(ActionListener listenForCalcButton) {

        b2.addActionListener(listenForCalcButton);
    }

    void mulCalculateListener(ActionListener listenForCalcButton) {

        b3.addActionListener(listenForCalcButton);
    }

    void divCalculateListener(ActionListener listenForCalcButton) {

        b4.addActionListener(listenForCalcButton);
    }

    void modCalculateListener(ActionListener listenForCalcButton) {
        b5.addActionListener(listenForCalcButton);
    }

    void cancelCalculateListener(ActionListener listenForCalcButton) {
        b6.addActionListener(listenForCalcButton);

    }
    	void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(f, errorMessage);
		
	}
}

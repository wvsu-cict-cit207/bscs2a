import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Frame {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame window = new Frame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Frame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 51));
		frame.setBounds(100, 100, 303, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(155, 11, 112, 35);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setBounds(155, 56, 112, 35);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				int num1, num2, ans;
				try {
				num1 = Integer.parseInt(textFieldNum1.getText());
				num2 = Integer.parseInt(textFieldNum2.getText());
				ans = num1 + num2;
				textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "Fill in number");		
				}
			}
		});
		btnNewButton.setBounds(27, 153, 98, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				int num1, num2, ans;
				try {
				num1 = Integer.parseInt(textFieldNum1.getText());
				num2 = Integer.parseInt(textFieldNum2.getText());
				ans = num1 - num2;
				textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "Fill in number");		
				}
				
			}
		});
		btnNewButton_1.setBounds(27, 187, 98, 27);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				int num1, num2, ans;
				try {
				num1 = Integer.parseInt(textFieldNum1.getText());
				num2 = Integer.parseInt(textFieldNum2.getText());
				ans = num1 * num2;
				textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "Fill in number");		
				}
			}
		});
		btnNewButton_2.setBounds(27, 227, 98, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				int num1, num2, ans;
				try {
				num1 = Integer.parseInt(textFieldNum1.getText());
				num2 = Integer.parseInt(textFieldNum2.getText());
				ans = num1 / num2;
				textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "Fill in number");		
				}
			}
		});
		btnNewButton_3.setBounds(155, 153, 98, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("%");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent argO) {
				int num1, num2, ans;
				try {
				num1 = Integer.parseInt(textFieldNum1.getText());
				num2 = Integer.parseInt(textFieldNum2.getText());
				ans = num1 % num2;
				textFieldAns.setText(Integer.toString(ans));
				}catch(Exception e) {
					
					JOptionPane.showMessageDialog(null, "Fill in number");		
				}
			}
		});
		btnNewButton_4.setBounds(155, 187, 98, 27);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Clear");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg) {
				textFieldNum1.setText("");
				textFieldNum1.getText();
				textFieldNum2.setText("");
				textFieldNum2.getText();
				textFieldAns.setText("");
				textFieldAns.getText();
			}
			
		});
		btnNewButton_5.setBounds(155, 227, 98, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(155, 102, 112, 23);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First Number");
		lblNewLabel.setBounds(27, 15, 112, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Second Number");
		lblNewLabel_1.setBounds(27, 64, 98, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setBounds(27, 106, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
}

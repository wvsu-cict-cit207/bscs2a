import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticView {

    //References
    private ArithmeticController controller;
    private JFrame frame;
    private JPanel panel;

    public JTextField firstNumField;
    public  JTextField secondNumField;
    public JTextField resultField;

    public ArithmeticView(ArithmeticController _controller) {
        controller = _controller;

        //FRAME
        frame = new JFrame();
        frame.setTitle("Swing Arithmetics");
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //PANEL
        panel = new JPanel();
        panel.setBorder(new EmptyBorder(10,10,10,10));
        panel.setLayout(new GridLayout(6, 2, 5, 5));
        panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        frame.add(panel);

        //LABELS AND TEXT FIELDS
        panel.add(new Label("First Number"));
        firstNumField = new JTextField();
        panel.add(firstNumField);

        panel.add(new Label("Second Number"));
        secondNumField = new JTextField();
        panel.add(secondNumField);

        panel.add(new Label("Result"));
        resultField = new JTextField();
        resultField.setEditable(false);
        panel.add(resultField);

        //BUTTONS
        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");
        JButton moduloButton = new JButton("%");
        JButton clearButton = new JButton("CLEAR");

        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(multiplyButton);
        panel.add(divideButton);
        panel.add(moduloButton);
        panel.add(clearButton);

        //Hooking up Event Handlers to Event
        addButton.addActionListener(controller.addListener);
        subtractButton.addActionListener(controller.subtractListener);
        multiplyButton.addActionListener(controller.multiplyListener);
        divideButton.addActionListener(controller.divideListener);
        moduloButton.addActionListener(controller.moduloListener);
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNumField.setText("");
                secondNumField.setText("");
                resultField.setText("");
                controller.clearListener();
            }
        });

        frame.setVisible(true);
    }
}
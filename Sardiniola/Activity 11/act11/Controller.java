
package act11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    View view;
    public Controller(View view) {
        this.view = view;
        view.allListeners(new ActionButton());
    }
    private double getNum1() {
        double num1 = Double.parseDouble(view.fieldNum1.getText());
        return num1;
    }
    
    private double getNum2() {
        double num2 = Double.parseDouble(view.fieldNum2.getText());
        return num2;
    }
    
    private void clear() {
        view.fieldNum1.setText("");
        view.fieldNum2.setText("");
        view.result.setText("");
    }
    
    public class ActionButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == view.addBtn) {
                try {
                    double sum = Model.add(getNum1(), getNum2());
                    view.result.setText(""+sum);
                } catch (Exception ex) {
                    clear();
                    view.result.setText("INVALID INPUT");
                }
            }
            else if (e.getSource() == view.minusBtn) {
                try {
                double difference = Model.minus(getNum1(), getNum2());
                view.result.setText(""+ difference);
                } catch (Exception ex) {
                    clear();
                    view.result.setText("INVALID INPUT");
                }
            }
            else if (e.getSource() == view.timesBtn) {
                try {
                double product = Model.times(getNum1(), getNum2());
                view.result.setText(""+ product);
                } catch (Exception ex) {
                    clear();
                    view.result.setText("INVALID INPUT");
                }
            }
            else if (e.getSource() == view.divideBtn) {
                try {
                double qoutient = Model.divide(getNum1(), getNum2());
                view.result.setText("" + qoutient);
                } catch (Exception ex){
                    clear();
                    view.result.setText("INVALID INPUT");
                }
            }
            
            else if (e.getSource() == view.moduloBtn) {
                try {
                double remainder = Model.modulo(getNum1(), getNum2());
                view.result.setText("" + remainder);
                } catch (Exception ex) {
                    clear();
                    view.result.setText("INVALID INPUT");
                }
            }
            
            else if (e.getSource() == view.clearBtn) {
                clear();
            }
        }
    }
}

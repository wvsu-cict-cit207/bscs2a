
public class Model {

    // Holds the value of the sum of the numbers
    // entered in the view
    private int calculationValue;

    public void addTwoNumbers(int t1, int t2) {

        calculationValue = t1 + t2;

    }

    public void subTwoNumbers(int t1, int t2) {

        calculationValue = t1 - t2;

    }

    public void mulTwoNumbers(int t1, int t2) {

        calculationValue = t1 * t2;

    }

    public void divTwoNumbers(int t1, int t2) {

        calculationValue = t1 / t2;

    }

    public void modTwoNumbers(int t1, int t2) {

        calculationValue = t1 % t2;

    }

    public int getCalculationValue() {

        return calculationValue;

    }

}

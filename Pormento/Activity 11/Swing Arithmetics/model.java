public class model {
    private double result;

    public void addNumbers (double num1, double num2) {
        result = num1+num2;
    }
    public void subtractNumbers (double num1, double num2){
        result = num1-num2;
    }
    public void multiplyNumbers (double num1, double num2){
        result = num1*num2;
    }
    public void divideNumbers (double num1, double num2){
        result = num1/num2;
    }

    public void percentage (double number){
        result = number/100;
    }

    public double getResult() {
        return result;
    }
}

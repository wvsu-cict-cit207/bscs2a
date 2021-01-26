public class ArithmeticModel {
    private int result;
    public void add(int num1, int num2){
        result = num1 + num2;
    }
    public void subtract(int num1, int num2){
        result = num1 - num2;
    }
    public void multiply(int num1, int num2){
        result = num1 * num2;
    }
    public void divide(int num1, int num2){
        result = num1 / num2;
    }
    public void remainder(int num1, int num2){
        result = num1 % num2;
    }
    public int getResult(){
        return result;
    }
}

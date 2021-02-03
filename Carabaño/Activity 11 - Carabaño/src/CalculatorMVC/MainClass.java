package CalculatorMVC;

public class MainClass {
    public static void main(String[] args) {
        CalculatorView calculatorView = new CalculatorView();
        new CalculatorController(calculatorView);
    } 
}

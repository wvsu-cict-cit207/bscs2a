 
public class JavatryModel {
    private int calculationValue;
public void add(int firstNumber, int secondNumber){
calculationValue = firstNumber + secondNumber;
}

public void subtract (int firstNumber, int secondNumber){
    calculationValue = firstNumber - secondNumber;
}

public void multiply(int firstNumber, int secondNumber){
    calculationValue =  firstNumber*secondNumber;
}

public void divide (int firstNumber, int secondNumber){
    calculationValue = firstNumber/secondNumber;
}

public void remainder (int firstNumber, int secondNumber){
    calculationValue = firstNumber%secondNumber;
}

public int getCalculationValue(){
    return calculationValue;

}

}

public class ArithmeticModel {

    enum ArithmeticOperations {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE,
        MODULO
    }

    private ArithmeticController controller;

    ArithmeticOperations currentOperation;
    float firstNum;
    float secondNum;
    float result;

    public ArithmeticModel(ArithmeticController _controller) {
        controller = _controller;
    }

    public void changeCurrentOperation(ArithmeticOperations arithmeticOperations) {
        currentOperation = arithmeticOperations;
    }

    public float getResult() {
        if (currentOperation == null) return 0;

        switch (currentOperation) {
            case ADD:
                result = firstNum + secondNum;
                break;
            case SUBTRACT:
                result = firstNum - secondNum;
                break;
            case MULTIPLY:
                result = firstNum * secondNum;
                break;
            case DIVIDE:
                result = firstNum / secondNum;
                break;
            case MODULO:
                result = firstNum % secondNum;
                break;
        }
        return result;
    }

    public void reset() {
        firstNum = 0;
        secondNum = 0;
        currentOperation = null;
    }
}
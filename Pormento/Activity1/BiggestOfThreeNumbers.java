package Activity1;
public class BiggestOfThreeNumbers {
    public static void main(String[] args){
        int number1 = 0; //user input   
        int number2 = 34;
        int number3 = 26;
        //using and operation
        if (number1 >= number2 && number1 >= number3){
            System.out.println("The biggest number is: "+ number1);
        }
        else if (number2 >=number1 && number2 >= number3){
            System.out.println("The biggest number is: "+ number2);
        }
        else if (number3 >=number1 && number3 >= number2){
            System.out.println("The biggest number is: "+ number3);
        }
    }
}

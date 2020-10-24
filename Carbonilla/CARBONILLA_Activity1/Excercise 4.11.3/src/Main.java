public class Main {

    public static void main(String[] args) {

        System.out.println("\nNumber 1 = 10 \nNumber 2 = 23 \nNumber 3 = 5");

        int num1 = 10, num2 = 23, num3 = 7;

        if(num1 >= num2 && num1 >= num3)
            System.out.println(num1+ "is the largest Number");

        else if(num2 >= num1 && num2 >= num3)
            System.out.println(num2+ " is the largest Number");

        else
            System.out.println(num3+ "is the largest Number");


    }
}

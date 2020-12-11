public class Main {

    public static void main(String[] args) {
        int a = 10, b = 23, c = 5;
        int greatest = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("number 1 = " + a);
        System.out.println("number 2 = " + b);
        System.out.println("number 3 = " + c);
        System.out.println("The highest number is = " + greatest);
    }
}


public class Main {

    public static void main(String[] args) {
        System.out.println("Number 1 = 10 \nNumber 2 = 20 \nNumber 3 = 45");
        double[] arr = {10, 20 ,45};
        double total = 0;

        for (double v : arr) {
            total = total + v;
        }
        
        double average = total / arr.length;

        System.out.format("The average is: %.3f", average);
    }
}
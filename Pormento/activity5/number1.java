package activity5;
import java.util.Scanner;
public class number1 {

    public static void main(String[] args) {
        System.out.println("ITEM NO.1 ");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int column = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            System.out.print("* ");
            for (int j = 0; j < column - 1; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

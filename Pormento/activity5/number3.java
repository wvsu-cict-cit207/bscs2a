package activity5;
import java.util.Scanner;
public class number3 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ITEM NO.3");
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        
        for(int j=1;j <= rows;j++){
            for(int i=1;i <= rows-j;i++){
                System.out.print("  ");
            }
            
            for(int k=1;k<=j; k++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

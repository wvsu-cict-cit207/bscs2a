package exercise4;
public class Exercise4 {
    public static void main(String[] args) {
        int rows = 5, k = 0;

        for(int j = 1; j <= rows; ++j, k = 0) {
            for(int space = 1; space <= rows - j; ++space) {
                System.out.print("  ");
            }
            while(k != 2 * j - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }   
    }
}

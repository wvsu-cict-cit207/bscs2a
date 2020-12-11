
public class Exercise4 {

    public static void main(String[] args) {
        int rows = 5, k = 0;

        for(int c = 1; c <= rows; ++c, k = 0) {
            for(int space = 1; space <= rows - c; ++space) {
                System.out.print("  ");
            }

            while(k != 2 * c - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}

public class Main {

    public static void main(String[] args) {

        System.out.println("\nStar Row Pattern  : ");
        starNumberPattern();

        System.out.println("\nLeft Triangle Pattern : ");
        leftTrianglePatter();

        System.out.println("\nRight Triangle Pattern : ");
        rightTrianglePatter();

        System.out.println("\nStar Pyramid Pattern : ");
        starPyramidPattern();

        System.out.println("\nNumber Pyramid Pattern : ");
        numberPyramidPattern();

        System.out.println("\nInverse Number Pyramid Pattern : ");
        inverseNumberPattern();
    }

    public static void starNumberPattern() {
        for (int i = 0; i < 4; i++) {
            int num;

            if (i % 2 == 0) {
                num = 0;

                for (int j = 0; j < 10; j++) {
                    System.out.print(" * ");
                }
            } else {
                num = 1;

                for (int j = 0; j < 10; j++) {
                    System.out.print(" * ");

                }
            }
            System.out.println();
        }
    }

    public static void leftTrianglePatter() {
        int i, j, k = 8;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < k; j++) {
                System.out.print(" ");
            }
            k = k - 2;
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }

    public static void rightTrianglePatter() {
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void starPyramidPattern() {
        int rows = 5, k = 0;
        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
    }

    public static void numberPyramidPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print(" " + i);
            }

            System.out.println();
        }

    }

    public static void inverseNumberPattern() {
        for (int i = 1; i < 6; i++) {

            int row = 6;

            for (int x = 1; x <= row - i; x++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j );
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

    }
}


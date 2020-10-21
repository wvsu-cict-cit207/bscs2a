import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Number of Rows used in Example is 5, try typing 5.");
        System.out.print("Enter number of rows for each loop: ");
	    int n = sc.nextInt();

        System.out.println("i) ");
        for (int i = 0; i  < n-1; i++) {
            for (int j  = 0; j < 2*n-1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\nii) ");
        for (int i = 0; i  < n; i++) {
            for (int j  = 0; j < n-(n-1-i); j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        System.out.println("\niii) ");
        for (int i = 0; i  < n; i++) {
            for (int j  = 0; j < n; j++) {
                if (j >= n-1-i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        System.out.println("\niv) ");
        for (int i = 0; i  < n; i++) {
            for (int j  = 0; j < 2*n-1; j++) {
                if (j >= n-1-i && j <= n-1+i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        System.out.println("\nv) ");
        for (int i = 0; i  < n; i++) {
            for (int j  = 0; j < 2*n-1; j++) {
                if (j >= n-1-i && j <= n-1+i) {
                    System.out.print(i+1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        System.out.println("\nvi) ");
        for (int i = 0; i  < n; i++) {
            for (int j  = 0; j < 2*n-1; j++) {
                if (j >= n-1-i && j <= n-1+i) {
                    if (j >= n-1 && j <= n-1) {
                        System.out.print("1");
                    } else {
                        if (j > n-1) System.out.print(j-(n-2));
                        if (j < n-1) System.out.print(n-j);
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}

package javaactivity7;

import java.util.Scanner;

public class JavaActivity7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of elements in the array:");

        int min, max;
        int n = sc.nextInt();
        int num[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Input the element" + (i+1) + ": ");
            num[i] = sc.nextInt();

        }
        min = num[0];
        max = num[0];

        for (int i = 0; i < n; i++) {
            if (min > num[i]) {
                min= num[i];
                

            }
            if (max < num[i]) {
                max = num[i];

            }
        }
        System.out.print("\n The smallest number is: " + min);
        System.out.print("\n The largest number is: " + max);
    }
}

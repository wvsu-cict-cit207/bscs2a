//@author Maria Arlyn R. Fuerte (BSCS-2A)
//Activity 6

import java.util.Scanner;

public class Fuerte_Act6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num[] = new int[10];
        System.out.print("Enter 10 Numbers: ");
        for(int i=0; i<10; i++){
            num[i] = input.nextInt();
        }
        int maximum = num[0];
        int minimum = num[0];
        for(int i=0; i<10; i++){
            if(num[i] > maximum){
                maximum = num[i];
            }
            if(num[i] < minimum){
                minimum = num[i];
            }
        }
        System.out.println("The Maximum Value is " + maximum);
        System.out.println("The Minimum Value is " + minimum);
    }
}

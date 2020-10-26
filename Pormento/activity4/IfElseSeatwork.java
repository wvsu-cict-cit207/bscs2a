package activity4;
import java.util.Scanner;
public class IfElseSeatwork {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Grade: ");//intro
        int grade = sc.nextInt();//cin
        if (grade >= 95){
            System.out.println("Excellent!");
        }
        else if (grade >= 90 && grade <=94){
            System.out.println("Outstanding!");
        }
        else if (grade >= 85 && grade <=89){
            System.out.println("Very Good!");
        }
        else if (grade >= 80 && grade <=84){
            System.out.println("Good!");
        }
        else if (grade >= 75 && grade <=79){
            System.out.println("Passed!");
        }
        else {
            System.out.println("Failed!");
        }
    }
}
/*
Excellent 95 up
outstanding 90-94
Very good 85 - 89
Good 80 - 84
Passed 75 - 79
Failed 74 down
*/
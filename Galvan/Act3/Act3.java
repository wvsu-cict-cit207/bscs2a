import java.util.Scanner;

public class Act3{
    public static void main(String[] args){
        
        Scanner cin = new Scanner(System.in);
        System.out.print("Degrees Celsius: ");
        double celius = cin.nextDouble();
        double fahrenheit = celius * 9/5 + 32;
        System.out.println(celius + " degrees Celsius = " + fahrenheit + " degrees Fahrenheit");
    }
}

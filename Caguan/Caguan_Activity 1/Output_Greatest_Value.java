package javaapplication.Activity1;

public class Output_Greatest_Value {
    public static void main(String[] args){
        int num = 10;
        int num2 = 23;
        int num3 = 5;
        int higher = 0;
        int highest = 0;
        
        System.out.println("Number 1 = " + num);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);
        
        
        higher = (num2 > num)?num2:num;
        higher = (num2 > num3)?num2:num3;
        highest = higher;
        
        System.out.println("The highest number is = " + highest);
        
    }
    
}

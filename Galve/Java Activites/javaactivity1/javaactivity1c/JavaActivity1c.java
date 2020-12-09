package javaactivity1c;

public class JavaActivity1c {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, num2, num3, highestNum;
        
        num1 = 10;
        num2 = 23;
        num3 = 5;
        

        highestNum = num3(num1>num2 ? num1:num2)? num3:((num1>num2)?num1:num2);
        System.out.println("number 1: "+num1);
        System.out.println("number 2: "+num2);
        System.out.println("number 3: "+num3);
        System.out.println("The highest number is "+highestNum);
        
    }

    public static boolean num3(int i) {
       return false;
    }
    
}

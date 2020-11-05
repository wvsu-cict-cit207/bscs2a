public class GreatestValue{
    public static void main (String[] args) {
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        int highest = 0;
        
        highest = (num1 > num2)?num1:num2;
        highest = (highest > num3)?highest:num3;
        
        System.out.println("The highest number is = " + highest);
    }
}
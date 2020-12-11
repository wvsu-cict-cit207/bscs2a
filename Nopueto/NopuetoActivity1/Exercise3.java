
package Activity1;


public class Exercise3 {
    
    public static void main(String[]args){
    int number1 = 10;
    int number2 = 23;
    int number3 = 5;
    
        System.out.println("number1 = "+ number1);
        System.out.println("number2 = "+ number2);
        System.out.println("number3 = "+ number3);
        
    if (number1 >= number2 &&  number1>= number3)
        System.out.print("The highest nyumber " + number1);
    
    else if (number2>= number1 && number2>= number3)
        System.out.print("The highest number " +number2);
    
   else
    System.out.print("The highest number is "+ number2);
   
}

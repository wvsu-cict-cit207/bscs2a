import java.util.Scanner;

class Operations {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Please Enter Numbers: ");

    // String input
      int num1 = myObj.nextInt();
      int num2 = myObj.nextInt();
      int remainder = num1 % num2;
     
    // Output input by user
    System.out.println("Sum = " + (num1 + num2)); 
    System.out.println("Difference = " + (num1 - num2)); 
    System.out.println("Product = " + (num1 * num2)); 
    System.out.println("Qoutient = " + (num1 / num2) + "...remainder: " + remainder); 
  }
}

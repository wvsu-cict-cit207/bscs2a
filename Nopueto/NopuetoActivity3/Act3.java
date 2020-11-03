import java.util.Scanner;

class conversion {
  public static void main(String[] args) {
    Scanner temp = new Scanner(System.in);

    System.out.println("Enter your Temperature in Celsius: ");

      double celsius = temp.nextDouble();
      double farenheight;
     
      farenheight = (((celsius) * 1.8) + 32 );
      
    System.out.println("Farenheight = " + (farenheight)); 
   
  }  
}


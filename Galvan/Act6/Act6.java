import java.util.Scanner;

public class Act6
{
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please enter 10 numbers.");
      int current[];
      current = new int[10];
      for(int i = 0; i < current.length; i++)
      {
         current[i] = sc.nextInt();
      }
        int maximum = current[0];
        int minimum = current[0];
      for(int i = 0; i < current.length; i++)
      {
         if(current[i] > maximum)
         {
            maximum = current[i];
            
         }
         if(current[i] < minimum)
         {
            minimum = current[i];
         }
      }
      System.out.println("Maximum: " + maximum);
      System.out.println("Minimum: " + minimum);
   }
}
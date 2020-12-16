import java.util.Scanner;
import java.util.ArrayList;

public class Act7
{ 
    
  public static void main(String[] args) 
  { 
    int n, numlist;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the size of the array:");
    n = s.nextInt();
    System.out.println("Enter " + n + " integers");
    ArrayList<Integer> arrlist = new ArrayList<>();
     for(int i = 0; i < n; i++)
     {
         
        numlist = s.nextInt();
        arrlist.add(numlist);
     }
    int maximum = arrlist.get(0);
    int minimum = arrlist.get(0);
    for(int i = 0; i < n; i++)
      {
         if(arrlist.get(i) > maximum)
         {
            maximum = arrlist.get(i);
            
         }
         if(arrlist.get(i)< minimum)
         {
            minimum = arrlist.get(i);
         }
      }
      System.out.println("Largest Element: " + maximum + " Smallest Element: " + minimum);
   }
}

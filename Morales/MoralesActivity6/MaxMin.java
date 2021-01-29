import java.util.Scanner;

public class MaxMin {

public static void main (String args[])
{
    Scanner scan=new Scanner(System.in);
    
    int min,max;
    System.out.print("Enter 10 Integers: ");
    int arr[]=new int[10]; 
  
    for(int i=0; i< 10; i++)
        {
    
     arr[i]=scan.nextInt();
        }
        min=arr[0];
        max=arr[0];
    for(int i=0; i< 10; i++)
    {
         if(min>arr[i])
            {
            min=arr[i];
            }
     
        if(max<arr[i])
            {
             max=arr[i];  
            }
    }
            System.out.print("\nThe smallest value is: "+min);
            System.out.print("\nThe largest value is: "+max);
    }
}

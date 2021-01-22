import java.util.Scanner;

public class MaxMin2 {


    public static void main(String[] args) 
    {
         Scanner scan=new Scanner(System.in);
    
    int n;
    int min,max;
    
    System.out.println("Enter Array Size:");
    n = scan.nextInt();
    System.out.print("Enter Elements: ");
    int arr[]= new int[n];
    
  
    for(int i=0; i< n; i++)
        {
    
     arr[i]=scan.nextInt();
        }
        min=arr[0];
        max=arr[0];
    for(int i=0; i< n; i++)
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

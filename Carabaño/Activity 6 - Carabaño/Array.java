package array;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();  
        int a[] = new int[n];
        System.out.println("Enter " + n +" elements:");
        for(int i = 0; i < n; i++ ){
            a[i] = sc.nextInt();
        }
         
    int low=a[0];
    int high=a[0];
    
        for(int i=0; i<n; i++)
        {
            if(low>a[i]){
                low=a[i];
            }
            if(high<a[i]){
                high=a[i]; 
            }
        }
        
    System.out.print("Largest element : "+high);
    System.out.print("\nSmallest element : "+low +"\n");
    
    }  
}
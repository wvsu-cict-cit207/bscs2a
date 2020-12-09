
package javaactivity6;

public class JavaActivity6 {

    
    public static void main(String[] args) {
        int num[] = new int [] {12, 6, 2, 8,15};
        
        int min = num[0];
        int max = num[0];
        
        for (int i = 1; i<num.length; i++ )
        {
            if (num[i] > max)
            {
                max = num[i];
            }
            if (num[i] <  min)
            {
               min = num[i]; 
            }
        }
        System.out.println("Biggest number in the array is: " + max);
        System.out.println("Smallest number in the array is: " + min);
        
            
  }
}
    
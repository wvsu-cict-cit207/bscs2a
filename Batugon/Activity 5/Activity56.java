
package activity5.pkg6;

public class Activity56 {

    public static void main(String[] args) {
      for(int i = 1; i <= 5; i++) {
      int n = 5;
      for(int j = 1; j <= n - i; j++){
          System.out.print(" ");
      }
      for(int k = i; k >= 1; k--)
      {
         System.out.print(k);  
      }
       for (int c = 2; c <= i; c++ )
      {
         System.out.print(c); 
      }
     System.out.println();
    }
  }
}
    


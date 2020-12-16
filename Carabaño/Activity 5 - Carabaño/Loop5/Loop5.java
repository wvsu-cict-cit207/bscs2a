package loop5;

public class Loop5 {
    public static void main(String[] args) {
        int rows=10;
        
        for (int i=1; i<=rows; i++){
          for (int j=1; j<=rows; j++){
          System.out.print(" ");
          }
         rows--;
        for (int k=1; k<=i; k++){
          System.out.print(i+" ");           
        }					                           
        System.out.println();
        }
    }
 }


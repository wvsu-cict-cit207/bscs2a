package loop6;

public class Loop6 {
    public static void main(String[] args) {
        int rows=5;
        System.out.println("");
        
        for (int i=1; i<=rows; i++){
          for (int j=1; j<=(rows-i)*2; j++){
          System.out.print(" ");
          }
        for (int k=i; k>=1; k--){
          System.out.print(" "+k);         
        }										
        for (int l=2; l<=i; l++){
          System.out.print(" "+l);    
        }                         
        System.out.println();
        }                                                 
    }
}


package loop1;
public class Loop1 {
    public static void main(String[] args) {
       int rows = 4;
       for(int x=1; x<=rows; x++){
           for(int y=0; y<10; y++){
               System.out.print("*");
           }
           System.out.println();
       }
    }
 }
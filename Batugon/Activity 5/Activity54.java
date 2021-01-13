
package activity5.pkg4;

public class Activity54 {
    
    public static void main(String[] args) {
         int rows = 5, i = 0;
         
         for(int a = 1; a <= rows; ++a, i = 0) {
             for(int space = 1; space <= rows - a; ++space) {
                 System.out.print(" ");              
             }
             
             while(i != 2 * a - 1) {
                 System.out.print("* ");
                 ++i;
             }
             System.out.println();
         }
    }
    
}

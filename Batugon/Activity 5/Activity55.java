
package activity5.pkg5;

public class Activity55 {

    public static void main(String[] args) {
       for(int a = 1; a <= 5; a++)
       {
           for(int i = 5 - a; i >= 1; i--)
           {
               System.out.print(" ");
           }
           for(int i = 1; i <= 2 * a -1; i++)
           {
               System.out.print(a);
           }
           System.out.println();
       }
    }
    
}


package activity5.pkg3;


public class Activity53 {
  
    public static void main(String[] args) {
        int  a, b, c = 8;
        for(a = 0; a < 5; a++)
        {
            for(b = 0; b < c; b++)
            {
                System.out.print(" ");
            }
            c = c - 2;
            for(b = 0; b <= a; b++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}

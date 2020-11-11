
package javaactivity5e;

public class JavaActivity5e {

    
    public static void main(String[] args) {
        int i = 6, z = 0;
        for (int x=1; x<i; x++, z=0){
            for (int y=i-x; y>1; y--){
                System.out.print(" ");
            }
            while(z !=2 * x-1){
                System.out.print(x); z++;
            }
             System.out.println();
        }
       
    }
    
}

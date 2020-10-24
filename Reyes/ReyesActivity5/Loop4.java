package loop4;
public class Loop4 {
    public static void main(String[] args) {
        int rows = 6, z = 0;
        for(int x=1; x<rows; x++, z=0){
            for(int y=1; y<=rows-x; y++){
                System.out.print(" ");
            }
            while(z !=2 * x-1){
                System.out.print("*");
                z++;
            }
            System.out.println();
        } 
    }
 }   
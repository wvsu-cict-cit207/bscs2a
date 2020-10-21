package loop5;
public class Loop5 {
    public static void main(String[] args) {    
        int rows = 6, z = 0;
        for(int x=1; x<rows; x++, z=0) {
            for (int y=rows-x; y>1; y--){
                System.out.print(" ");
            }
            while(z !=2 * x-1){
                System.out.print(x);
                z++;
            }   
            System.out.println();
        }         
    }
}
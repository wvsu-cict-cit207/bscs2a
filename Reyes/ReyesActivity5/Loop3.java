package loop3;
public class Loop3 {
    public static void main(String[] args) {
        int rows = 5;
        for(int x=0; x<rows; x++){
            for(int y=rows-x; y>=0; y--){
                System.out.print(" ");
            }
            for(int y=0; y<=x; y++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
 }   

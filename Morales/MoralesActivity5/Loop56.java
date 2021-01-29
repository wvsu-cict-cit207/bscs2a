package loop5.pkg6;

public class Loop56 {

   
    public static void main(String[] args) {
        for(int i=0; i<6; i++){
            for(int j=6
                    ; j>i; j--){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print(i-j);
            }
            for(int j=0; j<i-1; j++){
                System.out.print(2+j);
            }
            System.out.println();
        }
    }
}

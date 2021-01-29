package loop5.pkg4;

public class Loop54 {

    
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            for(int j=4; j>i; j--){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

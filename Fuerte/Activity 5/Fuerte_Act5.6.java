// @author Maria Arlyn R. Fuerte (BSCS-2A)
//Activity 5.6
public class Fuerte_Act5 {

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

package loop2;
public class Loop2 {
    public static void main(String[] args) {
        int rows = 5;
        for(int x=1; x<=rows; x++){
            for(int y=1; y<=x; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
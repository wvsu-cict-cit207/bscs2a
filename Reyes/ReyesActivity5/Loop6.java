package loop6;
public class Loop6 {
    public static void main(String[] args) {
        for(int x=1; x<6; x++){
            
            int v=6;
            
            for(int y=1; y<=v-x; y++){
                System.out.print(" ");
            }
            for(int z=x; z>=1; z--){
                System.out.print(z);
            }
            for(int w=2; w<=x; w++){
                System.out.print(w);
            }
            System.out.println();
        }
        for(int x=3; x>=1; x--){
        }
  }
}


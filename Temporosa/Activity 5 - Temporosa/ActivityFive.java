//Activity 5 - all outputs

public class ActivityFive {
    
    public static void main(String[] args) {
        
//Output I
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 10; j++)
            System.out.print("*");
            System.out.println();
        }

//Output II
        for(int i = 1; i <= 5; i++){
            for (int j = 1;  j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

//Output III
        for (int i = 1; i <=5; i++){
            for (int k =1; k <= (5-i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
         }

//Output IV
        for (int i = 1; i <= 5; i++){
            for (int k = 1; k <= (5-i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


 //Output V
        for (int i = 1; i <= 5; i++){
            for (int k = 1; k <= (5-i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(i);
            }
            for (int j = 2; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

//Output VI
        for (int i = 1; i <= 5; i++){
            for (int k = 1; k<= (5 - i); k++) { 
                System.out.print(" "); 
            } 
                
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for (int l = 2; l <= i; l++){
                System.out.print(l);
            }
                System.out.println();
            }

    }
}

package javaapplication.Activity1;

public class Actvity_5 {
    public static void main(String[] args){
       int i,j,k, l, m, n;
       System.out.println("Output i)");
       for(i = 0; i < 4; i++){
           for(j = 0; j < 10; j++){
           System.out.print("*");
           }
           System.out.println();
       }
       
       
       System.out.println("Output ii)");
       for(i = 0; i <= 5; i++){
           for(j = 0; j < i; j++){
               System.out.print("*");
           }
           System.out.println();
       }
       
       System.out.println("Output iii)");
       for(i = 0; i < 5; i++){
           for(j = 0; j < 5 - i; j++){
               System.out.print(" ");
           }
           for(k = 0; k <= i; k++){
               System.out.print("*");
           }
           System.out.println();
       }
       System.out.println("Output iv)");
       for(i = 1; i <= 5; i++){
           n=5;
           for(j = 1; j <= n - i; j++){
               System.out.printf(" ");
           }
           for(k = i; k >= 1; k--){
               System.out.print("*");
           }
           for(l = 2; l <= i; l++){
               System.out.print("*");
           }
           System.out.println();
       }
       
       int numbers = 1;
       System.out.println("Output v)");
       for(i = 1; i <= 5; i++){
           n=5;
           for(j = 1; j <= n - i; j++){
               System.out.printf(" ");
           }
           for(k = i; k >= 1; k--){
               System.out.print(numbers);
           }
           for(l = 2; l <= i; l++){
               System.out.print(numbers);
           }
           numbers++;
           System.out.println();
       }
       
       System.out.println("Output vi)");
       for(i = 1; i <= 5; i++){
           n=5;
           for(j = 1; j <= n - i; j++){
               System.out.printf(" ");
           }
           for(k = i; k >= 1; k--){
               System.out.printf("%d", k);
           }
           for(l = 2; l <= i; l++){
               System.out.printf("%d", l);
           }
           for(m = i; m >= l; m--){
               System.out.printf("%d", m);
           }
           System.out.println();
       }
       
    }
}

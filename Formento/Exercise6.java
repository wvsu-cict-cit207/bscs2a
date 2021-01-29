package exercise6;
public class Exercise6 {
    public static void main(String[] args) {
        for (int c = 1; c <= 5; c++) {  
        int n = 5;  
        for (int j = 1; j<= n - c; j++){   
        System.out.print(" ");   
        }   
        for (int k = c; k >= 1; k--)  
        {  
        System.out.print(k);  
        }  
        for (int l = 2; l <= c; l++)   
        {  
        System.out.print(l);   
        }   
        System.out.println();   
        }         
    }   
}

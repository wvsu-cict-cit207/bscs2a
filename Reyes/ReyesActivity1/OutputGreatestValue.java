package outputgreatestvalue;

public class OutputGreatestValue {

    public static void main(String[] args) {
        
        int a = 10, b = 25, c = 5, d;
        
        d = c (a > b ? a : b) ? c : ((a > b) ? a : b);
        
        System.out.print("number 1: " + a + "\n");
        System.out.print("number 2: " + b + "\n");
        System.out.print("number 3: " + c + "\n");
        System.out.print("The highest number is " + d + "\n");
        
   
    }

    public static boolean c(int i) {
        return false;
       
    }
    
}

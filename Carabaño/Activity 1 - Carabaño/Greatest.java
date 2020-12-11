
package greatest;

public class Greatest {

    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        int c = 5;
        int greastest = 0;
        
        greastest = (a > b) ?(a > c ? a : c) : (b > c ? b: c);
        System.out.println("Number 1 is " + a);
        System.out.println("Number 2 is " + b);
        System.out.println("Number 3 is " +c);
        System.out.println("The greastest number is " + greastest);
        
        }
    }


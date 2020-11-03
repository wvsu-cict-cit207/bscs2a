import java.util.Scanner;

class Act4 {
    public static void main(String[] args) {
   Scanner temperature = new Scanner (System.in);
   
   System.out.println(("Options: ") + ("\n 1.C - F") + ("\n 2. F - C "));
   
        System.out.println ("Enter Choice: ");
        int choice = temperature.nextInt ();
        
            if (choice == 1) {
        
                System.out.print("Enter Temperature: ");
                double temp = temperature.nextDouble ();
                double fahr = (temp *9 ) / 5 + 32;
                System.out.println (temp + "degrees celcius = " + fahr + " degress Farenheit ");
            } else if (choice == 2 ) {
            
                System.out.print ("Enter choices: ");
                double temp = temperature.nextDouble ();
                double cels = (temp - 32) * 5 / 9;
                System.out.println(temp + "degrees Celcius = " + cels + "degrees fareinheit ");
    }
            
    }
}

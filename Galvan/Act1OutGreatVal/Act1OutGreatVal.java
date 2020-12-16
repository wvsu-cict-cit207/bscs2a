public class Act1OutGreatVal{
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 23;
        int num3 = 5;
        
        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);
        System.out.println("Number 3 = " + num3);
        int greatest = num1;
        if(greatest < num2)
            greatest = num2;

        if(greatest < num3)
            greatest = num3;

        System.out.println("The highest number is = " + greatest);
        
    }
    
}

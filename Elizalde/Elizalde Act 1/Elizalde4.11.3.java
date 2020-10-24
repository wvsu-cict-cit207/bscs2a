public class ElizaldeAct1 {
    public static void main(String[] args) {
        int n1=10, n2=23, n3=5;
        int greater = (n1>n2)?n1:n2;
        int greatest = (greater>n3)?greater:n3;
        System.out.println("Number 1 = "+n1);
        System.out.println("Number 2 = "+n2);
        System.out.println("Number 3 = "+n3);
        System.out.println("The highest number is = "+greatest);
    }
}

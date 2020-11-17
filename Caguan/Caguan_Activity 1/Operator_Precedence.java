package javaapplication.Activity1;

public class Operator_Precedence {
    public static void main(String[] args) {
         System.out.println("1. a / b ^ c ^ d – e + f – g * h + i");
         System.out.println("2. 3 * 10 *2 / 15 – 2 + 4 ^ 2 ^ 2");
         System.out.println("3. r ^ s * t / u – v + w ^ x – y++");
         System.out.println();
         System.out.println("Re-written");
         System.out.println("1. (((a / b) ^ c) ^ ((d – (e + f)) – ((g * h) + i)))");
         System.out.println("2. ((((((3 * 10) *2) / 15) – (2 + 4)) ^ 2) ^ 2)");
         System.out.println("3. ((r ^ (((s * t) / u) – (v + w))) ^ (x – (y++)))");
    }
    
}

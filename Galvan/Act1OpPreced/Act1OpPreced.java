public class Act1OpPreced{
    public static void main(String[] args) {
         System.out.println("Given:");
         System.out.println("1. a / b ^ c ^ d – e + f – g * h + i");
         System.out.println("2. 3 * 10 *2 / 15 – 2 + 4 ^ 2 ^ 2");
         System.out.println("3. r ^ s * t / u – v + w ^ x – y++\n\n");
         System.out.println("Operator Precedence");
         System.out.println("1. (((a / b) ^ c) ^ ((d – (e + f)) – ((g * h) + i)))");
         System.out.println("2. ((((((3 * 10) *2) / 15) – (2 + 4)) ^ 2) ^ 2)");
         System.out.println("3. ((r ^ (((s * t) / u) – (v + w))) ^ (x – (y++)))");
    }
    
}

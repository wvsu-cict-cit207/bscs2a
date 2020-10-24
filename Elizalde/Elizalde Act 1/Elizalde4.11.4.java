public class ElizaldeAct1 {
    public static void main(String[] args) {
        System.out.println("Original: ");
        System.out.println("1. a / b ^ c ^ d – e + f – g * h + i\n");
        System.out.println("2. 3 * 10 *2 / 15 – 2 + 4 ^ 2 ^ 2\n");
        System.out.println("3. r ^ s * t / u – v + w ^ x – y++");
        System.out.println("New: ");
        System.out.println("1. ((a / b) ^ c) ^ ((d – (e + f)) – ((g * h) + i))\n");
        System.out.println("2. ((((((3 * 10) *2) / 15) – (2 + 4)) ^ 2) ^ 2)\n");
        System.out.println("3. (r ^(((s * t) / u) – (v + w))) ^ (x – (y++))");
    }
}

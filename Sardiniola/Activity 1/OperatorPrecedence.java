public class OperatorPrecedence {
    public static void main (String[] args) {
        System.out.println("(((a/b)^c)^((((d-e)+f)-(g*h))+i))");
        System.out.println("(((((((3*10)*2)/15)-2)+4)^2)^2)");
        System.out.println("((r^((((s*t)/u)-v)+w))^(x-(y++)))");
    }
}
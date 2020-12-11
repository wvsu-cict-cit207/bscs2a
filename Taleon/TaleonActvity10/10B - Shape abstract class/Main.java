public class Main {

    public static void main(String[] args) {
	    Shape shape1 = new Circle(5);
	    Shape shape2 = new Square(18.2, 65.7);

        System.out.println("shape1 getName() = " + shape1.getName());
	    System.out.println("shape1 getArea() = " + shape1.getArea() + "\n");
        System.out.println("shape2 getName() = " + shape2.getName());
        System.out.println("shape2 getArea() = " + shape2.getArea());
    }
}

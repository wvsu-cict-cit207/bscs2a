package AbstractClass;

public class TestShape {

    public static void main(String[] args) {
        Shape shape1 = new Circle(5,"Circle");
        Shape shape2 = new Square(2, "Square");
        
        System.out.println("The area of the " + shape1.getName() + " is " + shape1.getArea());
        System.out.println("The area of the " + shape2.getName()+ " is " + shape2.getArea());
        
    }   
}
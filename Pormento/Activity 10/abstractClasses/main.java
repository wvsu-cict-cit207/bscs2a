package abstractClasses;

public class main {

    public static void main(String[] args) {
        Shape circleShape = new Circle(90);
        Shape squareShape = new Square(35, 79);
        
        System.out.println(circleShape.getName());
        System.out.println(circleShape.getArea());
        System.out.println(squareShape.getName());
        System.out.println(squareShape.getArea());
    }

}

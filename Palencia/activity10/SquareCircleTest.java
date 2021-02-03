package activity10;

public class SquareCircleTest {
    public static void main(String[] args) {

    	
        double sides = 5;
        Shape square = new Square(sides);
        System.out.println("Square sides: " + sides + "\nTotal Area: " + square.area() 
        		+ "\nTotal Parameter: " + square.perimeter() + "\n");

        
        
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nTotal Area: " + circle.area()
            + "\nTotal Perimeter: " + circle.perimeter() + "\n");
    }
}
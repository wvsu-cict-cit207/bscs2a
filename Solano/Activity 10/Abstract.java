//11.6.2 The Shape abstract class
package shapeabstractclass;
abstract class Shape {
    public abstract String getName();
    public abstract double getArea();
}

//Square
class Square extends Shape {
    double length;
    double width;
    
    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
    
    @Override
    public String getName() {
        return "Square";
    }
}
//Circle
class Circle extends Shape {
    double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
    
    @Override
    public String getName() {
        return "Circle";
    }
}

public class Abstract {
    public static void main(String[] args) {
        Square s = new Square(2, 2);
        Circle c = new Circle(5);
        
        System.out.println(s.getName() + " Area: " + s.getArea());
        System.out.println(c.getName() + " Area: " + c.getArea());
    }
}
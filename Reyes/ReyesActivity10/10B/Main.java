//11.6.2 The Shape abstract class
package abstractshape;

abstract class Shape {
    public abstract String getName();
    public abstract double getArea();
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

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Square s = new Square(2, 2);
        System.out.println(c.getName() + " Area: " + c.getArea());
        System.out.println(s.getName() + " Area: " + s.getArea());
    }
}

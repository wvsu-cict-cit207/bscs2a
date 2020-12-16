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
//Triangle
class Triangle extends Shape {
    double base;
    double height;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    public double getArea() {
        return (base * height) / 2;
    }
    
    @Override
    public String getName() {
        return "Triangle";
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Triangle t = new Triangle(2, 2);
        System.out.println(c.getName() + " Area: " + c.getArea());
        System.out.println(t.getName() + " Area: " + t.getArea());
    }
}

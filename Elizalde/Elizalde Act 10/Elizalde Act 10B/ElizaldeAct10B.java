abstract class Shape{
    public abstract double getArea();
    public abstract String getName();
}
class Circle extends Shape{
    protected double radius;
    protected double area;
    
    public Circle(double radius){
        this.radius = radius;
    }    
    @Override
    public double getArea() {
        area = 3.14 * (radius*radius);
        return area;
    }

    @Override
    public String getName() {
        return "Circle";
    }
    
}

class Square extends Shape{
    protected double side;
    protected double area;
    
    public Square(double side){
        this.side = side;
    }
    @Override
    public double getArea() {
        area = side*side;
        return area;
    }

    @Override
    public String getName() {
        return "Square";
    }
    
}


public class ElizaldeAct10B {
    public static void main(String[] args) {
        //Sample
        Circle circle = new Circle(5);
        System.out.println(circle.getName());
        System.out.println("Area: "+circle.getArea());
        
        Square square = new Square(5);
        System.out.println(square.getName());
        System.out.println("Area: "+square.getArea());
    } 
}


public class Circle extends Shape {

    private static final double pi = 3.1416;
    private double radius = 0;

    public double getArea() {
        return pi * radius * radius;
    }

    public String getName() {
        return "Circle";
    }


    public void setRadius(double r) {
        radius = r;
    }

 
    public double getRadius() {
        return radius;
    }
}

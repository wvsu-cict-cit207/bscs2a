package AbstractClass;

public class Circle extends Shape {
    private double radius;
    private String name;

    public Circle(double radius, String name) {
        this.radius = radius;
        this.name= name;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String getName() {
        return name;
    }

}

package AbstractClass;

public class Square extends Shape {
    private double sideLength;
    private String name;
    
    public Square(double sideLength, String name) {
        this.sideLength = sideLength;
        this.name = name;
    }
    
    public double getRadius() {
        return sideLength;
    }
    
    public void setsideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return sideLength * sideLength ;
    }

    public String getName() {
        return name;
    }
}
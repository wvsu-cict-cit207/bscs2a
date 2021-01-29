package abstractClasses;
public class Square extends Shape{

    private double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    
    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String getName() {
        return "Square";
    }
    
}

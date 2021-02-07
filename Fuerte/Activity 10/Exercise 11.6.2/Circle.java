// Activity 10
// Exercise 11.6.2 - "The Shape Abstract Class"
// @author Maria Arlyn R. Fuerte (BSCS 2A)

class Circle extends Shape{
    private double radius;
    
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double GetArea() { //Formula of Circle: A = pi*r^2
        return Math.PI*(radius*radius);
    }

    @Override
    public String GetName() {
        return "Circle";
    }
}

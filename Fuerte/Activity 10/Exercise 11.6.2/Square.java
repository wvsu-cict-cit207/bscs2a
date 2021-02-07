// Activity 10
// Exercise 11.6.2 - "The Shape Abstract Class"
// @author Maria Arlyn R. Fuerte (BSCS 2A)

class Square extends Shape{
    private double side;
    
    public Square(double side){
        this.side = side;
    }

    @Override
    public double GetArea() { //Formula of Area of Square: A = s^2
        return (side*side);
    }

    @Override
    public String GetName() {
        return "Square";
    }
}


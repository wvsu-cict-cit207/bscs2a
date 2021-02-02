package activity10;

public class Square extends Shape {
    private double sides; 

    public Square(double sides) {
        this.sides = sides;
    }
    public double perimeter() // no abstract
    { 
    	return 4d*this.sides;
    }
    public double area() // no abstract
    { 
    	return this.sides*this.sides;
    }

}



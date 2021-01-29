package act10;

public class Square extends Shape{
    public double getArea (){
        double side = 9.0;
        double area = side * side;
        return area;
    }
    
    public String getName () {
        String c = Square.class.getSimpleName();
        return c;
    }
}

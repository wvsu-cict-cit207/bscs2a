package act10;

import static java.lang.Math.PI;

public class Circle extends Shape{
    int radius = 9;
    @Override
    public double getArea(){
        double area = 2*(PI*(radius));
        return area;
    }
    
    @Override
    public String getName (){
        String name = Circle.class.getSimpleName();
        return name;
    }
 }

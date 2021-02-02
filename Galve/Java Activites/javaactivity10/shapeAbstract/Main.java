
package abstractshape;


abstract class shapeFig {
    public abstract String getName();
    public abstract double getArea();
}

class circleObj extends shapeFig {
    double radius;
    
    public circleObj (double radius){
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
    
    @Override
    public String getName() {
        return "Circle";
    }
}

class squareObj extends shapeFig {
    double length;
    double width;
    
    public squareObj (double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
    
    @Override
    public String getName() {
        return "Square";
    }
}

public class Main {
    public static void main(String[] args) {
        circleObj c = new circleObj(10);
        squareObj s= new squareObj(10,10);
        System.out.println(c.getName() + " Area: " + c.getArea());
        System.out.println(s.getName() + " Area: " + s.getArea());
    }
}
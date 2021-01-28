
abstract class Shape{

    public abstract void getName();
    public abstract double getArea();

}

class Square extends Shape{
    double length;


    public Square(double length){
        super();
        this.length = length;
    }

    public void getName(){
        System.out.println("Area of Square");
    }
    
    public double getArea(){
        return Math.pow(length,2);
    }
}

class Circle extends Shape{
    double radius;

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public void getName(){
        System.out.println("Area of Circle");
    }

    public double getArea(){
        return 3.14*radius*radius;
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        
        Square sq = new Square(4);
        sq.getName();
        System.out.println(sq.getArea());
        System.out.println();

        Circle cir = new Circle(3);
        cir.getName();
        System.out.println(cir.getArea());
        }

    }
    
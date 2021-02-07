// Activity 10
// Exercise 11.6.2 - "The Shape Abstract Class"
// @author Maria Arlyn R. Fuerte (BSCS 2A)

class Main{
    public static void main(String[] args) {
        Shape sq = new Square(5);
        Shape ci = new Circle(4);
        
        System.out.println("The Area of the " + sq.GetName() + " is " + sq.GetArea());
        System.out.println("The Area of the " + ci.GetName() + " is " + ci.GetArea());
    }
}
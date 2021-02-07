public class Square extends Shape {

    private double side = 0;

 
    public double getArea() {
        return side * side;
    }

    /**
     * returns shape name
     */
    public String getName() {
        return "Square";
    }

    /**
     * set length of side
     */
    public void setSide(double s) {
        side = s;
    }

    /**
     * returns length of one side
     */
    public double getSide() {
        return side;
    }


}

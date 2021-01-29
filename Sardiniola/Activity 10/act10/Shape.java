package act10;

public abstract class Shape {
    public void polygon() {
        System.out.println("I am a polygon!");
    }
    public abstract double getArea();
    public abstract String getName();
}
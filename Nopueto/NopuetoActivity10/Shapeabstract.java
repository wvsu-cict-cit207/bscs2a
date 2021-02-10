package shapeAbstract;

import java.util.Scanner;

abstract class Shape {
    abstract void getArea();
    abstract void getName();
}

class Circle extends Shape {
    Scanner sc = new Scanner(System.in);
    
    public void getArea() {
        System.out.print("Enter Size Radius: ");
        int radius = sc.nextInt();
        System.out.println("The Area = " + (radius*radius)*3.14);
    }

    public void getName() {
        System.out.println("The Shape is Circle");
    }

}

class Square extends Shape {

    Scanner sc = new Scanner(System.in);

    public void getArea() {
        System.out.print("Enter Size Length: ");
        int length = sc.nextInt();
        System.out.println("The Area = " + (length* length));
    }

    public void getName() {
        System.out.println("The Shape is Square");
    }

}

public class Shapeabstract {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square shape = new Square();

        circle.getName();
        circle.getArea();

        shape.getName();
        shape.getArea();
    }
} 


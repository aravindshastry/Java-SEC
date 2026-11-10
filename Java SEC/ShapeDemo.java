abstract class Shape {
    abstract double calculateArea();

    void display() {
        System.out.println("Area: " + calculateArea());
    }
}

class Circle extends Shape {
    double radius = 7;

    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length = 10;
    double breadth = 5;

    double calculateArea() {
        return length * breadth;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.println("Circle:");
        c.display();

        System.out.println("Rectangle:");
        r.display();
    }
}
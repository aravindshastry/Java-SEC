public class AreaCalculator {

    public double area(int side) {
        return side * side;
    }

    public double area(double length, double breadth) {
        return length * breadth;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        System.out.println(calc.area(5));
        System.out.println(calc.area(4.5, 6.0));
        System.out.println(calc.area(3.5));
    }
}
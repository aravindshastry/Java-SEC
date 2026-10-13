class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    void displayCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of Circle: " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle(7.0);
        c.displayArea();
        c.displayCircumference();
    }
}
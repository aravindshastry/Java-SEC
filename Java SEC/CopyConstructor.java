class Car {
    String brand;
    int price;

    Car(String b, int p) {
        brand = b;
        price = p;
    }

    Car(Car c) {
        brand = c.brand;
        price = c.price;
    }

    void display() {
        System.out.println(brand + " " + price);
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW", 5000000);
        Car c2 = new Car(c1);

        c1.display();
        c2.display();
    }
}
class Person {
    String name;
    int age;

    Person() {
        this("Unknown", 0);
    }

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.display();
    }
}
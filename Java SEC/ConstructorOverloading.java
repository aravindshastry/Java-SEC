class Employee {
    String name;
    int salary;

    Employee() {
        name = "Unknown";
        salary = 0;
    }

    Employee(String n) {
        name = n;
        salary = 10000;
    }

    Employee(String n, int s) {
        name = n;
        salary = s;
    }

    void display() {
        System.out.println(name + " " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("John");
        Employee e3 = new Employee("Alex", 30000);

        e1.display();
        e2.display();
        e3.display();
    }
}
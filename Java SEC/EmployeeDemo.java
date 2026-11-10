abstract class EmployeeBase {

    abstract void calculateSalary();

    void companyName() {
        System.out.println("ABC Technologies");
    }
}

class Developer extends EmployeeBase {

    void calculateSalary() {
        System.out.println("Salary: 50000");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Developer d = new Developer();

        d.companyName();
        d.calculateSalary();
    }
}
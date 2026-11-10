abstract class Employee {

    abstract void calculateSalary();

    void companyName() {
        System.out.println("ABC Technologies");
    }
}

class FullTimeEmployee extends Employee {

    void calculateSalary() {
        System.out.println("Full-Time Employee Salary: 40000");
    }
}

class PartTimeEmployee extends Employee {

    void calculateSalary() {
        System.out.println("Part-Time Employee Salary: 15000");
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {

        FullTimeEmployee f = new FullTimeEmployee();
        PartTimeEmployee p = new PartTimeEmployee();

        f.companyName();
        f.calculateSalary();

        p.companyName();
        p.calculateSalary();
    }
}
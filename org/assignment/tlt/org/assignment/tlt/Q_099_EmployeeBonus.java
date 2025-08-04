package org.assignment.tlt;

abstract class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateBonus() {
        return salary * 0.10;
    }
}

public class Q_099_EmployeeBonus {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee(1, "Alice", 50000);
        Employee partTime = new PartTimeEmployee(2, "Bob", 20000);

        System.out.println("Full-Time Employee Bonus: " + fullTime.calculateBonus());
        System.out.println("Part-Time Employee Bonus: " + partTime.calculateBonus());
    }
}

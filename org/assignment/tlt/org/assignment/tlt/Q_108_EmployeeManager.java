package org.assignment.tlt;

class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateAnnualSalary() {
        double bonus = teamSize * 1000; // Bonus based on team size
        return super.calculateAnnualSalary() + bonus;
    }

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Annual Salary with Bonus: " + calculateAnnualSalary());
    }
}

public class Q_108_EmployeeManager {
    public static void main(String[] args) {
        Manager manager = new Manager("Prajwal", 50000, 5);
        manager.showDetails();
    }
}

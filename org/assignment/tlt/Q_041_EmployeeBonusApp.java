package org.assignment.tlt;

abstract class Employee {
    protected int id;
    protected String name;
    protected double salary;

    void setDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    abstract double calculateBonus();
}

class FullTimeEmployee extends Employee {
    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}

class PartTimeEmployee extends Employee {
    @Override
    double calculateBonus() {
        return salary * 0.10;
    }
}

public class Q_041_EmployeeBonusApp {
    public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee();
        fullTime.setDetails(1, "Anita", 60000);
        System.out.println("Full-Time Employee Bonus: " + fullTime.calculateBonus());

        Employee partTime = new PartTimeEmployee();
        partTime.setDetails(2, "Raj", 25000);
        System.out.println("Part-Time Employee Bonus: " + partTime.calculateBonus());
    }
}

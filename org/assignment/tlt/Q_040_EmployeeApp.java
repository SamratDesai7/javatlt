package org.assignment.tlt;

class Employee {
    protected String name;
    protected int baseSalary;
    protected int overtimeHours;

    void setDetails(String name, int baseSalary, int overtimeHours) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.overtimeHours = overtimeHours;
    }

    int calculateSalary() {
        return baseSalary + workingHours();
    }

    int workingHours() {
        return overtimeHours * 100;
    }
}

class Manager extends Employee {
    @Override
    int calculateSalary() {
        int bonus = 5000;
        return baseSalary + bonus + workingHours();
    }
}

class Developer extends Employee {
    @Override
    int calculateSalary() {
        int bonus = 3000;
        return baseSalary + bonus + workingHours();
    }
}

class Intern extends Employee {
    @Override
    int calculateSalary() {
        int penalty = 500;
        return baseSalary - penalty + workingHours();
    }
}

public class Q_040_EmployeeApp {
    public static void main(String[] args) {
        Employee manager = new Manager();
        manager.setDetails("John", 40000, 10);
        System.out.println("Manager Salary: " + manager.calculateSalary());

        Employee developer = new Developer();
        developer.setDetails("Alice", 30000, 8);
        System.out.println("Developer Salary: " + developer.calculateSalary());

        Employee intern = new Intern();
        intern.setDetails("Bob", 15000, 5);
        System.out.println("Intern Salary: " + intern.calculateSalary());
    }
}

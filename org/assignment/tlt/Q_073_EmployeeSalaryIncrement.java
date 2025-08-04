package org.assignment.tlt;

class Employee {
    String name;
    double salary;
    String department;

    Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }
}

public class Q_073_EmployeeSalaryIncrement {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 50000.0, "IT");
        employee.salary = employee.salary + (employee.salary * 0.10);
        System.out.println("Updated Salary: " + employee.salary);
    }
}


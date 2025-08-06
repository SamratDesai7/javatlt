package org.assignment.tlt;

import java.util.Scanner;

class Employee {
    String name;
    int id;
    double basicSalary;
    int totalDays;     // total working days in a month
    int presentDays;   // days the employee was present

    public Employee(String name, int id, double basicSalary, int totalDays, int presentDays) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.totalDays = totalDays;
        this.presentDays = presentDays;
    }

    double calculateSalary() {
        return (basicSalary / totalDays) * presentDays;
    }

    double getAttendancePercentage() {
        return (presentDays * 100.0) / totalDays;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Basic Salary: " + basicSalary +
                ", Present Days: " + presentDays + "/" + totalDays);
    }
}

public class Q266_PayrollManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        int count = 0;

        while (true) {
            System.out.println("\n--- PayRoll Management System ---");
            System.out.println("1. Add New Employees");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Calculate Employee Salary");
            System.out.println("5. Show Employees with > 90% Attendance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (ch) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.println("\nEnter details for Employee " + (i + 1));
                        System.out.print("Name: ");
                        String name = sc.nextLine();
                        System.out.print("ID: ");
                        int id = sc.nextInt();
                        System.out.print("Basic Salary: ");
                        double salary = sc.nextDouble();
                        System.out.print("Total Working Days: ");
                        int totalDays = sc.nextInt();
                        System.out.print("Present Days: ");
                        int presentDays = sc.nextInt();
                        sc.nextLine(); // consume newline
                        employees[i] = new Employee(name, id, salary, totalDays, presentDays);
                        count++;
                    }
                    System.out.println("Employees added successfully.");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {
                        System.out.println("\nEmployee Details:");
                        for (int i = 0; i < count; i++) {
                            employees[i].display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter employee name to search: ");
                    String searchName = sc.nextLine();
                    boolean found = false;
                    for (int i = 0; i < count; i++) {
                        if (employees[i].name.equalsIgnoreCase(searchName)) {
                            employees[i].display();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter employee name to calculate salary: ");
                    String nameForSalary = sc.nextLine();
                    boolean salaryFound = false;
                    for (int i = 0; i < count; i++) {
                        if (employees[i].name.equalsIgnoreCase(nameForSalary)) {
                            double netSalary = employees[i].calculateSalary();
                            System.out.println("Salary of " + nameForSalary + ": ₹" + netSalary);
                            salaryFound = true;
                            break;
                        }
                    }
                    if (!salaryFound) {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 5:
                    System.out.println("Employees with > 90% attendance:");
                    boolean anyFound = false;
                    for (int i = 0; i < count; i++) {
                        if (employees[i].getAttendancePercentage() > 90) {
                            employees[i].display();
                            anyFound = true;
                        }
                    }
                    if (!anyFound) {
                        System.out.println("No employee has more than 90% attendance.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting Program.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

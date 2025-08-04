package org.assignment.tlt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;

    public void setDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Q183_EmployeeManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];
        int count = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add New Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Sort Employees by ID");
            System.out.println("4. Search Employee by Name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    if (count >= employees.length) {
                        System.out.println("Employee array is full.");
                    } else {
                        Employee emp = new Employee();
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = sc.nextDouble();

                        emp.setDetails(id, name, salary);
                        employees[count++] = emp;

                        System.out.println("Employee added successfully.");
                    }
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No employee records found.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            employees[i].display();
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No employees to sort.");
                    } else {
                        Arrays.sort(employees, 0, count, Comparator.comparingInt(Employee::getId));
                        System.out.println("Employees sorted by ID.");
                    }
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("No employee records.");
                    } else {
                        System.out.print("Enter name to search: ");
                        String searchName = sc.nextLine();
                        boolean found = false;

                        for (int i = 0; i < count; i++) {
                            if (employees[i].getName().equalsIgnoreCase(searchName)) {
                                System.out.println("Employee Found:");
                                employees[i].display();
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Employee with name \"" + searchName + "\" not found.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

package org.assignment.tlt;

class Company {
    String companyName;
    double revenue;

    public Company(String companyName, double revenue) {
        this.companyName = companyName;
        this.revenue = revenue;
    }

    public void displayInfo() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Revenue: $" + revenue + " million");
    }
}

class Department extends Company {
    String departmentName;
    int numOfEmployees;

    public Department(String companyName, double revenue, String departmentName, int numOfEmployees) {
        super(companyName, revenue);
        this.departmentName = departmentName;
        this.numOfEmployees = numOfEmployees;
    }

    public void displayDetails() {
        super.displayInfo();
        System.out.println("Department: " + departmentName);
        System.out.println("Number of Employees: " + numOfEmployees);
    }
}

public class Q_110_CompanyDepartment {
    public static void main(String[] args) {
        Department dept = new Department("TechWave Solutions", 250.75, "Research & Development", 120);
        dept.displayDetails();
    }
}

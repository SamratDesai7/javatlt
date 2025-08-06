package org.assignment.tlt;

public class Q_079_Employee {
     int empId;
    String empName;
    double salary;

    
    Q_079_Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    
    void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Original Salary: ₹" + salary);

        
        if (salary <= 30000) {
            double increasedSalary = salary + (salary * 0.10);
            System.out.println("Salary increased by 10%: ₹" + increasedSalary);
        } else {
            System.out.println("No salary increase applicable.");
        }
    }

 
    public static void main(String[] args) {
        Q_079_Employee emp1 = new Q_079_Employee(101, "Prajwal", 28000);
        Q_079_Employee emp2 = new Q_079_Employee(102, "Vinay", 45000);

        System.out.println("--- Employee 1 ---");
        emp1.displayDetails();

        System.out.println("\n--- Employee 2 ---");
        emp2.displayDetails();
    }
}




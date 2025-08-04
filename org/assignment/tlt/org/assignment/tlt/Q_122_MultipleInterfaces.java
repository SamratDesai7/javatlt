package org.assignment.tlt;

interface Workable {
    void work();
}

interface Payable {
    double calculatePay();
}

class PartTimeEmployee implements Workable, Payable {
    private String name;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public void work() {
        System.out.println(name + " is working part-time for " + hoursWorked + " hours.");
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}

public class Q_122_MultipleInterfaces {
    public static void main(String[] args) {
        PartTimeEmployee employee = new PartTimeEmployee("Prajwal", 20, 300.0);
        employee.work();
        double pay = employee.calculatePay();
        System.out.println("Pay: " + pay);
    }
}

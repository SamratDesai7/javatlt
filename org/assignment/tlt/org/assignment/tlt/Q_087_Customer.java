package org.assignment.tlt;

public class Q_087_Customer {
    String customerName;
    int customerID;
    int unitsConsumed;

    Q_087_Customer(String customerName, int customerID, int unitsConsumed) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.unitsConsumed = unitsConsumed;
    }

    void calculateBill() {
        double bill = 0;
        if (unitsConsumed <= 100) {
            bill = unitsConsumed * 1.5;
        } else if (unitsConsumed <= 300) {
            bill = 100 * 1.5 + (unitsConsumed - 100) * 2.5;
        } else {
            bill = 100 * 1.5 + 200 * 2.5 + (unitsConsumed - 300) * 4.0;
        }
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerID);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill: ₹" + bill);
    }

    public static void main(String[] args) {
        Q_087_Customer customer1 = new Q_087_Customer("Prajwal", 101, 350);
        customer1.calculateBill();
    }
}

package org.assignment.tlt;

abstract class Customer {
    double balance = 0;

    abstract void addTransaction(double amount);

    double getBalance() {
        return balance;
    }
}

class PremiumCustomer extends Customer {
    @Override
    void addTransaction(double amount) {
        double discountedAmount = amount * 0.90;
        balance += discountedAmount;
        System.out.println("Transaction (with 10% discount): $" + discountedAmount);
    }
}

class RegularCustomer extends Customer {
    @Override
    void addTransaction(double amount) {
        balance += amount;
        System.out.println("Transaction (no discount): $" + amount);
    }
}

public class Q_096_CustomerTransaction {
    public static void main(String[] args) {
        PremiumCustomer premium = new PremiumCustomer();
        RegularCustomer regular = new RegularCustomer();

        System.out.println("---- Premium Customer ----");
        premium.addTransaction(200);
        System.out.println("Balance: $" + premium.getBalance());

        System.out.println("\n---- Regular Customer ----");
        regular.addTransaction(200);
        System.out.println("Balance: $" + regular.getBalance());
    }
}

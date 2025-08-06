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
        balance += amount * 0.90;
    }
}

class RegularCustomer extends Customer {
    @Override
    void addTransaction(double amount) {
        balance += amount;
    }
}

public class Q_097_CustomerBalance {
    public static void main(String[] args) {
        PremiumCustomer premium = new PremiumCustomer();
        RegularCustomer regular = new RegularCustomer();

        premium.addTransaction(500);
        premium.addTransaction(300);

        regular.addTransaction(500);
        regular.addTransaction(300);

        System.out.println("Premium Customer Final Balance: $" + premium.getBalance());
        System.out.println("Regular Customer Final Balance: $" + regular.getBalance());
    }
}

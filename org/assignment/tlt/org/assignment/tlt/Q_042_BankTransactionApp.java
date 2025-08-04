package org.assignment.tlt;

abstract class Bank {
    protected double balance;

    void setInitialBalance(double amount) {
        this.balance = amount;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    double getBalance() {
        return balance;
    }
}

class SavingsBank extends Bank {
    private final double fee = 2.0;

    @Override
    void deposit(double amount) {
        balance += (amount - fee);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= (amount + fee)) {
            balance -= (amount + fee);
        }
    }
}

class CurrentBank extends Bank {
    private final double fee = 5.0;

    @Override
    void deposit(double amount) {
        balance += (amount - fee);
    }

    @Override
    void withdraw(double amount) {
        if (balance >= (amount + fee)) {
            balance -= (amount + fee);
        }
    }
}

public class Q_042_BankTransactionApp {
    public static void main(String[] args) {
        Bank savings = new SavingsBank();
        savings.setInitialBalance(1000);
        savings.deposit(200);
        System.out.println("Savings Balance after deposit: " + savings.getBalance());
        savings.withdraw(100);
        System.out.println("Savings Balance after withdrawal: " + savings.getBalance());

        Bank current = new CurrentBank();
        current.setInitialBalance(1000);
        current.deposit(200);
        System.out.println("Current Balance after deposit: " + current.getBalance());
        current.withdraw(100);
        System.out.println("Current Balance after withdrawal: " + current.getBalance());
    }
}

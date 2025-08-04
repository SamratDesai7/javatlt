package org.assignment.tlt;

abstract class Bank {
    double balance = 0;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    abstract void withdraw(double amount);

    double getBalance() {
        return balance;
    }
}

class SavingsBank extends Bank {
    final double fee = 2.0;

    @Override
    void withdraw(double amount) {
        if (balance >= amount + fee) {
            balance -= (amount + fee);
            System.out.println("Withdrew: $" + amount + " (Fee: $" + fee + ")");
        } else {
            System.out.println("Insufficient balance for withdrawal with fee.");
        }
    }
}

class CurrentBank extends Bank {
    final double fee = 5.0;

    @Override
    void withdraw(double amount) {
        if (balance >= amount + fee) {
            balance -= (amount + fee);
            System.out.println("Withdrew: $" + amount + " (Fee: $" + fee + ")");
        } else {
            System.out.println("Insufficient balance for withdrawal with fee.");
        }
    }
}

public class Q_095_BankTransaction {
    public static void main(String[] args) {
        SavingsBank savings = new SavingsBank();
        CurrentBank current = new CurrentBank();

        System.out.println("---- Savings Bank Transactions ----");
        savings.deposit(100);
        System.out.println("Balance: $" + savings.getBalance());
        savings.withdraw(50);
        System.out.println("Balance: $" + savings.getBalance());

        System.out.println("\n---- Current Bank Transactions ----");
        current.deposit(200);
        System.out.println("Balance: $" + current.getBalance());
        current.withdraw(100);
        System.out.println("Balance: $" + current.getBalance());
    }
}

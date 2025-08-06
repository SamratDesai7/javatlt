package org.assignment.tlt;

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of ₹" + amount + " successful. Remaining balance: ₹" + balance);
            return true;
        } else {
            System.out.println("Insufficient balance. Withdrawal failed.");
            return false;
        }
    }

    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal of ₹" + amount + " successful. New balance: ₹" + balance);
            return true;
        } else {
            System.out.println("Overdraft limit exceeded. Withdrawal denied.");
            return false;
        }
    }
}

public class Q_115_BankAccountCurrentAccount {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("BA123", 5000);
        acc1.displayBalance();
        acc1.withdraw(2000);
        acc1.withdraw(4000);

        System.out.println();

        CurrentAccount acc2 = new CurrentAccount("CA456", 3000, 2000);
        acc2.displayBalance();
        acc2.withdraw(4500);
        acc2.withdraw(6000);
    }
}

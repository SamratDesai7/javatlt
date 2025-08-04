package org.assignment.tlt;

class Bank {
    public double calculateInterest(int amount, int years) {
        double defaultRate = 5.0;
        return (amount * defaultRate * years) / 100;
    }
}

class SavingsAccount extends Bank {
    private double interestRate;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest(int amount, int years) {
        return (amount * interestRate * years) / 100;
    }

    public void showInterest(int amount, int years) {
        System.out.println("Amount: " + amount);
        System.out.println("Years: " + years);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Calculated Interest: " + calculateInterest(amount, years));
    }
}

public class Q_109_BankSavingsAccount {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(7.5);
        sa.showInterest(10000, 3);
    }
}

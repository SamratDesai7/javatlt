package org.assignment.tlt;

public class Q_080_BankAcc {
    int accountNumber;
    double balance;

   
    Q_080_BankAcc() {
        accountNumber = 123456;
        balance = 1000.0;
    }

    
    void deposit() {
        balance += 100;
        System.out.println("₹100 deposited successfully.");
        System.out.println("Updated Balance: ₹" + balance);
    }


    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    
    public static void main(String[] args) {
        Q_080_BankAcc account = new Q_080_BankAcc(); 

        System.out.println("--- Initial Account Details ---");
        account.displayAccountDetails();

        System.out.println("\n--- After Deposit ---");
        account.deposit(); 
    }
}




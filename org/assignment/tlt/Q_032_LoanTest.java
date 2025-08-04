package org.assignment.tlt;

class Loan {
    protected int loanAmount;
    protected int periodInYears;
    protected int interestRate;

    public void setLoanAmount(int loanAmount, int periodInYears, int interestRate) {
        this.loanAmount = loanAmount;
        this.periodInYears = periodInYears;
        this.interestRate = interestRate;
    }

    public int getMonthlyEmi() {
       return 0;
    }
}

class CarLoan extends Loan {
    @Override
    public int getMonthlyEmi() {
        if (periodInYears > 7) {
            System.out.println("CarLoan period should not exceed 7 years.");
            return 0;
        }
        int totalMonths = periodInYears * 12;
        int interest = (loanAmount * interestRate * periodInYears) / 100;
        return (loanAmount + interest) / totalMonths;
    }
}

class HomeLoan extends Loan {
    @Override
    public int getMonthlyEmi() {
        if (periodInYears > 30) {
            System.out.println("HomeLoan period should not exceed 30 years.");
            return 0;
        }
        int totalMonths = periodInYears * 12;
        int interest = (loanAmount * interestRate * periodInYears) / 100;
        return (loanAmount + interest) / totalMonths;
    }
}

public class Q_032_LoanTest {
    public static void main(String[] args) {
        // Dynamic Polymorphism
        Loan loan;

        loan = new CarLoan();
        loan.setLoanAmount(500000, 5, 10);
        System.out.println("Car Loan EMI: " + loan.getMonthlyEmi());

        loan = new HomeLoan();
        loan.setLoanAmount(3000000, 20, 7);
        System.out.println("Home Loan EMI: " + loan.getMonthlyEmi());
    }
}

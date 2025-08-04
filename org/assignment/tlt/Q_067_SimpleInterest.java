package org.assignment.tlt;

public class Q_067_SimpleInterest {

    public static void main(String[] args) {
        calculate(10000, 5, 2);
    }

    public static void calculate(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + interest);
    }
}

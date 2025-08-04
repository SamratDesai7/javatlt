package org.assignment.tlt;

public class Q_102_Calculator {

    public int calculate(int a, int b) {
        return a + b;
    }

    public double calculate(double a, double b) {
        return a * b;
    }

    public String calculate(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Q_102_Calculator calc = new Q_102_Calculator();
        int sum = calc.calculate(10, 20);
        System.out.println("Addition: " + sum);
        double product = calc.calculate(2.5, 4.0);
        System.out.println("Multiplication: " + product);
        String combined = calc.calculate("Hello, ", "World!");
        System.out.println("Concatenation: " + combined);
    }
}

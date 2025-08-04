package org.assignment.tlt;

public class Q213_FibonacciSequence {
    public static void main(String[] args) {
        int n = 20;
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

package org.assignment.tlt;

public class Q243_FibonacciTenTerms {
     public static void main(String[] args) {
        int a = 0, b = 1;
        int terms = 10;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}

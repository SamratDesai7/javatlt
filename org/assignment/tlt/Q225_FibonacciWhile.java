package org.assignment.tlt;

public class Q225_FibonacciWhile {
    public static void main(String[] args) {
        int n = 20;
        int count = 0;
        int a = 0, b = 1;
        while (count < n) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
            count++;
        }
    }
}

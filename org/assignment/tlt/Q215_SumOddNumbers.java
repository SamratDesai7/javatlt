package org.assignment.tlt;

public class Q215_SumOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i += 2) {
            sum += i;
        }
        System.out.println("Sum of odd numbers between 1 and 50: " + sum);
    }
}

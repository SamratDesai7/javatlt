package org.assignment.tlt;

public class Q157_SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
    }
}

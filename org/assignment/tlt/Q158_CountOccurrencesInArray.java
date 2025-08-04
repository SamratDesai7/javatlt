package org.assignment.tlt;

public class Q158_CountOccurrencesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 1};
        int element = 1;
        int count = 0;

        for (int num : arr) {
            if (num == element) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);
    }
}

package org.assignment.tlt;

public class Q217_FindLargest {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 2, 9, 4 };
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }
        System.out.println("Largest number is: " + largest);
    }
}

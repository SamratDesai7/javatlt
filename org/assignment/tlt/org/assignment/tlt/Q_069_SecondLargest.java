package org.assignment.tlt;

public class Q_069_SecondLargest {

    public static void main(String[] args) {
        int[] arr = {10, 25, 5, 87, 65, 87, 32};
        System.out.println("Second largest element: " + findSecondLargest(arr));
    }

    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return second;
    }
}

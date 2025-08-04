package org.assignment.tlt;

public class Q_064_FindMajorityElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 2, 2, 5, 2};
        int result = findMajority(arr);
        System.out.println(result);
    }

    public static int findMajority(int[] arr) {
        int candidate = -1;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return 1;
        } else {
            return 0;
        }
    }
}

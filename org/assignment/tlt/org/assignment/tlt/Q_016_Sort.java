package org.assignment.tlt;

import java.util.Arrays;

class Q_016_Sort {

    int[] array;

    void acceptArray(int a[]) {
        array = a;
    }

    void sortArray() {
        Arrays.sort(array);
        System.out.print("Sorted array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q_016_Sort obj = new Q_016_Sort();
        int[] input = {5, 3, 8, 1, 2};
        obj.acceptArray(input);
        obj.sortArray();
    }
}

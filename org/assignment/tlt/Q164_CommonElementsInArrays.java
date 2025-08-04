package org.assignment.tlt;

import java.util.HashSet;

public class Q164_CommonElementsInArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 3, 4, 5, 6 };

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> common = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                common.add(num);
            }
        }

        for (int num : common) {
            System.out.print(num + " ");
        }
    }
}

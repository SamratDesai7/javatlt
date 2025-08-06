package org.assignment.tlt;

import java.util.LinkedHashSet;

public class Q160_RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 5, 5 };
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        int[] unique = new int[set.size()];
        int i = 0;
        for (int num : set) {
            unique[i++] = num;
        }

        for (int num : unique) {
            System.out.print(num + " ");
        }
    }
}

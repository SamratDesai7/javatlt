package org.assignment.tlt;

import java.util.Arrays;
import java.util.Collections;

public class Q_053_SeriesArraySort {

    public static void main(String[] args) {
        int[] series = new int[18];
        int even = 2;
        int oddPow = 6;

        for (int i = 0; i < series.length; i++) {
            if (i % 2 == 0) {
                series[i] = even;
                even += 2;
            } else {
                series[i] = (int) Math.pow(oddPow, 3);
                oddPow--;
            }
        }

        System.out.println("Original Series:");
        for (int num : series) {
            System.out.print(num + " ");
        }

        int[] ascending = series.clone();
        Arrays.sort(ascending);
        System.out.println("\n\nAscending Order:");
        for (int num : ascending) {
            System.out.print(num + " ");
        }

        Integer[] descending = Arrays.stream(series).boxed().toArray(Integer[]::new);
        Arrays.sort(descending, Collections.reverseOrder());
        System.out.println("\n\nDescending Order:");
        for (int num : descending) {
            System.out.print(num + " ");
        }
    }
}

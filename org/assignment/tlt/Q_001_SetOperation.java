package org.assignment.tlt;

import java.util.LinkedHashSet;
import java.util.Set;

public class Q_001_SetOperation {
    public void setOperation(int a[], int b[]) {
        Set<Integer> union = new LinkedHashSet<>();
        for (int num : a) {
            union.add(num);
        }
        for (int num : b) {
            union.add(num);
        }
        for (int num : union) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void setOperation(char a[], char b[]) {
        Set<Character> union = new LinkedHashSet<>();
        for (char ch : a) {
            union.add(ch);
        }
        for (char ch : b) {
            union.add(ch);
        }
        for (char ch : union) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q_001_SetOperation obj = new Q_001_SetOperation();
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};
        obj.setOperation(arr1, arr2);

        char[] ch1 = {'a', 'b', 'c'};
        char[] ch2 = {'b', 'c', 'd'};
        obj.setOperation(ch1, ch2);
    }
}

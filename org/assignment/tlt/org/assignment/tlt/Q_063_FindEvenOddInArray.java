package org.assignment.tlt;

public class Q_063_FindEvenOddInArray {

    public static void main(String[] args) {
        int[] arr = {3, 8, 5, 12, 7, 6, 9, 4};
        findEvenOdd(arr);
    }

    public static void findEvenOdd(int[] array) {
        System.out.print("Even numbers: ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }

        System.out.print("\nOdd numbers: ");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}

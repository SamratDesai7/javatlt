package org.assignment.tlt;

public class Q_068_FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 4, 9, 5, 2};
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        boolean[] visited = new boolean[arr.length];

        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                boolean isDuplicate = false;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        isDuplicate = true;
                        visited[j] = true;
                    }
                }
                if (isDuplicate) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

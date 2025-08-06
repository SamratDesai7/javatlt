package org.assignment.tlt;

public class Q168_MinSubarrayLength {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int s = 7;
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            while (sum >= s) {
                int currentLength = end - start + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                }
                sum -= arr[start];
                start++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println("Minimum Length: " + minLength);
        }
    }
}

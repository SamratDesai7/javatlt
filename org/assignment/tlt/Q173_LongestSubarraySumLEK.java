package org.assignment.tlt;

public class Q173_LongestSubarraySumLEK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 11;
        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            int windowLength = right - left + 1;
            if (windowLength > maxLength) {
                maxLength = windowLength;
            }
        }

        System.out.println("Length: " + maxLength);
    }
}

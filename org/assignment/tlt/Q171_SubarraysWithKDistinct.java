package org.assignment.tlt;

import java.util.HashMap;

public class Q171_SubarraysWithKDistinct {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3};
        int k = 2;

        int result = countSubarraysWithAtMostK(arr, k) - countSubarraysWithAtMostK(arr, k - 1);
        System.out.println("Count: " + result);
    }

    static int countSubarraysWithAtMostK(int[] arr, int k) {
        int left = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > k) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}

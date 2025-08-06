package org.assignment.tlt;

import java.util.HashMap;

public class Q172_CountSubarraysWithGivenSum {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 1 };
        int s = 3;
        int count = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int num : arr) {
            sum += num;
            if (map.containsKey(sum - s)) {
                count += map.get(sum - s);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Count: " + count);
    }
}

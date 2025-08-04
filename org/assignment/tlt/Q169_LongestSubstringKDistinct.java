package org.assignment.tlt;

import java.util.HashMap;

public class Q169_LongestSubstringKDistinct {
    public static void main(String[] args) {
        String str = "eceba";
        int k = 2;
        int maxLength = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.size() > k) {
                char leftChar = str.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
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

package org.assignment.tlt;

import java.util.HashSet;

public class Q166_LongestUniqueSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int maxLength = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < str.length(); right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            int windowLength = right - left + 1;
            if (windowLength > maxLength) {
                maxLength = windowLength;
            }
        }

        System.out.println("Length: " + maxLength);
    }
}

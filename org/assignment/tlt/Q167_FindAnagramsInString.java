package org.assignment.tlt;

import java.util.ArrayList;
import java.util.List;

public class Q167_FindAnagramsInString {
    public static void main(String[] args) {
        String str = "cbaebabacd";
        String pattern = "abc";
        List<Integer> result = new ArrayList<>();

        int[] patternFreq = new int[26];
        int[] windowFreq = new int[26];
        int k = pattern.length();

        for (int i = 0; i < k; i++) {
            patternFreq[pattern.charAt(i) - 'a']++;
            windowFreq[str.charAt(i) - 'a']++;
        }

        if (matches(patternFreq, windowFreq)) {
            result.add(0);
        }

        for (int i = k; i < str.length(); i++) {
            windowFreq[str.charAt(i) - 'a']++;
            windowFreq[str.charAt(i - k) - 'a']--;

            if (matches(patternFreq, windowFreq)) {
                result.add(i - k + 1);
            }
        }

        System.out.println(result);
    }

    static boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}

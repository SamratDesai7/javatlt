package org.assignment.tlt;

import java.util.HashMap;

public class Q268_Equal012Substring {
    public static void main(String[] args) {
        String str = "102100211";
        System.out.println("Output: " + countEqual012Substrings(str));
    }

    static int countEqual012Substrings(String str) {
        int count0 = 0, count1 = 0, count2 = 0;
        int result = 0;

        // Key: diff between count0 - count1 and count0 - count2
        HashMap<String, Integer> map = new HashMap<>();
        map.put("0#0", 1); // base condition

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '0') count0++;
            else if (ch == '1') count1++;
            else if (ch == '2') count2++;

            String key = (count0 - count1) + "#" + (count0 - count2);
            result += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return result;
    }
}

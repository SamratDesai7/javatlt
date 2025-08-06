package org.assignment.tlt;

import java.util.HashMap;
import java.util.Scanner;

public class Q264_Equal012Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int count0 = 0, count1 = 0, count2 = 0;
        int result = 0;

        // Map to store difference pair (count1 - count0, count2 - count1)
        HashMap<String, Integer> map = new HashMap<>();
        map.put("0#0", 1); // base case

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '0') count0++;
            else if (ch == '1') count1++;
            else if (ch == '2') count2++;

            String key = (count1 - count0) + "#" + (count2 - count1);

            result += map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        System.out.println(result);
    }
}

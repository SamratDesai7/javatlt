package org.assignment.tlt;

public class Q_106_StringManipulator {

    public void manipulate(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string: " + reversed);
    }

    public void manipulate(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        System.out.println("Character '" + ch + "' occurs " + count + " times in \"" + str + "\".");
    }

    public void manipulate(String str1, String str2) {
        String result = str1 + str2;
        System.out.println("Concatenated string: " + result);
    }

    public static void main(String[] args) {
        Q_106_StringManipulator sm = new Q_106_StringManipulator();
        sm.manipulate("Hello");
        sm.manipulate("Programming", 'g');
        sm.manipulate("Java", "Developer");
    }
}

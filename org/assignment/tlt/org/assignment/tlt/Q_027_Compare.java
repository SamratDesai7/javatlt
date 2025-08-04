package org.assignment.tlt;

class Q_027_Compare {

    private int[] intArray1;
    private int[] intArray2;

    private char[] charArray1;
    private char[] charArray2;

    public Q_027_Compare(int[] a, int[] b) {
        this.intArray1 = a;
        this.intArray2 = b;
    }

    public Q_027_Compare(char[] a, char[] b) {
        this.charArray1 = a;
        this.charArray2 = b;
    }

    public boolean isIntegerArrayEqual() {
        if (intArray1.length != intArray2.length) return false;
        for (int i = 0; i < intArray1.length; i++) {
            if (intArray1[i] != intArray2[i]) return false;
        }
        return true;
    }

    public boolean isCharArrayEqual() {
        if (charArray1.length != charArray2.length) return false;
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 2, 3, 4};

        Q_027_Compare compareInt = new Q_027_Compare(a1, a2);
        if (compareInt.isIntegerArrayEqual()) {
            System.out.println("Integer arrays are equal");
        } else {
            System.out.println("Integer arrays are not equal");
        }

        char[] c1 = {'a', 'b', 'c'};
        char[] c2 = {'a', 'b', 'c'};

        Q_027_Compare compareChar = new Q_027_Compare(c1, c2);
        if (compareChar.isCharArrayEqual()) {
            System.out.println("Character arrays are equal");
        } else {
            System.out.println("Character arrays are not equal");
        }
    }
}

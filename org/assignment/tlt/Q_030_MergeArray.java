package org.assignment.tlt;

class Q_030_MergeArray {
    private int[] intA, intB;
    private char[] charA, charB;
    private boolean isInt;

    public Q_030_MergeArray(int[] a, int[] b) {
        this.intA = a;
        this.intB = b;
        this.isInt = true;
    }

    public Q_030_MergeArray(char[] ch1, char[] ch2) {
        this.charA = ch1;
        this.charB = ch2;
        this.isInt = false;
    }

    public int[] getIntMergeArray() {
        if (!isInt) return null;
        int[] result = new int[intA.length + intB.length];
        System.arraycopy(intA, 0, result, 0, intA.length);
        System.arraycopy(intB, 0, result, intA.length, intB.length);
        return result;
    }

    public char[] getCharMergeArray() {
        if (isInt) return null;
        char[] result = new char[charA.length + charB.length];
        System.arraycopy(charA, 0, result, 0, charA.length);
        System.arraycopy(charB, 0, result, charA.length, charB.length);
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5};
        Q_030_MergeArray intMerge = new Q_030_MergeArray(a, b);
        int[] resultInt = intMerge.getIntMergeArray();

        System.out.print("Merged Integer Array: ");
        for (int i : resultInt) {
            System.out.print(i + " ");
        }

        System.out.println();

        char[] x = {'A', 'B'};
        char[] y = {'C', 'D', 'E'};
        Q_030_MergeArray charMerge = new Q_030_MergeArray(x, y);
        char[] resultChar = charMerge.getCharMergeArray();

        System.out.print("Merged Character Array: ");
        for (char c : resultChar) {
            System.out.print(c + " ");
        }
    }
}

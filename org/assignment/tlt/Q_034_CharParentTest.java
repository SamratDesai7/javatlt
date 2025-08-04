package org.assignment.tlt;

class CharParent {
    protected char[] ch;

    public void setCharArray(char[] ch) {
        this.ch = ch;
    }

    public int[] getResult() {
        return null;
    }
}

class Reverse extends CharParent {
    @Override
    public int[] getResult() {
        int[] reversed = new int[ch.length];
        for (int i = 0; i < ch.length; i++) {
            reversed[i] = ch[ch.length - 1 - i];  
        }
        return reversed;
    }
}

class ExtractDigitSum extends CharParent {
    @Override
    public int[] getResult() {
        int sum = 0;
        for (char c : ch) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        return new int[]{sum};
    }
}

public class Q_034_CharParentTest {
    public static void main(String[] args) {
        CharParent cp;

        cp = new Reverse();
        cp.setCharArray(new char[]{'A', 'B', '3', 'C'});
        int[] reversed = cp.getResult();
        System.out.print("Reversed ASCII Values: ");
        for (int val : reversed) {
            System.out.print(val + " ");
        }
        System.out.println();


        cp = new ExtractDigitSum();
        cp.setCharArray(new char[]{'1', 'a', '3', 'B', '2'});
        int[] digitSum = cp.getResult();
        System.out.println("Sum of Digits: " + digitSum[0]);
    }
}

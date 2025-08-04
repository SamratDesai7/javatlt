package org.assignment.tlt;

abstract class CharParent {
    char[] ch;

    void setChar(char[] ch) {
        this.ch = ch;
    }

    abstract char[] getResult();
}

class ToUpper extends CharParent {
    @Override
    char[] getResult() {
        char[] res = new char[ch.length];
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLowerCase(ch[i])) {
                res[i] = Character.toUpperCase(ch[i]);
            } else {
                res[i] = ch[i];
            }
        }
        return res;
    }
}

class Reverse extends CharParent {
    @Override
    char[] getResult() {
        char[] res = new char[ch.length];
        for (int i = 0, j = ch.length - 1; i < ch.length; i++, j--) {
            res[i] = ch[j];
        }
        return res;
    }
}

class CharHelper {
    void performCharOperation(CharParent p) {
        char[] result = p.getResult();
        System.out.print("Result: ");
        for (char c : result) {
            System.out.print(c);
        }
        System.out.println();
    }
}

public class Q_038_TestLooseCouplingCharArrApp {
    public static void main(String[] args) {
        CharHelper helper = new CharHelper();

        CharParent upper = new ToUpper();
        upper.setChar(new char[]{'h', 'e', 'l', 'l', 'o'});
        helper.performCharOperation(upper);

        CharParent reverse = new Reverse();
        reverse.setChar(new char[]{'h', 'e', 'l', 'l', 'o'});
        helper.performCharOperation(reverse);
    }
}

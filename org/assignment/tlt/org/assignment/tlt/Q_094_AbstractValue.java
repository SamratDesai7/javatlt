package org.assignment.tlt;

abstract class Value {
    int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    abstract int getResult();
}

class Power extends Value {
    @Override
    int getResult() {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }
}

class SearchDigit extends Value {
    @Override
    int getResult() {
        int num = a;
        int digit = b;

        while (num > 0) {
            int rem = num % 10;
            if (rem == digit) {
                return digit;
            }
            num /= 10;
        }
        return -1;
    }
}

public class Q_094_AbstractValue {
    public static void main(String[] args) {
        Power power = new Power();
        power.setValue(2, 5);
        System.out.println("Power Result: " + power.getResult());

        SearchDigit search = new SearchDigit();
        search.setValue(12345, 3);
        System.out.println("Search Digit Result: " + search.getResult());

        search.setValue(98765, 1);
        System.out.println("Search Digit Result: " + search.getResult());
    }
}

package org.assignment.tlt;

abstract class Val {
    int result;
    int val;

    void setValue(int val) {
        this.val = val;
    }

    abstract int getResult();
}

class SumOfDigit extends Val {
    @Override
    int getResult() {
        int sum = 0, n = val;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

class Factorial extends Val {
    @Override
    int getResult() {
        int fact = 1;
        for (int i = 1; i <= val; i++) {
            fact *= i;
        }
        return fact;
    }
}

class NumOperate {
    void generateResult(Val v) {
        System.out.println("Result: " + v.getResult());
    }
}

public class Q_037_NumLooseCouplingApp {
    public static void main(String[] args) {
        NumOperate op = new NumOperate();

        Val fact = new Factorial();
        fact.setValue(5);
        op.generateResult(fact);

        Val sum = new SumOfDigit();
        sum.setValue(1234);
        op.generateResult(sum);
    }
}

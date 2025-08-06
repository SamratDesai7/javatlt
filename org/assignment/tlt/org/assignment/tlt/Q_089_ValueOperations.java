package org.assignment.tlt;

class Value {
    int a, b;

    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
}

class Add extends Value {
    int getAdd() {
        return a + b;
    }
}

class Mul extends Value {
    int getMul() {
        return a * b;
    }
}

class Div extends Value {
    int getDiv() {
        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }
}

public class Q_089_ValueOperations {
    public static void main(String[] args) {
        Add add = new Add();
        add.setValue(20, 10);
        System.out.println("Addition: " + add.getAdd());

        Mul mul = new Mul();
        mul.setValue(20, 10);
        System.out.println("Multiplication: " + mul.getMul());

        Div div = new Div();
        div.setValue(20, 10);
        System.out.println("Division: " + div.getDiv());
    }
}

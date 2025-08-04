package org.assignment.tlt;

public class Q175_Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Q175_Stack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Q175_Stack s = new Q175_Stack(5);

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Top element: " + s.peek());
        System.out.println("Size: " + s.size());

        System.out.println("Popped: " + s.pop());
        System.out.println("Top element after pop: " + s.peek());
        System.out.println("Is stack empty? " + s.isEmpty());
    }
}

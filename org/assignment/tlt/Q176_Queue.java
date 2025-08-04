package org.assignment.tlt;

public class Q176_Queue {
    private int[] queue;
    private int front, rear, size, capacity;

    public Q176_Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Q176_Queue q = new Q176_Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        System.out.println("Front: " + q.peek()); // Output: 10
        System.out.println("Dequeue: " + q.dequeue()); // Output: 10
        System.out.println("Front after dequeue: " + q.peek()); // Output: 20
        System.out.println("Is queue full? " + q.isFull()); // Output: true
        System.out.println("Is queue empty? " + q.isEmpty()); // Output: false
    }
}

package org.assignment.tlt;

public class Q179_CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Q179_CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean enqueue(int item) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        return true;
    }

    public Integer dequeue() {
        if (isEmpty()) {
            return null;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public Integer peek() {
        if (isEmpty()) {
            return null;
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
        Q179_CircularQueue cq = new Q179_CircularQueue(5);

        System.out.println(cq.enqueue(10)); // true
        System.out.println(cq.enqueue(20)); // true
        System.out.println(cq.enqueue(30)); // true
        System.out.println(cq.enqueue(40)); // true
        System.out.println(cq.enqueue(50)); // true
        System.out.println(cq.enqueue(60)); // false (full)

        System.out.println("Front item: " + cq.peek()); // 10

        System.out.println(cq.dequeue()); // 10
        System.out.println(cq.dequeue()); // 20

        System.out.println(cq.enqueue(60)); // true
        System.out.println(cq.enqueue(70)); // true
        System.out.println(cq.isFull());    // true
    }
}

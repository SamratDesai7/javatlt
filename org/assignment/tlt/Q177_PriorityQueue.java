package org.assignment.tlt;

class Node {
    int data;
    int priority;
    Node next;

    Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}

public class Q177_PriorityQueue {
    private Node head;

    public void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);

        if (head == null || priority > head.priority) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null && current.next.priority >= priority) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Priority Queue Underflow");
            return -1;
        }
        int item = head.data;
        head = head.next;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Priority Queue is Empty");
            return -1;
        }
        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println("Value: " + current.data + " | Priority: " + current.priority);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Q177_PriorityQueue pq = new Q177_PriorityQueue();

        pq.enqueue(10, 2);
        pq.enqueue(30, 4);
        pq.enqueue(20, 3);
        pq.enqueue(40, 5);

        System.out.println("Peek: " + pq.peek());      // 40
        System.out.println("Dequeue: " + pq.dequeue()); // 40
        System.out.println("Peek after dequeue: " + pq.peek()); // 30
        System.out.println("Priority Queue:");
        pq.display();
    }
}

package org.assignment.tlt;

class ValuePrinter extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Value: " + i);
            try {
                Thread.sleep(10000); // Sleep for 10,000 milliseconds (10 seconds)
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class Q270_ThreadSleepExample {
    public static void main(String[] args) {
        ValuePrinter t = new ValuePrinter();
        t.start();
    }
}

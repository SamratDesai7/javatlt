package org.assignment.tlt;

class DemoThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(getName() + " - Count: " + i);
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
    }
}

public class Q271_ThreadMethodsDemo {
    public static void main(String[] args) {
        DemoThread t1 = new DemoThread();
        DemoThread t2 = new DemoThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        try {
            System.out.println("Main thread waiting for t1 to finish using join().");
            t1.join(); // Wait for t1 to finish
            System.out.println("Is t1 alive? " + t1.isAlive());
            System.out.println("Main thread now continues after t1.");

            // Optional: stop t2 (Not recommended in practice — deprecated)
            // System.out.println("Stopping t2");
            // t2.stop();

            System.out.println("Is t2 alive? " + t2.isAlive());

            t2.join(); // Wait for t2 to finish
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread ends.");
    }
}

package org.assignment.tlt;
class Printer {
   
    synchronized void printSync(String msg) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(msg + " (Sync) - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }

   
    void printAsync(String msg) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(msg + " (Async) - " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}
class SyncThread extends Thread {
    Printer p;
    String message;

    SyncThread(Printer p, String message) {
        this.p = p;
        this.message = message;
    }

    public void run() {
        p.printSync(message);
    }
}

class AsyncThread extends Thread {
    Printer p;
    String message;

    AsyncThread(Printer p, String message) {
        this.p = p;
        this.message = message;
    }

    public void run() {
        p.printAsync(message);
    }
}

// Main Class
public class Q272_SyncVsAsyncDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();

        System.out.println("=== Asynchronous Execution ===");
        AsyncThread a1 = new AsyncThread(printer, "Thread-A");
        AsyncThread a2 = new AsyncThread(printer, "Thread-B");
        a1.start();
        a2.start();

        try {
            a1.join();
            a2.join();
        } catch (InterruptedException e) {}

        System.out.println("\n=== Synchronous Execution ===");
        SyncThread s1 = new SyncThread(printer, "Thread-C");
        SyncThread s2 = new SyncThread(printer, "Thread-D");
        s1.start();
        s2.start();
    }
}

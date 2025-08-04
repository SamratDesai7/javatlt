package org.assignment.tlt;

class SharedResource {
    private boolean available = false;
    public synchronized void produce() {
        System.out.println("Producer is producing...");
        available = true;
        try {
            Thread.sleep(1000);
            System.out.println("Producer finished. Notifying one thread...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify(); 
    }

  
    public synchronized void consume(String consumerName) {
        while (!available) {
            try {
                System.out.println(consumerName + " is waiting for resource...");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(consumerName + " consumed the resource.");
        available = false;
    }
}


class ProducerThread extends Thread {
    SharedResource resource;

    ProducerThread(SharedResource r) {
        this.resource = r;
    }

    public void run() {
        resource.produce();
    }
}

class ConsumerThread extends Thread {
    SharedResource resource;
    String name;

    ConsumerThread(SharedResource r, String name) {
        this.resource = r;
        this.name = name;
    }

    public void run() {
        resource.consume(name);
    }
}

public class Q273_WaitNotifyDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        ConsumerThread c1 = new ConsumerThread(resource, "Consumer-1");
        ConsumerThread c2 = new ConsumerThread(resource, "Consumer-2");

        c1.start();
        c2.start();

        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ProducerThread p = new ProducerThread(resource);
        p.start();
    }
}

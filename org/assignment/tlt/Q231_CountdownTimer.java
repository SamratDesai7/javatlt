package org.assignment.tlt;

public class Q231_CountdownTimer {
    public static void main(String[] args) {
        int count = 10;

        while (count >= 0) {
            System.out.println(count);
            count--;

            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Time's up!");
    }
}

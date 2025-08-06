package org.assignment.tlt;

public class Q_086_LightBulb {
    boolean state;

    Q_086_LightBulb() {
        state = false;
    }

    void turnOn() {
        state = true;
        System.out.println("LightBulb is ON");
    }

    void turnOff() {
        state = false;
        System.out.println("LightBulb is OFF");
    }

    public static void main(String[] args) {
        Q_086_LightBulb bulb = new Q_086_LightBulb();
        bulb.turnOn();
        bulb.turnOff();
        bulb.turnOn();
    }
}

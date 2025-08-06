package org.assignment.tlt;

public class Q_085_Car {
    int speed;
    int fuel;

    Q_085_Car() {
        speed = 60;
        fuel = 50;
    }

    void drive() {
        if (fuel >= 10) {
            fuel -= 10;
            System.out.println("Car drove. Remaining fuel: " + fuel);
        } else {
            System.out.println("Not enough fuel to drive.");
        }
    }

    public static void main(String[] args) {
        Q_085_Car car = new Q_085_Car();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
        car.drive();
    }
}

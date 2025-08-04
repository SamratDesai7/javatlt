package org.assignment.tlt;

class Vehicle {
    protected int speed;
    protected int fuelCapacity;

    public Vehicle(int speed, int fuelCapacity) {
        this.speed = speed;
        this.fuelCapacity = fuelCapacity;
    }

    public double calculateFuelEfficiency() {
        return speed * 0.1;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(int speed, int fuelCapacity, int numberOfDoors) {
        super(speed, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateFuelEfficiency() {
        return (speed * 0.1) - (numberOfDoors * 0.5);
    }

    public void showDetails() {
        System.out.println("Speed: " + speed);
        System.out.println("Fuel Capacity: " + fuelCapacity);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Fuel Efficiency: " + calculateFuelEfficiency());
    }
}

public class Q_107_VehicleCarHierarchy {
    public static void main(String[] args) {
        Car car = new Car(120, 50, 4);
        car.showDetails();
    }
}

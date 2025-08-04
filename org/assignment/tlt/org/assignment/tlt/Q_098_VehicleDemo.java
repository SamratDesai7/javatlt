package org.assignment.tlt;

abstract class Vehicle {
    String start() {
        return "Vehicle started.";
    }

    String stop() {
        return "Vehicle stopped.";
    }

    abstract int fuelEfficiency(); // in km/l
}

class Car extends Vehicle {
    @Override
    int fuelEfficiency() {
        return 15;
    }
}

class Bike extends Vehicle {
    @Override
    int fuelEfficiency() {
        return 30;
    }
}

public class Q_098_VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("Car: " + car.start());
        System.out.println("Car Fuel Efficiency: " + car.fuelEfficiency() + " km/l");
        System.out.println("Car: " + car.stop());

        System.out.println();

        System.out.println("Bike: " + bike.start());
        System.out.println("Bike Fuel Efficiency: " + bike.fuelEfficiency() + " km/l");
        System.out.println("Bike: " + bike.stop());
    }
}

package org.assignment.tlt;

public class Q_104_VolumeCalculator {

    public int calculateVolume(int side) {
        return side * side * side;
    }

    public double calculateVolume(int radius, int height) {
        return Math.PI * radius * radius * height;
    }

    public int calculateVolume(int length, int breadth, int height) {
        return length * breadth * height;
    }

    public static void main(String[] args) {
        Q_104_VolumeCalculator vc = new Q_104_VolumeCalculator();

        int cubeVolume = vc.calculateVolume(4);
        double cylinderVolume = vc.calculateVolume(3, 7);
        int cuboidVolume = vc.calculateVolume(5, 3, 2);

        System.out.println("Cube Volume: " + cubeVolume);
        System.out.println("Cylinder Volume: " + cylinderVolume);
        System.out.println("Cuboid Volume: " + cuboidVolume);
    }
}

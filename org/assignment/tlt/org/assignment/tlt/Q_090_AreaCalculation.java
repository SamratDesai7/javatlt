package org.assignment.tlt;

class Area {
    float radius;
    int length, width;

    void setRadius(float radius) {
        this.radius = radius;
    }

    void setLengthWidth(int len, int wid) {
        this.length = len;
        this.width = wid;
    }
}

class Circle extends Area {
    float getCircleArea() {
        return 3.1416f * radius * radius;
    }
}

class Rectangle extends Area {
    int getRectArea() {
        return length * width;
    }
}

public class Q_090_AreaCalculation {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(7);
        System.out.println("Area of Circle: " + circle.getCircleArea());

        Rectangle rectangle = new Rectangle();
        rectangle.setLengthWidth(10, 5);
        System.out.println("Area of Rectangle: " + rectangle.getRectArea());
    }
}

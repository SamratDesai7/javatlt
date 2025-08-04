package org.assignment.tlt;

interface Student {
    default void study() {
        System.out.println("Studying");
    }
}

class UndergraduateStudent implements Student {
    public void study() {
        System.out.println("Undergraduate student is studying");
    }
}

public class Q_119_InterfaceStudent {
    public static void main(String[] args) {
        Student s = new UndergraduateStudent();
        s.study();
    }
}

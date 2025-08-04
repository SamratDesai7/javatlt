package org.assignment.tlt;

interface ScholarshipEligible {
}

class GraduateStudent implements ScholarshipEligible {
    String name;

    public GraduateStudent(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Graduate Student: " + name);
    }
}

public class Q_126_MarkerInterface {
    public static void main(String[] args) {
        GraduateStudent student = new GraduateStudent("Prajwal");

        if (student instanceof ScholarshipEligible) {
            System.out.println(student.name + " is eligible for scholarship.");
        } else {
            System.out.println(student.name + " is not eligible for scholarship.");
        }
    }
}

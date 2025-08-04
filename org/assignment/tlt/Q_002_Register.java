package org.assignment.tlt;

class Q_002_Register {

    static void register(String studName, int age, String schoolName, int fees) {
        System.out.println("Student Registration:");
        System.out.println("Name: " + studName);
        System.out.println("Age: " + age);
        System.out.println("School: " + schoolName);
        System.out.println("Fees: " + fees);
        System.out.println();
    }

    static void register(String voterName, int age, String wardName) {
        System.out.println("Voter Registration:");
        System.out.println("Name: " + voterName);
        System.out.println("Age: " + age);
        System.out.println("Ward: " + wardName);
        System.out.println();
    }

    public static void main(String[] args) {
        register("Rohit", 15, "City High School", 3000);
        register("Sita", 34, "Ward No. 7");
    }
}

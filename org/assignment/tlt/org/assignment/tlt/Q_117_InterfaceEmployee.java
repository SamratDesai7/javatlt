package org.assignment.tlt;


interface Employee {
    int getId();
    String getName();
}


class FullTimeEmployee implements Employee {
    private int id;
    private String name;

    public FullTimeEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public int getId() {
        return id;
    }

   
    public String getName() {
        return name;
    }
}

public class Q_117_InterfaceEmployee {
    public static void main(String[] args) {
        FullTimeEmployee emp = new FullTimeEmployee(101, "Prajwal");
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
    }
}

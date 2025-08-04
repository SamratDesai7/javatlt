package org.assignment.tlt;

import java.util.ArrayList;
import java.util.List;

class Staff {
    int staffID;
    String name;
    String role;
    double salary;

    Staff(int staffID, String name, String role, double salary) {
        this.staffID = staffID;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }
}

class HotelManagement {
    List<Staff> staffList = new ArrayList<>();

    void addStaff(Staff staff) {
        staffList.add(staff);
    }

    double calculateTotalSalary() {
        double total = 0;
        for (Staff s : staffList) {
            total += s.salary;
        }
        return total;
    }

    List<Staff> getStaffByRole(String role) {
        List<Staff> result = new ArrayList<>();
        for (Staff s : staffList) {
            if (s.role.equalsIgnoreCase(role)) {
                result.add(s);
            }
        }
        return result;
    }
}

public class Q_075_HotelStaffManagement {
    public static void main(String[] args) {
        HotelManagement hm = new HotelManagement();

        hm.addStaff(new Staff(101, "Alice", "Manager", 50000));
        hm.addStaff(new Staff(102, "Bob", "Housekeeper", 25000));
        hm.addStaff(new Staff(103, "Charlie", "Manager", 52000));
        hm.addStaff(new Staff(104, "David", "Chef", 30000));

        System.out.println("Total Salary: " + hm.calculateTotalSalary());

        System.out.println("\nStaff in role 'Manager':");
        List<Staff> managers = hm.getStaffByRole("Manager");
        for (Staff s : managers) {
            System.out.println(s.staffID + " - " + s.name);
        }
    }
}


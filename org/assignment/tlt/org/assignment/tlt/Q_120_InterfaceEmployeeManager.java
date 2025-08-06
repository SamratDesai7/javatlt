package org.assignment.tlt;

interface Employee {
    int getId();
}

interface Manager extends Employee {
    int getTeamSize();
}

class ProjectManager implements Manager {
    private int id;
    private int teamSize;

    public ProjectManager(int id, int teamSize) {
        this.id = id;
        this.teamSize = teamSize;
    }

    public int getId() {
        return id;
    }

    public int getTeamSize() {
        return teamSize;
    }
}

public class Q_120_InterfaceEmployeeManager {
    public static void main(String[] args) {
        ProjectManager pm = new ProjectManager(101, 8);
        System.out.println("ID: " + pm.getId());
        System.out.println("Team Size: " + pm.getTeamSize());
    }
}

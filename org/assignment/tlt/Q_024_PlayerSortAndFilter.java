package org.assignment.tlt;

import java.util.*;

class Q_024_Player {
    private int id;
    private String name;
    private int age;
    private int run;

    public Q_024_Player(int id, String name, int age, int run) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.run = run;
    }

    public int getRun() { return run; }
    public int getAge() { return age; }
    public String getName() { return name; }

    public void show() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Run: " + run);
    }
}

public class Q_024_PlayerSortAndFilter {
    public static void main(String[] args) {
        Q_024_Player[] players = new Q_024_Player[6];

        players[0] = new Q_024_Player(1, "Rohit", 26, 980);
        players[1] = new Q_024_Player(2, "Virat", 24, 1200);
        players[2] = new Q_024_Player(3, "Rahul", 22, 1300);
        players[3] = new Q_024_Player(4, "Shikhar", 28, 800);
        players[4] = new Q_024_Player(5, "Hardik", 25, 1400);
        players[5] = new Q_024_Player(6, "Surya", 23, 700);

        Arrays.sort(players, (p1, p2) -> p2.getRun() - p1.getRun());

        System.out.println("Players sorted by runs (Descending):");
        for (Q_024_Player p : players) {
            p.show();
        }

        System.out.println("\nPlayers with runs > 1000 and age <= 25:");
        for (Q_024_Player p : players) {
            if (p.getRun() > 1000 && p.getAge() <= 25) {
                p.show();
            }
        }
    }
}

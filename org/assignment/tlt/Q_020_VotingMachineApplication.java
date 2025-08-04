package org.assignment.tlt;

import java.util.ArrayList;
import java.util.List;

class Q_020_Voter {
    private int id;
    private String name;
    private int age;

    public Q_020_Voter(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

class Q_020_VotingMachine {
    List<Q_020_Voter> validVoters = new ArrayList<>();
    List<Q_020_Voter> invalidVoters = new ArrayList<>();

    void verifyVoter(Q_020_Voter... voters) {
        for (Q_020_Voter v : voters) {
            if (v.getAge() >= 18) validVoters.add(v);
            else invalidVoters.add(v);
        }
    }

    void showValidVote() {
        System.out.println("Valid Voters:");
        for (Q_020_Voter v : validVoters) System.out.println(v);
    }

    void showInvalidVote() {
        System.out.println("Invalid Voters:");
        for (Q_020_Voter v : invalidVoters) System.out.println(v);
    }
}

public class Q_020_VotingMachineApplication {
    public static void main(String[] args) {
        Q_020_Voter v1 = new Q_020_Voter(1, "Amit", 25);
        Q_020_Voter v2 = new Q_020_Voter(2, "Rina", 17);
        Q_020_Voter v3 = new Q_020_Voter(3, "Raj", 30);
        Q_020_Voter v4 = new Q_020_Voter(4, "Tina", 15);

        Q_020_VotingMachine machine = new Q_020_VotingMachine();
        machine.verifyVoter(v1, v2, v3, v4);

        machine.showValidVote();
        machine.showInvalidVote();
    }
}

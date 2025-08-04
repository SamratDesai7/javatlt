package org.assignment.tlt;

import java.util.*;

class Player {
    int playerId;
    String playerName;
    int runs;

    Player(int id, String name) {
        this.playerId = id;
        this.playerName = name;
        this.runs = 0;
    }
}

class Team {
    int teamId;
    String teamName;
    Player[] players = new Player[11];
    int playerCount = 0;

    Team(int id, String name) {
        this.teamId = id;
        this.teamName = name;
    }

    void addPlayer(Player p) {
        if (playerCount < 11) {
            players[playerCount++] = p;
        } else {
            System.out.println("Team already has 11 players.");
        }
    }
}

class Match {
    int matchId;
    Team team1, team2;
    int oversTeam1, oversTeam2;

    Match(int id) {
        this.matchId = id;
    }
}

public class Q187_TournamentApp {
    static Scanner sc = new Scanner(System.in);
    static Team[] teams = new Team[10];
    static Match[] matches = new Match[5];
    static int teamCount = 0, matchCount = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n--- Tournament Menu ---");
            System.out.println("1. Add New Teams");
            System.out.println("2. Add Players in Team");
            System.out.println("3. Create Match");
            System.out.println("4. Allocate Teams to Match");
            System.out.println("5. View All Teams");
            System.out.println("6. Show Team-wise Player List");
            System.out.println("7. Show Player-wise Runs");
            System.out.println("8. Team-wise Player Run Aggregate");
            System.out.println("9. Decide Winner");
            System.out.println("10. Show Overs Played by Teams");
            System.out.println("11. Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1 -> addTeam();
                case 2 -> addPlayers();
                case 3 -> createMatch();
                case 4 -> allocateMatchTeams();
                case 5 -> viewTeams();
                case 6 -> showTeamWisePlayers();
                case 7 -> showPlayerRuns();
                case 8 -> showTeamAggregateRuns();
                case 9 -> decideWinner();
                case 10 -> showOversPlayed();
                case 11 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    static void addTeam() {
        if (teamCount < teams.length) {
            System.out.print("Enter Team ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Team Name: ");
            String name = sc.nextLine();
            teams[teamCount++] = new Team(id, name);
        } else {
            System.out.println("Max team limit reached.");
        }
    }

    static void addPlayers() {
        System.out.print("Enter Team ID to add players: ");
        int id = sc.nextInt();
        Team team = findTeamById(id);
        if (team != null) {
            System.out.print("How many players to add (max 11): ");
            int n = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.print("Enter Player ID: ");
                int pid = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Player Name: ");
                String pname = sc.nextLine();
                team.addPlayer(new Player(pid, pname));
            }
        } else {
            System.out.println("Team not found.");
        }
    }

    static void createMatch() {
        if (matchCount < matches.length) {
            System.out.print("Enter Match ID: ");
            int mid = sc.nextInt();
            matches[matchCount++] = new Match(mid);
        } else {
            System.out.println("Max match limit reached.");
        }
    }

    static void allocateMatchTeams() {
        System.out.print("Enter Match ID: ");
        int mid = sc.nextInt();
        Match m = findMatchById(mid);
        if (m != null) {
            System.out.print("Enter Team1 ID: ");
            int t1 = sc.nextInt();
            System.out.print("Enter Team2 ID: ");
            int t2 = sc.nextInt();
            m.team1 = findTeamById(t1);
            m.team2 = findTeamById(t2);
            if (m.team1 == null || m.team2 == null) {
                System.out.println("Invalid team IDs.");
            } else {
                System.out.print("Enter overs played by Team1: ");
                m.oversTeam1 = sc.nextInt();
                System.out.print("Enter overs played by Team2: ");
                m.oversTeam2 = sc.nextInt();
                assignRandomRuns(m.team1);
                assignRandomRuns(m.team2);
            }
        } else {
            System.out.println("Match not found.");
        }
    }

    static void viewTeams() {
        for (Team t : teams) {
            if (t != null)
                System.out.println("Team ID: " + t.teamId + ", Name: " + t.teamName);
        }
    }

    static void showTeamWisePlayers() {
        for (Team t : teams) {
            if (t != null) {
                System.out.println("\nTeam: " + t.teamName);
                for (Player p : t.players) {
                    if (p != null)
                        System.out.println("ID: " + p.playerId + ", Name: " + p.playerName);
                }
            }
        }
    }

    static void showPlayerRuns() {
        for (Team t : teams) {
            if (t != null) {
                for (Player p : t.players) {
                    if (p != null)
                        System.out.println(p.playerName + " -> " + p.runs + " runs");
                }
            }
        }
    }

    static void showTeamAggregateRuns() {
        for (Team t : teams) {
            if (t != null) {
                int total = 0;
                for (Player p : t.players) {
                    if (p != null)
                        total += p.runs;
                }
                System.out.println("Team " + t.teamName + " Total Runs: " + total);
            }
        }
    }

    static void decideWinner() {
        for (Match m : matches) {
            if (m != null && m.team1 != null && m.team2 != null) {
                int r1 = teamTotalRuns(m.team1);
                int r2 = teamTotalRuns(m.team2);
                System.out.println("\nMatch ID: " + m.matchId);
                if (r1 > r2)
                    System.out.println("Winner: " + m.team1.teamName);
                else if (r2 > r1)
                    System.out.println("Winner: " + m.team2.teamName);
                else
                    System.out.println("Match Draw!");
            }
        }
    }

    static void showOversPlayed() {
        for (Match m : matches) {
            if (m != null && m.team1 != null && m.team2 != null) {
                System.out.println("\nMatch ID: " + m.matchId);
                System.out.println(m.team1.teamName + " played " + m.oversTeam1 + " overs");
                System.out.println(m.team2.teamName + " played " + m.oversTeam2 + " overs");
            }
        }
    }

    // Helpers
    static Team findTeamById(int id) {
        for (Team t : teams) {
            if (t != null && t.teamId == id)
                return t;
        }
        return null;
    }

    static Match findMatchById(int id) {
        for (Match m : matches) {
            if (m != null && m.matchId == id)
                return m;
        }
        return null;
    }

    static void assignRandomRuns(Team team) {
        Random rand = new Random();
        for (Player p : team.players) {
            if (p != null)
                p.runs = rand.nextInt(100);
        }
    }

    static int teamTotalRuns(Team team) {
        int total = 0;
        for (Player p : team.players) {
            if (p != null)
                total += p.runs;
        }
        return total;
    }
}

package org.assignment.tlt;

class Library {
    String libraryName;
    String location;
    int totalBooks;
    double areaInSqFt;

    public Library(String libraryName, String location, int totalBooks, double areaInSqFt) {
        this.libraryName = libraryName;
        this.location = location;
        this.totalBooks = totalBooks;
        this.areaInSqFt = areaInSqFt;
    }

    public double calculateBookDensity() {
        return totalBooks / areaInSqFt;
    }

    public void displayInfo() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Location    : " + location);
        System.out.println("Books/SqFt  : " + calculateBookDensity());
    }
}

class DigitalLibrary extends Library {
    String website;
    int numOfEBooks;
    int totalUsers;

    public DigitalLibrary(String libraryName, String location, int totalBooks, double areaInSqFt,
                          String website, int numOfEBooks, int totalUsers) {
        super(libraryName, location, totalBooks, areaInSqFt);
        this.website = website;
        this.numOfEBooks = numOfEBooks;
        this.totalUsers = totalUsers;
    }

    @Override
    public double calculateBookDensity() {
        return (double) numOfEBooks / totalUsers;
    }

    @Override
    public void displayInfo() {
        System.out.println("Digital Library: " + libraryName);
        System.out.println("Location       : " + location);
        System.out.println("Website        : " + website);
        System.out.println("EBooks/User    : " + calculateBookDensity());
    }
}

public class Q_112_LibraryDigitalLibrary {
    public static void main(String[] args) {
        DigitalLibrary dl = new DigitalLibrary("SmartReads", "Mumbai", 10000, 2000.0,
                "https://smartreads.in", 5000, 250);
        dl.displayInfo();
    }
}

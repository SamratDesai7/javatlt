package org.assignment.tlt;

import java.io.IOException;

public class Q298_ThrowsExample {

    static void readFile() throws IOException {
        throw new IOException("File not found!");
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

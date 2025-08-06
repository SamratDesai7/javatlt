package org.assignment.tlt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q277_BufferedReaderRead {
    public static void main(String[] args) {
        String filePath = "output.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            System.out.println("File Content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

package org.assignment.tlt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q287_BufferedReaderDisplay {
    public static void main(String[] args) {
        String filePath = "outputt.txt";  

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            System.out.println("File content:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

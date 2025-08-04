package org.assignment.tlt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q278_FileStatsReader {
    public static void main(String[] args) {
        String filePath = "output.txt";  

        int wordCount = 0;
        int charCount = 0;
        int lineCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

package org.assignment.tlt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q282_CopyImage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter source image path: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Enter destination image path: ");
        String destinationPath = scanner.nextLine();

        try (
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destinationPath)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            System.out.println("Image copied successfully!");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}

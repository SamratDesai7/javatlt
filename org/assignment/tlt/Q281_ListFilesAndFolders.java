package org.assignment.tlt;

import java.io.File;
import java.util.Scanner;

public class Q281_ListFilesAndFolders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a valid directory path: ");
        String path = scanner.nextLine();

        File directory = new File(path);

        if (directory.exists() && directory.isDirectory()) {
            File[] items = directory.listFiles();

            System.out.println("\nFiles and Folders in " + path + ":");
            for (File item : items) {
                if (item.isDirectory()) {
                    System.out.println("[Folder] " + item.getName());
                } else {
                    System.out.println("[File]   " + item.getName());
                }
            }
        } else {
            System.out.println("Invalid directory path.");
        }

        scanner.close();
    }
}

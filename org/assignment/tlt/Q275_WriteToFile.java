package org.assignment.tlt;
import java.io.*;
import java.util.Scanner;

public class Q275_WriteToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to write to file: ");
        String input = sc.nextLine();

        try {
            FileWriter fw = new FileWriter("output.txt");
            fw.write(input);
            fw.close();
            System.out.println("Successfully written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        sc.close();
    }
}

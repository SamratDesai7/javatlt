package org.assignment.tlt;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Q279_FileOutputStreamWrite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data to store in file: ");
        String data = sc.nextLine();

        try {
            FileOutputStream fos = new FileOutputStream("output_stream.txt"); 
            fos.write(data.getBytes()); 
            fos.close();
            System.out.println("Data written successfully to output_stream.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        sc.close();
    }
}

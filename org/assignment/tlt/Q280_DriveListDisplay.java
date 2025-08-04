package org.assignment.tlt;

import java.io.File;

public class Q280_DriveListDisplay {
    public static void main(String[] args) {
        File[] drives = File.listRoots();

        System.out.println("Available drives on this system:");
        for (File drive : drives) {
            System.out.println(drive);
        }
    }
}

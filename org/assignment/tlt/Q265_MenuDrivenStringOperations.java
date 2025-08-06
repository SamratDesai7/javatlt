package org.assignment.tlt;

import java.util.Scanner;

public class Q265_MenuDrivenStringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String input = sc.nextLine();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Reverse entire string");
            System.out.println("2. Reverse each word");
            System.out.println("3. Reverse word order");
            System.out.println("4. Capitalize first and last letter");
            System.out.println("5. Capitalize second letter of each word");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.println(new StringBuilder(input).reverse());
                    break;

                case 2:
                    String[] words = input.split(" ");
                    for (int i = 0; i < words.length; i++) {
                        words[i] = new StringBuilder(words[i]).reverse().toString();
                    }
                    System.out.println(String.join(" ", words));
                    break;

                case 3:
                    String[] wordOrder = input.split(" ");
                    for (int i = wordOrder.length - 1; i >= 0; i--) {
                        System.out.print(wordOrder[i] + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    StringBuilder firstLastCap = new StringBuilder();
                    for (String w : input.split(" ")) {
                        if (w.length() == 1) {
                            firstLastCap.append(w.toUpperCase()).append(" ");
                        } else {
                            String middle = w.substring(1, w.length() - 1).toLowerCase();
                            firstLastCap.append(Character.toUpperCase(w.charAt(0)))
                                         .append(middle)
                                         .append(Character.toUpperCase(w.charAt(w.length() - 1)))
                                         .append(" ");
                        }
                    }
                    System.out.println(firstLastCap.toString().trim());
                    break;

                case 5:
                    StringBuilder secondCap = new StringBuilder();
                    for (String w : input.split(" ")) {
                        if (w.length() < 2) {
                            secondCap.append(w).append(" ");
                        } else {
                            secondCap.append(w.charAt(0))
                                     .append(Character.toUpperCase(w.charAt(1)))
                                     .append(w.substring(2))
                                     .append(" ");
                        }
                    }
                    System.out.println(secondCap.toString().trim());
                    break;

                case 0:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

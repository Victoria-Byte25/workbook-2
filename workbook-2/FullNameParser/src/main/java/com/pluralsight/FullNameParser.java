package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter their full name
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim(); // Remove leading/trailing spaces

        // Split the name by spaces
        String[] nameParts = fullName.split("\\s+"); // "\\s+" handles multiple spaces

        // Display the parsed name
        if (nameParts.length == 2) {
            System.out.println("First name: " + nameParts[0]);
            System.out.println("Middle name: (none)");
            System.out.println("Last name: " + nameParts[1]);

        } else if (nameParts.length == 3) {
            System.out.println("First name: " + nameParts[0]);
            System.out.println("Middle name: " + nameParts[1]);
            System.out.println("Last name: " + nameParts[2]);

        } else {
            System.out.println("Invalid input. Please enter either 'first last' or 'first middle last'.");
        }

        scanner.close();
    }
}

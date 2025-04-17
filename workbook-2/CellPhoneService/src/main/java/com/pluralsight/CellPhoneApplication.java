package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 2: Create the CellPhone object
        CellPhone myPhone = new CellPhone();

        // Prompt user and set values using setters
        System.out.print("What is the serial number? ");
        myPhone.setSerialNumber(Integer.parseInt(scanner.nextLine()));

        System.out.print("What model is the phone? ");
        myPhone.setModel(scanner.nextLine());

        System.out.print("Who is the carrier? ");
        myPhone.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number? ");
        myPhone.setPhoneNumber(scanner.nextLine());

        System.out.print("Who is the owner of the phone? ");
        myPhone.setOwner(scanner.nextLine());

        // Print the phone's details using getters
        System.out.println("\n=== Cell Phone Details ===");
        System.out.println("Serial Number: " + myPhone.getSerialNumber());
        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Carrier: " + myPhone.getCarrier());
        System.out.println("Phone Number: " + myPhone.getPhoneNumber());
        System.out.println("Owner: " + myPhone.getOwner());

        scanner.close();
    }
}

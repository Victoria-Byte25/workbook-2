package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 2: Create the CellPhone object
        CellPhone cellPhone1 = new CellPhone();

        // Prompt user and set values using setters
        System.out.print("Enter info for phone 1\n");
        System.out.print("Serial Number: ");
        cellPhone1.setSerialNumber(Integer.parseInt(scanner.nextLine()));

        System.out.print("Model: ");
        cellPhone1.setModel(scanner.nextLine());

        System.out.print("Carrier: ");
        cellPhone1.setCarrier(scanner.nextLine());

        System.out.print("Phone number: ");
        cellPhone1.setPhoneNumber(scanner.nextLine());

        System.out.print("Owner: ");
        cellPhone1.setOwner(scanner.nextLine());

        // Second phone
        CellPhone cellPhone2 = new CellPhone();
        System.out.print("\nEnter info for phone 2\n");
        System.out.print("Serial Number:");
        cellPhone2.setSerialNumber(Integer.parseInt(scanner.nextLine()));
        System.out.print("Model");
        cellPhone2.setModel(scanner.nextLine());
        System.out.print("Carrier: ");
        cellPhone2.setCarrier(scanner.nextLine());
        System.out.print("Phone Number: ");
        cellPhone2.setPhoneNumber(scanner.nextLine());
        System.out.print("Owner: ");
        cellPhone2.setOwner(scanner.nextLine());

        //Display method
        System.out.println("\n=== phone Calls ===");
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        scanner.close();
    }

        // Static display
        public static void display(CellPhone phone) {
            System.out.println("Owner: " + phone.getOwner());
            System.out.println("Model: " + phone.getModel());
            System.out.println("Carrier: " + phone.getCarrier());
            System.out.println("Phone Number: " + phone.getPhoneNumber());
            System.out.println("Serial Number: " + phone.getSerialNumber());
            System.out.println("--------------------------");

        }

}

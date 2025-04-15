package com.pluralsight;

import java.util.Scanner;

public class AddressBuilderApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder info = new StringBuilder();

        System.out.print("Full name: ");
        info.append(scanner.nextLine().trim()).append("\n\n");

        // Billing Address
        System.out.println("Billing Address:");
        System.out.print("Street: ");
        info.append("Billing Address:\n").append(scanner.nextLine().trim()).append("\n");

        System.out.print("City: ");
        String city = scanner.nextLine().trim();
        System.out.print("State: ");
        String state = scanner.nextLine().trim();
        System.out.print("Zip: ");
        String zip = scanner.nextLine().trim();
        info.append(city).append(", ").append(state).append(" ").append(zip).append("\n\n");

        // Shipping Address
        System.out.println("Shipping Address:");
        System.out.print("Street: ");
        info.append("Shipping Address:\n").append(scanner.nextLine().trim()).append("\n");

        System.out.print("City: ");
        city = scanner.nextLine().trim();
        System.out.print("State: ");
        state = scanner.nextLine().trim();
        System.out.print("Zip: ");
        zip = scanner.nextLine().trim();
        info.append(city).append(", ").append(state).append(" ").append(zip).append("\n");

        System.out.println("\n" + info.toString());
    }
}

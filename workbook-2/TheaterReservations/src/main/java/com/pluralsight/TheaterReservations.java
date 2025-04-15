package com.pluralsight;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String inputDate = scanner.nextLine().trim();

        System.out.print("How many tickets would you like? ");
        int tickets = Integer.parseInt(scanner.nextLine().trim());

        // Format the date into LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Split name
        String[] nameParts = fullName.split(" ");
        String first = nameParts[0];
        String last = nameParts[1];

        // Format output message
        String ticketWord = (tickets == 1) ? "ticket" : "tickets";

        System.out.println(tickets + " " + ticketWord + " reserved for " + date + " under " + first + " " + last);
    }
}

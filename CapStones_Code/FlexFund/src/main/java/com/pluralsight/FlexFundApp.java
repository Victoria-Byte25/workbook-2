package com.pluralsight;

import java.util.Scanner;

public class FlexFundApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransactionManager transactionManager = new TransactionManager();
        GoalTracker goalTracker = new GoalTracker();
        QuoteGenerator quoteGenerator = new QuoteGenerator();

        System.out.println("Welcome to FlexFund App!");

        boolean running = true;
        while (running) {
            System.out.println("\nWhat would you like to do?");
            System.out.println("1. Add a deposit");
            System.out.println("2. Add a payment");
            System.out.println("3. View all transactions");
            System.out.println("4. View savings and spending progress");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");


        }


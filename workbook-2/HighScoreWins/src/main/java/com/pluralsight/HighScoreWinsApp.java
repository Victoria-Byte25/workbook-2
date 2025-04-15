package com.pluralsight;

import java.util.Scanner;

public class HighScoreWinsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String input = scanner.nextLine();

        String[] parts = input.split("\\|");
        String[] teams = parts[0].split(":");
        String[] scores = parts[1].split(":");

        String team1 = teams[0];
        String team2 = teams[1];
        int score1 = Integer.parseInt(scores[0]);
        int score2 = Integer.parseInt(scores[1]);

        String winner = (score1 > score2) ? team1 : team2;
        System.out.println("Winner: " + winner);
    }
}

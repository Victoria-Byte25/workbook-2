package com.pluralsight;
import java.util.Arrays;

public class TestStatisticsApp {

        public static void main(String[] args) {
            int[] scores = {88, 92, 76, 81, 95, 68, 90, 84, 79, 85};

            // Calculate average
            int sum = 0;
            for (int score : scores) {
                sum += score;
            }
            double average = (double) sum / scores.length;

            // Find high and low scores
            int highScore = scores[0];
            int lowScore = scores[0];

            for (int score : scores) {
                if (score > highScore) {
                    highScore = score;
                }
                if (score < lowScore) {
                    lowScore = score;
                }
            }

            // Calculate median
            Arrays.sort(scores);
            double median;
            if (scores.length % 2 == 0) {
                median = (scores[4] + scores[5]) / 2.0;
            } else {
                median = scores[scores.length / 2];
            }

            // Output results
            System.out.println("Average score: " + average);
            System.out.println("High score: " + highScore);
            System.out.println("Low score: " + lowScore);
            System.out.println("Median score: " + median);
            System.out.println("Difference between average and median: " + Math.abs(average - median));
        }


}

package com.pluralsight;

public class Dice {
        public int roll() {
            int randomNumber = (int)(Math.random() * 6) + 1; // Gives 1-6
            return randomNumber;
        }


}

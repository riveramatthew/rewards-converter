package main.java;

import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to the Credit Card Rewards Converter!");

        // Prompt user for input
        System.out.print("Please enter a cash value to convert to airline miles: ");
        String input = scanner.nextLine().trim();

        double cashValue;
        try {
            cashValue = Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            return; // Exit program if input is not a valid number
        }

        // Create a RewardValue object with the entered cash value
        RewardValue rewardValue = new RewardValue(cashValue);

        // Output the converted miles value
        System.out.println("$" + cashValue + " is worth " + rewardValue.getMilesValue() + " miles");

        // Close the scanner
        scanner.close();
    }
}

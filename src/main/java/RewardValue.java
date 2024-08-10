package main.java;
import java.util.Scanner;


public class RewardValue {

    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter '1' to input cash value or '2' to input miles value:");
        int choice = scanner.nextInt();

        RewardValue rewardValue;

        if (choice == 1) {
            System.out.print("Enter the cash value: ");
            double cashValue = scanner.nextDouble();
            rewardValue = new RewardValue(cashValue);

            System.out.println("You entered a cash value of $" + rewardValue.getCashValue());
            System.out.println("Equivalent miles value: " + rewardValue.getMilesValue() + " miles");
        } else if (choice == 2) {
            System.out.print("Enter the miles value: ");
            int milesValue = scanner.nextInt();
            rewardValue = new RewardValue(milesValue);

            System.out.println("You entered a miles value of " + rewardValue.getMilesValue() + " miles");
            System.out.println("Equivalent cash value: $" + rewardValue.getCashValue());
        } else {
            System.out.println("Invalid choice. Please enter '1' for cash or '2' for miles.");
        }

        scanner.close();
    }
}

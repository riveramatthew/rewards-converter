package main.java;

public class RewardValue {
    private final double cashValue;
    private final int milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
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
    public int getMilesValue() {
        return milesValue;
    }

    // Main method for testing
    public static void main(String[] args) {
        RewardValue rewardFromCash = new RewardValue(100.0); // Example using cash
        RewardValue rewardFromMiles = new RewardValue(28571); // Example using miles (assuming 100.0 / 0.0035 = 28571)

        System.out.println("$100.0 is worth " + rewardFromCash.getMilesValue() + " miles");
        System.out.println("28571 miles is worth $" + rewardFromMiles.getCashValue());
    }
}



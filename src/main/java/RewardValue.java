import java.util.Scanner;


public class RewardValue {
    public static final double MILES_TO_CASH_RATE = 0.0035;
    private double value;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.value = cashValue;
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.value = milesToCash(milesValue);
    }

    // Method to convert miles to cash
    private double milesToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_RATE;
    }

    // Method to convert cash to miles
    private int cashToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_RATE);
    }

    // Getter for cash value
    public double getCashValue() {
        return this.value;
    }

    // Getter for miles value
    public int getMilesValue() {
        return cashToMiles(this.value);
    }

    // Main method for testing purposes
    public static void main(String[] args) {
        RewardValue reward1 = new RewardValue(100); // cash
        System.out.println("Cash value: $" + reward1.getCashValue());
        System.out.println("Miles value: " + reward1.getMilesValue() + " miles");

        RewardValue reward2 = new RewardValue(10000); // miles
        System.out.println("Cash value: $" + reward2.getCashValue());
        System.out.println("Miles value: " + reward2.getMilesValue() + " miles");
    }
}

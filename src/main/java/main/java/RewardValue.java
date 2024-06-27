package main.java;

public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035); // Conversion rate 0.0035
    }

    // Constructor for miles value (if needed)
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Conversion rate 0.0035
    }

    // Getter method for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method for miles value
    public int getMilesValue() {
        return milesValue;
    }
}

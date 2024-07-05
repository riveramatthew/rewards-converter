package main.java;

public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_RATE;
        } else {
            this.cashValue = milesValue;
            this.milesValue = milesValue / MILES_TO_CASH_RATE;
        }
    }

    // Get the cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Get the miles value
    public double getMilesValue() {
        return this.milesValue;
    }
}

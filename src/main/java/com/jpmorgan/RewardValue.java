package com.jpmorgan;

public class RewardValue {
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private final double cashValue;
    private final double milesValue;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_CONVERSION_RATE;
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}

package com.example.rewards;

public class RewardValue {
    private static final double CASH_TO_MILES_RATE = 100.0; // Conversion rate: 1 dollar = 100 miles
    private static final double MILES_TO_CASH_RATE = 0.0035;  // Conversion rate: 1 mile = 0.0035 dollars

    private double cashValue;
    private double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * CASH_TO_MILES_RATE;
    }

    // Constructor accepting miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Getters for cash and miles values
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    // Static method to convert cash to miles
    public static double convertCashToMiles(double cash) {
        return cash * CASH_TO_MILES_RATE;
    }

    // Static method to convert miles to cash
    public static double convertMilesToCash(int miles) {
        return miles * MILES_TO_CASH_RATE;
    }
}

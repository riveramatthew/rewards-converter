package main.java;

public class RewardValue {
    private double cashValue; // Cash value of the reward
    private double milesValue; // Miles value of the reward

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue); // Convert cash to miles
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue); // Convert miles to cash
    }

    // Convert miles to cash at the rate of 0.0035
    private double milesToCash(double miles) {
        return miles * 0.0035;
    }

    // Convert cash to miles
    private double cashToMiles(double cash) {
        return cash / 0.0035;
    }

    // Get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get miles value
    public double getMilesValue() {
        return milesValue;
    }
}

// package main.java;

public class RewardValue {
    private double cashValue;
    private double milesValue;


    //Constructor-1 : Converting cash into miles
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor-2 : Converting miles to cash
    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
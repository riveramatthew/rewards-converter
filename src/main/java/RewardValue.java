import java.util.*;
public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }
    // Constructor value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
    }

    // Method cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method  miles value
    public double getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        // Test cases
        RewardValue cashReward = new RewardValue(100.0);
        System.out.println("Cash Reward: " + cashReward.getCashValue()); // Output: 100.0
        System.out.println("Miles Reward: " + cashReward.getMilesValue()); // Output: 28571.428571428572

        RewardValue milesReward = new RewardValue(20000);
        System.out.println("Cash Reward: " + milesReward.getCashValue()); // Output: 70.0
        System.out.println("Miles Reward: " + milesReward.getMilesValue()); // Output: 20000.0
    }
}

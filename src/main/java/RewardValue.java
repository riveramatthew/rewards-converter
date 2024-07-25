

public class RewardValue {
    private double cashValue;
    private int milesValue;
    public static final double MILES_CONVERSION_RATE = 0.01; // Example conversion rate: 1 mile = $0.01

    // Constructor to create RewardValue with cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_CONVERSION_RATE);
    }

    // Constructor to create RewardValue with miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_CONVERSION_RATE;
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public int getMilesValue() {
        return milesValue;
    }
}

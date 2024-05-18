public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Conversion constants
    private static final double MTC = 0.0035;
    private static final double CTM = 1 / MTC;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * CTM;
    }

    // Constructor that accepts a miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MTC;
    }

    // Method to return the cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Method to return the miles value
    public int getMilesValue() {
        return (int) this.milesValue;
    }
}

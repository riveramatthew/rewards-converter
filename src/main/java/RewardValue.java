public class RewardValue {
    private double cashValue;

    // Conversion rate from miles to cash
    private static final double milesRate = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor that accepts a miles value
    public RewardValue(int milesValue) {
        this.cashValue = milesValue * milesRate;
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public int getMilesValue() {
        return (int) (cashValue / milesRate);
    }


}
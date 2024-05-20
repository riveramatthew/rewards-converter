public class RewardValue {
    private final double cashValue;
    private final int milesValue;
    private static final double CONVERSION_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / CONVERSION_RATE);
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * CONVERSION_RATE;

    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public int getMilesValue() {
        return milesValue;
    }
}

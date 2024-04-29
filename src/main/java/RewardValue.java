public class RewardValue {
    private double cashValue;
    private double milesValue;
    public static final double CONVERSION_RATE = 0.0035; // Conversion rate from miles to cash

    // Constructor to initialize with cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / CONVERSION_RATE; // Calculate miles from cash
    }

    // Constructor to initialize with miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONVERSION_RATE; // Calculate cash from miles
    }
    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }
}

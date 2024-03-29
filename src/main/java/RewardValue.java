public class RewardValue {
    // Declared the constants
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    // Instance variables
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    // Method to get the cash value
    public double getCashValue() {
        // Convert miles to cash
        this.cashValue = this.milesValue * MILES_TO_CASH_CONVERSION_RATE;
        return this.cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        // Assuming the cash value directly maps to miles using the conversion rate
        this.milesValue = this.cashValue / MILES_TO_CASH_CONVERSION_RATE;
        return this.milesValue;
    }
}

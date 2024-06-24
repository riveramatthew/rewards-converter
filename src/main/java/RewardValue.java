

public class RewardValue {
    private double cashValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor for accepting values in cash
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Constructor for accepting values in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
        } else {
            this.cashValue = milesValue;
        }
    }

    // Method to get the cash value
    public double getCashValue() {
        return this.cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return this.cashValue / MILES_TO_CASH_CONVERSION_RATE;
    }
}

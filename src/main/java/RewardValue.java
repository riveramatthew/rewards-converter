public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // Conversion rate from cash to miles
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Conversion rate from miles to cash
    }

    // Get for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Get for miles value
    public double getMilesValue() {
        return milesValue;
    }
}

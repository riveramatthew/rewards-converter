public class RewardValue {
    private double cashValue;
    private double milesValue;
    private boolean isMiles;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * 1.5; // Convert cash to miles
        this.isMiles = false;
    }

    // Constructor for miles value
    public RewardValue(double milesValue, boolean isMiles) {
        this.isMiles = isMiles;
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035; // Convert miles to cash
        } else {
            this.cashValue = milesValue; // Assuming milesValue is treated as cash here
            this.milesValue = cashValue * 1.5; // Assume conversion rate
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}

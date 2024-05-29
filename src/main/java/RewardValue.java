public class RewardValue {
    private static final double MILES_TO_CASH = 0.0035;
    private double cashValue;
    private double milesValue;
    
    public RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = cash / MILES_TO_CASH;
    }

    public RewardValue(double miles, boolean isMiles) {
        if (isMiles) {
            this.milesValue = miles;
            this.cashValue = miles * MILES_TO_CASH;
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }
}

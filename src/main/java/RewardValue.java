public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = this.cashValue / CONVERSION_RATE;
    }

    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = this.milesValue * CONVERSION_RATE;
        } else {
            this.cashValue = milesValue;
            this.milesValue = this.cashValue / CONVERSION_RATE;
        }
    }

    public double getCashValue() {
        return cashValue;
    }
    
    public double getMilesValue() {
        return milesValue;
    }
}
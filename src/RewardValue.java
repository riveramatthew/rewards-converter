public class RewardValue {
    private static final double MILES_CONVERSION_RATE = 0.5; // Example conversion rate
    private double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getMilesValue() {
        return cashValue / MILES_CONVERSION_RATE;
    }
}

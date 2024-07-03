public class RewardValue {
    private double cashValue;
    private static final double MILES_CONVERSION_RATE = 0.8; // Example conversion rate

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getMilesValue() {
        return cashValue * MILES_CONVERSION_RATE;
    }
}

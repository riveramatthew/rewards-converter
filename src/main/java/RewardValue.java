public class RewardValue {
    private final double cashValue;
    private final double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * 100; // Assuming a conversion rate of 100 miles per dollar
    }

    public double getMilesValue() {
        return milesValue;
    }
}


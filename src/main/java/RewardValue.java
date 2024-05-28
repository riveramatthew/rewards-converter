public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Calculate milesValue based on a conversion formula
        this.milesValue = cashValue * 100; // For example, 100 miles per dollar
    }

    public double getMilesValue() {
        return milesValue;
    }
}

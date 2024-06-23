public class RewardValue {

    private double cashValue;
    private double milesValue;

    private final double milesToCashRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / milesToCashRate;
    }

    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * milesToCashRate;
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return (int) milesValue;
    }
}

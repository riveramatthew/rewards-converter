public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue() {
        this.cashValue = 0.0;
        this.milesValue = 0;
    }

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * 0.00035;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue / 0.00035;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public double getMilesValue() {
        return this.milesValue;
    }
}

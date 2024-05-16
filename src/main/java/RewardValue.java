public class RewardValue {
    private double cashValue;
    private double milesValue;

    // note: RewardValue must convert from miles to cash at a rate of 0.0035

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * 0.0035;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue / 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}

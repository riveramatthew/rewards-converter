public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return milesValue / 0.0035;
    }

    public double getMilesValue() {
        return cashValue * 0.0035;
    }
}

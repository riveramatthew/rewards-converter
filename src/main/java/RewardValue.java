public class RewardValue {

    private double milesValue;
    private double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * 0.0035;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue / 0.0035;
    }

    public RewardValue(double cashValue, double milesValue) {
        this.cashValue = cashValue;
        this.milesValue = milesValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}

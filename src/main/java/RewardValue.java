public class RewardValue {

    private double milesValue;
    private double cashValue;
    private double CONVERSION_RATE=0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue * CONVERSION_RATE;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue / CONVERSION_RATE;
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

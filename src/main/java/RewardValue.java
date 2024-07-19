public class RewardValue {
    private double cashValue;
    private int milesValue;
    private final double RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) Math.round(cashValue / RATE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * RATE;
    }

    public int getMilesValue() {
        return this.milesValue;
    }

    public double getCashValue() {
        return this.cashValue;
    }
}

public class RewardValue {
    public static final double CONVERSION_VALUE = 0.0035;
    private final double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int) (cashValue / CONVERSION_VALUE);
    }
}

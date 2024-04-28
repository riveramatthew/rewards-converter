public class RewardValue {

    private final double cashValue;
    private final double Miles_to_Cash = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int miles) {
        this.cashValue = miles * this.Miles_to_Cash;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int)(cashValue/Miles_to_Cash);
    }
}

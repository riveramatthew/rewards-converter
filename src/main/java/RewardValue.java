
public class RewardValue {
    final double cashValue;
    RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return cashValue/0.0035;
    }
}
public class RewardValue {

    double cash;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public double getCashValue() {
        return cash * 0.0035;
    }
    public double getMilesValue() {
        return getCashValue();
    }
}

public class RewardValue {
    double cash;
    float miles;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(float miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        return this.miles * 0.0035;
    }

    public double getMilesValue() {
        return this.cash / 0.0035;
    }
}

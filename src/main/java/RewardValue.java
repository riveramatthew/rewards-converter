public class RewardValue {
    private double cash;
    private int miles;
    private final double rate = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.miles = miles;
    }

    public double getCashValue() {
        cash = miles * rate;
        return cash;
    }

    public int getMilesValue() {
        miles = (int)(cash / rate);
        return miles;
    }
}

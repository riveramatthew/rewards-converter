public class RewardValue {
    double cash;
    int miles;
    public static final double rate = 0.0035;

    public RewardValue(double cashValue) {
        this.cash = cashValue;
        this.miles = (int) (cash / rate);
    }

    public RewardValue(int milesValue) {
        this.miles = milesValue;
        this.cash = miles * rate;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}

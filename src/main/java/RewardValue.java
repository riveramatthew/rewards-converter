public class RewardValue {
    double cash;
    int miles;
    double rate = 0.0035;

    public RewardValue(double cashValue) {
        cash = cashValue;
        miles = (int) (cash / rate);
    }

    public RewardValue(int milesValue) {
        miles = milesValue;
        cash = miles * rate;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}

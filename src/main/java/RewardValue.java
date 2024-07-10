public class RewardValue {
    double cash;
    int miles;

    public RewardValue(double cashValue) {
        this.cash = cashValue;
    }

    public RewardValue(int miles) {
        this.cash = miles * 0.0035;
    }

    public static int convertToMiles(double cash) {
        return (int) (cash / 0.0035);
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return convertToMiles(cash);
    }
}

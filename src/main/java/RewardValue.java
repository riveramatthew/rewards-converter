public class RewardValue {
    public static double miles_to_cash = 0.0035;
    int miles;
    double cash;
    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = this.miles * miles_to_cash;
    }

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) (this.cash / miles_to_cash);
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}

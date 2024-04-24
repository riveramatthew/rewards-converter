public class RewardValue {
    double cash;
    int miles;
    // Constructors
    public RewardValue(double cashValue) {
        this.cash = cashValue;
        this.miles = (int) (cashValue / 0.0035);
    }
    public RewardValue(int milesValue) {
        this.miles = milesValue;
        this.cash = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}

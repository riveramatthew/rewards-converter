public class RewardValue {
    private double cash;
    private int miles;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cash = cashValue;
        this.miles = (int) (cashValue / 0.0035); // Convert cash to miles
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.miles = milesValue;
        this.cash = milesValue * 0.0035; // Convert miles to cash
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}

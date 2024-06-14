public class RewardValue {
    private final double cash;
    private final double miles;

    // Conversion rate from miles to cash
    private static final double MCRate = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / MCRate;
    }

    // Constructor that accepts a value in miles
    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = miles * MCRate;
    }

    // Method to get the cash value
    public double getCashValue() {
        return this.cash;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return this.miles;
    }
}
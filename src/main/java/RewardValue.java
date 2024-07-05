public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.01; // Example conversion rate

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public int getMilesValue() {
        return milesValue;
    }

    // Convert miles to cash
    public double convertMilesToCash() {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Convert cash to miles
    public int convertCashToMiles() {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }
}

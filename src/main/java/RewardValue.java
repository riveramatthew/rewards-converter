public class RewardValue {
    private static final double MILES_TO_CASH = 0.0035;
    private double cashValue;
    private double milesValue;

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH;
    }

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)(cashValue / MILES_TO_CASH);
    }

    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }
}

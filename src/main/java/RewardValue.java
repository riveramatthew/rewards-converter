public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double MILES_CONVERSION_RATE = 0.01; // Example conversion rate

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_CONVERSION_RATE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public static int convertCashToMiles(double cashValue) {
        return (int) (cashValue / MILES_CONVERSION_RATE);
    }

    public static double convertMilesToCash(int milesValue) {
        return milesValue * MILES_CONVERSION_RATE;
    }
}
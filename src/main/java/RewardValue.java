public class RewardValue {
    private final double cashValue;
    private final int milesValue;
    private static final double CASH_TO_MILES_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / CASH_TO_MILES_CONVERSION_RATE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * CASH_TO_MILES_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public static double convertCashToMiles(double cashValue) {
        return cashValue / CASH_TO_MILES_CONVERSION_RATE;
    }

    public static double convertMilesToCash(int milesValue) {
        return milesValue * CASH_TO_MILES_CONVERSION_RATE;
    }
}

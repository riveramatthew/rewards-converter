public class RewardValue {
    static double cashVal;
    static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        cashVal = cashValue;
    }

    public RewardValue(int milesValue) {
        cashVal = convertMilesToCash(milesValue);
    }

    private static double convertMilesToCash(int milesValue) {
        return milesValue * CONVERSION_RATE;
    }

    private static int convertCashToMiles(double cashValue) {
        return (int) (cashValue / CONVERSION_RATE);
    }

    public static double getCashValue() {
        return cashVal;
    }

    public int getMilesValue() {
        return convertCashToMiles(cashVal);
    }
}
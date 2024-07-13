public class RewardValue {
    public static final double CONVERSION_VALUE = 0.0035;
    private final double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(cashValue);
    }

    public static double convertToCash(int milesValue) {
        return milesValue * CONVERSION_VALUE;
    }

    public static int convertToMiles(double cashValue) {
        return (int) (cashValue / CONVERSION_VALUE);
    }
}

public class RewardValue {
    static double cashVal;
    static int milesVal;
    static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        cashVal = cashValue;
    }

    public RewardValue(int milesValue) {
        milesVal = milesValue;
    }

    public static double getCashValue() {
        return milesVal * CONVERSION_RATE;
    }

    public int getMilesValue() {
        return (int) (cashVal / CONVERSION_RATE);
    }
}
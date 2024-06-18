public class RewardValue {
    static double cashVal;
    static int milesVal;

    public RewardValue(double cashValue) {
        cashVal = cashValue;
    }

    public RewardValue(int milesValue) {
        milesVal = milesValue;
    }

    public static double getCashValue() {
        return milesVal * 0.0035;
    }

    public double getMilesValue() {
        return cashVal / 0.0035;
    }
}
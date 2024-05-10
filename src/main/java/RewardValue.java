public class RewardValue {
    private final double cashValue;
    private final int milesValue;

    public RewardValue() {
        this.cashValue = 0.0;
        this.milesValue = 0;
    }

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    private static int cashToMiles(double cashValue) {
        return (int) (cashValue / 0.00035);
    }

    private static double milesToCash(int milesValue) {
        return milesValue * 0.00035;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.milesValue;
    }
}

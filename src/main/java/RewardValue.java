public class RewardValue {
    private double cashValue;
    public static final double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return cashToMiles(this.cashValue);
    }

    private int cashToMiles(double cashValue) {
        return (int) (cashValue / conversionRate);
    }

    private double milesToCash(int milesValue) {
        return (milesValue * conversionRate);
    }
}
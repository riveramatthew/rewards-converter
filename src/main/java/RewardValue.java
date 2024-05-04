public class RewardValue {

    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        // Potentially calculate milesValue based on conversion rate here
        this.milesValue = (int) (cashValue * getConversionRate()); // Assuming conversion rate is a constant
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        // Potentially calculate cashValue based on conversion rate here
        this.cashValue = milesValue / getConversionRate();
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    private static double getConversionRate() {
        // This method could return the constant conversion rate (0.0035)
        return 0.0035;
    }
}


public class RewardValue {
    private static final double CASH_TO_MILES_RATE = 100.0;
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    private double convertCashToMiles(double cashValue) {
        return cashValue * CASH_TO_MILES_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}

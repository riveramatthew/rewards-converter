public class RewardValue {

    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    //  cash value constructor
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    //  miles value constructor
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_TO_CASH_RATE;
        } else {
            this.cashValue = milesValue;
            this.milesValue = milesValue / MILES_TO_CASH_RATE;
        }
    }

    // get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // get the miles value
    public double getMilesValue() {
        return milesValue;
    }
}

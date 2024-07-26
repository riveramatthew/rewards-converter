public class RewardValue {
    // Conversion rate from miles to cash
    private static final double MILES_TO_CASH_RATE = 0.0035;

    private double cashValue;
    private double milesValue;
    private boolean isCash;

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.isCash = true;
        this.milesValue = cashValueToMiles(cashValue);
    }

    // Constructor for miles value
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.isCash = false;
            this.cashValue = milesValueToCash(milesValue);
        } else {
            throw new IllegalArgumentException("The second parameter must be true for miles value.");
        }
    }

    // Converts cash value to miles
    private double cashValueToMiles(double cashValue) {
        double CASH_TO_MILES_RATE = 0.5;
        return cashValue * CASH_TO_MILES_RATE;
    }

    // Converts miles value to cash
    private double milesValueToCash(double milesValue) {
        return milesValue * MILES_TO_CASH_RATE;
    }

    // Returns the cash value of the RewardValue
    public double getCashValue() {
        if (isCash) {
            return cashValue;
        } else {
            return milesValueToCash(milesValue);
        }
    }

    // Returns the miles value of the RewardValue
    public double getMilesValue() {
        if (isCash) {
            return cashValueToMiles(cashValue);
        } else {
            return milesValue;
        }
    }
}

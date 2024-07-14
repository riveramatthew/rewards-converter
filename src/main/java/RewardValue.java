public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035; //

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public int getMilesValue() {
        return milesValue;
    }

    // Convert from cash to miles
    public int convertFromCashToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // Convert from miles to cash
    public double convertFromMilesToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

   }



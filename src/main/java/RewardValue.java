public class RewardValue {
    private double cashValue;
    private double milesValue;

    private static final double MILES_CONVERSION_RATE = 0.01; 

    // Constructor for cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_CONVERSION_RATE;
    }

    // Constructor for miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    // Conversion method from cash to miles
    public double convertCashToMiles(double cash) {
        return cash / MILES_CONVERSION_RATE;
    }

    // Conversion method from miles to cash
    public double convertMilesToCash(int miles) {
        return miles * MILES_CONVERSION_RATE;
    }
}

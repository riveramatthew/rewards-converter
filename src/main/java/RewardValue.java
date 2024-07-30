public class RewardValue {

    // Private variables to store the cash and miles values
    private double cashValue;
    private double milesValue;

    // Conversion rate constant
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);  // Convert cash to miles
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue) {
        this.milesValue = milesValue;
        this.cashValue = convertMilesToCash(milesValue);  // Convert miles to cash
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Private method to convert miles to cash
    private double convertMilesToCash(double miles) {
        return miles * MILES_TO_CASH_RATE;
    }

    // Private method to convert cash to miles
    private double convertCashToMiles(double cash) {
        return cash / MILES_TO_CASH_RATE;
    }
}

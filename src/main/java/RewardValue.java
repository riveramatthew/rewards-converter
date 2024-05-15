public class RewardValue {
    private double cash;
    private double miles;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts a cash value
    RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / MILES_TO_CASH_RATE;  // Convert cash to miles
    }

    // Constructor that accepts a value in miles
    RewardValue(double miles, boolean isMiles) {
        if (isMiles) {
            this.miles = miles;
            this.cash = miles * MILES_TO_CASH_RATE;  // Convert miles to cash
        }
    }

    // Method to get the cash value
    double getCashValue() {
        return cash;
    }

    // Method to get the miles value
    double getMilesValue() {
        return miles;
    }
}

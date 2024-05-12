public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor for cash to miles conversion
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // Constructor for miles to cash conversion
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = convertMilesToCash(milesValue);
        } else {
            this.cashValue = milesValue / 0.0035; // Convert miles to cash
            this.milesValue = milesValue;
        }
    }

    // Method to convert cash value to miles
    private double convertCashToMiles(double cashValue) {
        // Conversion rate: 1 dollar = 285.71 miles (0.0035 dollars per mile)
        return cashValue / 0.0035;
    }

    // Method to convert miles value to cash
    private double convertMilesToCash(double milesValue) {
        // Conversion rate: 0.0035 dollars per mile
        return milesValue * 0.0035;
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public double getMilesValue() {
        return milesValue;
    }
}

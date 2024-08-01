public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValueToMiles(cashValue);
    }

    // Constructor that accepts miles value
    public RewardValue(boolean isMiles, double value) {
        if (isMiles) {
            this.milesValue = value;
            this.cashValue = milesToCash(value);
        } else {
            this.cashValue = value;
            this.milesValue = cashValueToMiles(value);
        }
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Convert cash value to miles
    private double cashValueToMiles(double cash) {
        return cash * 1.5; // Placeholder conversion rate
    }

    // Convert miles to cash value
    private double milesToCash(double miles) {
        return miles * 0.0035;
    }
}

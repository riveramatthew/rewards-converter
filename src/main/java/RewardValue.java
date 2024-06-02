public class RewardValue {
    private static final double MILES_TO_CASH_RATE = 0.0035;
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesToCash(milesValue);
        } else {
            this.cashValue = milesValue;
            this.milesValue = cashToMiles(milesValue);
        }
    }

    // Method to convert cash value to miles
    private double cashToMiles(double cashValue) {
        return cashValue / MILES_TO_CASH_RATE;
    }

    // Method to convert miles value to cash
    private double milesToCash(double milesValue) {
        return milesValue * MILES_TO_CASH_RATE;
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        // Example usage
        RewardValue rewardCash = new RewardValue(100);
        System.out.println("Cash value: $" + rewardCash.getCashValue());  // Should print: Cash value: $100
        System.out.println("Miles value: " + rewardCash.getMilesValue() + " miles");  // Should print equivalent miles

        RewardValue rewardMiles = new RewardValue(1000, true);
        System.out.println("Cash value: $" + rewardMiles.getCashValue());  // Should print equivalent cash
        System.out.println("Miles value: " + rewardMiles.getMilesValue() + " miles");  // Should print: Miles value: 1000 miles
    }
}

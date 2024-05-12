public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    // Method to convert cash value to miles
    private double convertCashToMiles(double cashValue) {
        // Your conversion logic here (example conversion)
        return cashValue * 10; // Example: 10 miles per dollar
    }

    // Getter for cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter for miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example usage
        RewardValue reward = new RewardValue(100.0); // $100 cash value
        System.out.println("Cash value: $" + reward.getCashValue());
        System.out.println("Miles value: " + reward.getMilesValue() + " miles");
    }
}

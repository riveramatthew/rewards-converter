public class RewardValue {
    // Constants declaration
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Instance variables
    private double cashValue; // Stores the cash value
    private int milesValue; // Stores the miles value

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue; // Initialize cash value
        this.milesValue = convertToMiles(cashValue); // Convert cash value to miles
    }

    // Constructor accepting miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue; // Initialize miles value
        this.cashValue = convertToCash(milesValue); // Convert miles value to cash
    }

    // Method to convert miles to cash
    private static double convertToCash(int milesValue) {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    // Method to convert cash to miles
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    // Method to retrieve the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to retrieve the miles value
    public int getMilesValue() {
        return milesValue;
    }
}

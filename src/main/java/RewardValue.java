
public class RewardValue {
    private final double cashValue;
    private final int milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035); // Convert cash to miles at rate 0.0035
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Convert miles to cash at rate 0.0035
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public int getMilesValue() {
        return milesValue;
    }

    // Method to convert cash to miles
    public int convertCashToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    // Method to convert miles to cash
    public double convertMilesToCash(int milesValue) {
        return milesValue * 0.0035;
    }
}

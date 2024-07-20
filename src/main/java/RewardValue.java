
public class RewardValue {

    private double cashValue; // in dollars
    private int milesValue;   // in miles

    // Constructor that accepts cash value in dollars
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035); // Convert cash to miles at rate of 0.0035
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Convert miles to cash at rate of 0.0035
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public int getMilesValue() {
        return milesValue;
    }

   

}


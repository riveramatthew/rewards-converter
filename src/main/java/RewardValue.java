public class RewardValue {
    private double cashValue;
    private int milesValue;

    // Constructor that accepts cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    // Constructor that accepts miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public int getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        // Example usage:
        RewardValue reward1 = new RewardValue(100); // Creating with miles value
        System.out.println("Cash value for 100 miles: $" + reward1.getCashValue());
        System.out.println("Miles value for $" + reward1.getCashValue() + ": " + reward1.getMilesValue() + " miles");

        RewardValue reward2 = new RewardValue(25.0); // Creating with cash value
        System.out.println("Miles value for $25.0: " + reward2.getMilesValue() + " miles");
        System.out.println("Cash value for " + reward2.getMilesValue() + " miles: $" + reward2.getCashValue());
    }
}

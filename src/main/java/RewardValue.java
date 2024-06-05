public class RewardValue {
    private double cashValue;
    private double milesValue;

    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_CONVERSION_RATE;
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
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
        // Creating an instance with cash value
        RewardValue cashReward = new RewardValue(100.0); // 100 dollars
        System.out.println("Cash value: " + cashReward.getCashValue()); // Output: Cash value: 100.0
        System.out.println("Miles value: " + cashReward.getMilesValue()); // Output: Miles value: 28571.428571428572

        // Creating an instance with miles value
        RewardValue milesReward = new RewardValue(5000); // 5000 miles
        System.out.println("Cash value: " + milesReward.getCashValue()); // Output: Cash value: 17.5
        System.out.println("Miles value: " + milesReward.getMilesValue()); // Output: Miles value: 5000.0
    }
}

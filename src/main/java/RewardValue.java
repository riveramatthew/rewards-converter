public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double MILES_TO_CASH_RATE = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_TO_CASH_RATE;
    }

    // Constructor that accepts a value in miles
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_TO_CASH_RATE;
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
        // Testing the RewardValue class
        RewardValue cashReward = new RewardValue(100);
        System.out.println("Cash Reward: " + cashReward.getCashValue() + " dollars, " + cashReward.getMilesValue() + " miles");

        RewardValue milesReward = new RewardValue(10000);
        System.out.println("Miles Reward: " + milesReward.getMilesValue() + " miles, " + milesReward.getCashValue() + " dollars");
    }
}



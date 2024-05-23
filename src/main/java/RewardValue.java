public class RewardValue {
    /**
     * The "value" of the RewardValue object, stored in cash and converted to miles when needed.
     */
    private double cash;

    /**
     * Creates a new RewardValue object given an amount of miles.
     * @param miles The amount of miles for the RewardValue to be initialized with.
     */
    public RewardValue(int miles) {
        cash = miles * 0.0035;
    }

    /**
     * Creates a new RewardValue object given a cash value.
     * @param cash The cash value for the RewardValue to be initialized with.
     */
    public RewardValue(double cash) {
        this.cash = cash;
    }

    /**
     * @return the miles value of the RewardValue, converted from cash.
     */
    public int getMilesValue() {
        return (int) (cash / 0.0035);
    }

    /**
     * @return the cash value of the RewardValue.
     */
    public double getCashValue() {
        return cash;
    }

}

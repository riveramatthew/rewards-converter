public class RewardValue {
    /**
     * The "value" of the RewardValue object, stored in miles and converted to cash when needed.
     */
    private int miles;

    /**
     * Creates a new RewardValue object given an amount of miles.
     * @param miles The amount of miles for the RewardValue to be initialized with.
     */
    public RewardValue(int miles) {
        this.miles = miles;
    }

    /**
     * Creates a new RewardValue object given a cash value.
     * @param cash The cash value for the RewardValue to be initialized with.
     */
    public RewardValue(double cash) {
        miles = (int) (cash * (1/0.0035));
    }

    /**
     * @return the amount of miles the RewardValue is worth.
     */
    public int getMilesValue() {
        return miles;
    }

    /**
     * @return the cash value of the RewardValue, converted from miles.
     */
    public double getCashValue() {
        return 0.0035 * miles;
    }

}

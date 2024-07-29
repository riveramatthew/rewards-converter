public class RewardValue {

    private final double CONVERSION_RATE = 0.0035;

    private final double cash;
    private final int miles;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = convertCashToMiles(cash);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = convertMilesToCash(miles);
    }

    // returns cash value of RewardValue
    public double getCashValue() {
        return cash;
    }

    // returns # miles RewardValue is worth
    public int getMilesValue() {
        return miles;
    }

    /*
        Converts cash to miles, rounding to the nearest integer.
        Will convert negative values.
        Caution: cash values over 7,516,192.765 will overflow int.
     */
    private int convertCashToMiles(double cash) {
        return (int)Math.round(cash / CONVERSION_RATE);
    }

    /*
        Converts miles to cash. Does not round.
        Will convert negative values.
     */
    private double convertMilesToCash(int miles) {
        return miles * CONVERSION_RATE;
    }
}

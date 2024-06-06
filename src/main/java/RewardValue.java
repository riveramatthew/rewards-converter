public class RewardValue {
    private double cash;
    private double miles;
    private static final double CONV_RATE = 0.0035;

    // this constructor is to initialise with cash value
    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = convertCashToMiles(cash);
    }

    // this constructor is to initialise with miles value
    // to use miles to cash conversion specify true as second argument
    public RewardValue(double miles, boolean isMiles) {
        if (isMiles) {
            this.miles = miles;
            this.cash = convertMilesToCash(miles);
        }
    }

    // this is a method to convert cash to miles
    private double convertCashToMiles(double cash) {
        return cash / CONV_RATE;
    }

    // this is the method for converting miles to cash
    private double convertMilesToCash(double miles) {
        return miles * CONV_RATE;
    }

    // method to get cash value
    public double getCashValue() {
        return cash;
    }

    // method to get miles value
    public double getMilesValue() {
        return miles;
    }
}

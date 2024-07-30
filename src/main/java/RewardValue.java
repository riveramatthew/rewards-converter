
public class RewardValue {
    //cash field
    private double cashValue;
    //miles field
    private int milesValue;

    //conversion rate
    private static final double MILES_CONVERSION_RATE = 0.0035;

    //constructor
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_CONVERSION_RATE);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * MILES_CONVERSION_RATE;

    }

    // get cash value method
    public double getCashValue() {
        return cashValue;
    }

    //get miles value method

    public int getMilesValue() {
        return milesValue;
    }
}

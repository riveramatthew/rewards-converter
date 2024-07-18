public class RewardValue {
    public double cashValue;
    public double milesValue;
    public static final double conversionrate = 0.0035;

    public double getMilesValue() {
        return milesValue;

    }
    public double getCashValue() {
        return cashValue;
    }

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / conversionrate;
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * conversionrate; // converts miles to cash
    }

}

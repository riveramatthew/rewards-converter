public class RewardValue {
    private final double conversionRate = 0.0035;
    double cashValue;
    int milesValue;
    public RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = (int)(cash * conversionRate);
    }

    public RewardValue(int miles) {
        this.milesValue = miles;
        this.cashValue = Math.round(miles / conversionRate * 100) / 100.0;
    }

    int getMilesValue() {
       return this.milesValue;
    }

    double getCashValue() {
        return this.cashValue;
    }
}

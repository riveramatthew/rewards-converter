public class RewardValue {
    double cashValue;
    double milesValue;
    double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }
    public double getCashValue() {
        return milesValue*conversionRate;
    }
    public double getMilesValue() {
        return cashValue/conversionRate;
    }
}

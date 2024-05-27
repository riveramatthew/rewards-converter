public class RewardValue {
    double cashValue;
    int milesValue;
    static double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }
    public int cashToMiles(double cashValue) {
        return (int)(cashValue/conversionRate);
    }
    public double milesToCash(int milesValue) {
        return (milesValue*conversionRate);
    }
    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return milesValue;
    }
}

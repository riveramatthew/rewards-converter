public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashToMiles(cashValue);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return (int)milesValue;
    }

    private double cashToMiles(double cash) {
        return cash / 0.0035;
    }

    private double milesToCash(int miles) {
        return miles * 0.0035;
    }
}

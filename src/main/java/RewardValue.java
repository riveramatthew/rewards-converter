public class RewardValue {
    private double cash_value;
    private int miles_value;
    private static final double miles_to_cash_rate = 0.0035;
    private static final double cash_to_miles_rate = 1/0.0035;

    public RewardValue(double cashValue) {
        this.cash_value = cashValue;
    }

    public RewardValue(int milesValue) {
        this.miles_value = milesValue;
    }

    public double getCashValue() {
        return cash_value;
    }

    public double getMilesValue() {
        return miles_value;
    }

    public int cashToMiles(double cash_value) {
        this.cash_value = cash_value;
        this.miles_value = (int) (cash_value * cash_to_miles_rate);
        return this.miles_value;
    }

    public double milesToCash(int miles_value) {
        this.miles_value = miles_value;
        this.cash_value = miles_value * miles_to_cash_rate;
        return this.cash_value;
    }
}

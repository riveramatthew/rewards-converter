public class RewardValue {
    private double cash;
    private int miles;
    private final double conversionRate = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = cashToMiles();
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = milesToCash();
    }

    public double getCashValue() {
        return this.cash;
    }

    public int getMilesValue() {
        return this.miles;
    }

    private double milesToCash() {
        return this.miles * conversionRate;
    }

    private int cashToMiles() {
        return (int) (this.cash / conversionRate);
    }

}

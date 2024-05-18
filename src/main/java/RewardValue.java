public class RewardValue {
    private double cash;
    private double miles;
    private static final double milesToCashRate = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = convertCashToMiles(cash);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = convertMilesToCash(miles);
    }

    private double convertCashToMiles(double cash) {
        return cash / milesToCashRate;
    }

    private double convertMilesToCash(double miles) {
        return miles * milesToCashRate;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }
}

public class RewardValue {
    private double cash;
    private double miles;
    private double exchangeRateMilesToCash = 0.0035;

    RewardValue(double cash) {
        this.cash = cash;
        this.miles = cash / exchangeRateMilesToCash;
    }


    RewardValue(int miles) {
        this.cash = miles * exchangeRateMilesToCash;
        this.miles = miles;
    }

    public double getCashValue() {
        return cash;
    }

    public double getMilesValue() {
        return miles;
    }
}

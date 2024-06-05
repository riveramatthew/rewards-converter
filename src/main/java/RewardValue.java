public class RewardValue {

    private double cashValue;
    private double milesValue;

    private static double MilesToCashRate = 0.0035;


    public RewardValue(double cash) {
        this.cashValue = cash;
        this.milesValue = cash / MilesToCashRate;
    }

    public RewardValue(double miles, boolean isMiles) {
        this.cashValue = miles * MilesToCashRate;
        this.milesValue = miles;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}

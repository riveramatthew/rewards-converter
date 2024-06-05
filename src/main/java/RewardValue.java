public class RewardValue {

    private final double cashValue;

    private static final double MilesToCashRate = 0.0035;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = CovertToCash(milesValue);
    }

    private static double ConvertToMiles(double cashValue) {
        return (int) (cashValue/MilesToCashRate);
    }

    private static double CovertToCash(double milesValue) {
        return (milesValue * MilesToCashRate);
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return ConvertToMiles(this.cashValue);
    }


}

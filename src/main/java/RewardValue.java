public class RewardValue {
    public static double MilesToCash = 0.0035;
    public double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue){
        this.cashValue = convertMilesToCash(milesValue);
    }

    private static int convertCashToMiles(double cashValue) {
        return (int) (cashValue / MilesToCash);
    }
    private static double convertMilesToCash(int milesValue) {
        return milesValue * MilesToCash;
    }

    public double getCashValue() {
        return cashValue;
    }
    public int getMilesValue() {
        return convertCashToMiles(this.cashValue);
    }
}

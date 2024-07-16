public class RewardValue {
    double cashValue;
    int miles;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    private static double convertToCash(int miles) {
        return (miles * 0.0035);
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}
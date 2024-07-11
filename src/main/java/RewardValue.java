public class RewardValue {
    double cash;
    int miles;

    public RewardValue(double cashValue) {
        this.cash = cashValue;
    }

    public RewardValue(int milesValue) {
        this.miles = milesValue;
    }

    public static int convertToMiles(double cash) {
        return (int) (cash / 0.0035);
    }

    public static double convertToCash(int miles) {
        return (double) (miles * 0.0035);
    }

    public double getCashValue() {
        return convertToCash(miles);
    }

    public int getMilesValue() {
        return convertToMiles(cash);
    }
}

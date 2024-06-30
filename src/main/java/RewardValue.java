public class RewardValue {
    double cashValue;
    public static double CONVERSION_RATE = 0.0035;

    public RewardValue(double cash) {
        this.cashValue = cash;
    }

    public RewardValue(int miles) {
        this.cashValue = convertToCash(miles);
    }

    int convertToMiles(double cashValue) {
        return (int) (cashValue / CONVERSION_RATE);
    }

    double convertToCash(int miles) {
        return miles * CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}

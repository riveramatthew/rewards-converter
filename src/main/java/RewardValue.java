public class RewardValue {
    private double cashValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int convertCashToMiles(double cash) {
        return (int)(cashValue / 0.0035);
    }

    public double convertMilesToCash(int miles) {
        return miles * 0.0035;
    }

    public double getMilesValue() {
        return cashValue / 0.0035;
    }
}

public class RewardValue {
    private final double cashValue;
    public static final double conversionRate = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertMilesToCash(milesValue);
    }

    public int convertCashToMiles(double cashValue){
        return (int)(cashValue/conversionRate);
    }

    public double convertMilesToCash(int milesValue){
        return milesValue*conversionRate;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return convertCashToMiles(this.cashValue);
    }
}

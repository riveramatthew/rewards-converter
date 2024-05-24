public class RewardValue {
    private double cashValue;
    public static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = converttoCash(milesValue);
    }

    private static int converttoMiles(double cashValue) {
        return (int) (cashValue/CONVERSION_RATE);
    }

    private static double converttoCash(int milesValue) {
        return milesValue * CONVERSION_RATE;
    }

    public double getCashValue() {
        return cashValue;
    }
    
    public double getMilesValue() {
        return converttoMiles(this.cashValue);
    }
}
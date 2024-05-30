public class RewardValue {

    private final double cashValue;
    public static final double CONVERT_MILE_TO_CASH_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue= cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }

    private double convertToCash(int milesValue) {
        return milesValue * CONVERT_MILE_TO_CASH_RATE;
    }

    private int convertToMiles(double cashValue) {
        return (int) (cashValue / CONVERT_MILE_TO_CASH_RATE);
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }

    public double getCashValue(){
        return cashValue;
    }
}

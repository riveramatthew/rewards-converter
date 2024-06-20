
public class RewardValue {
	private final double cashValue;
    public static final double MILES_TO_CASH= 0.0035;
// This constructor accepts the cash as double
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }
// This constructor accepts the miles value as double
    public RewardValue(int milesValue) {
        this.cashValue = convertToCash(milesValue);
    }
//This method will convert into miles
    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH);
    }
// This methods will convert into miles
    private static double convertToCash(int milesaValue) {
        return milesaValue * MILES_TO_CASH;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return convertToMiles(this.cashValue);
    }
}

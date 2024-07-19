//RewardValue must convert from miles to cash at a rate of 0.0035.

public class RewardValue {

    private double cash;

    public RewardValue(double cashValue) {
        // TODO Auto-generated constructor stub
        cash = cashValue;
    }

    public RewardValue(int milesValue) {
        // TODO Auto-generated constructor stub
        cash = convertToCash(milesValue);
    }

    private static double convertToCash(int milesValue) {
        return milesValue * 0.0035;
    }

    private static int convertToMiles(double cashValue) {
        return (int) (cashValue / 0.0035);
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {

        return convertToMiles(cash);
    }

}

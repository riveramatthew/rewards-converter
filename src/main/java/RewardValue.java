public class RewardValue {
    private static final double MILES_TO_CASH = 0.0035;
    private double cashValue;
    private int milesValue;
    
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = (int) convertCashToMiles(milesValue);
    }

    public static double convertMilesToCash(int milesValue) {
        return milesValue * MILES_TO_CASH;
    }

    public static double convertCashToMiles(double cashValue) {
        return cashValue / MILES_TO_CASH;
    }

    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return convertCashToMiles(cashValue);
    }
}

public class RewardValue {
    
    public static final double MILES_TO_CASH_RATE = 0.0035;
    private double cashValue;
    private int milesValue;
    
    RewardValue(double cash) {
        cashValue = cash;
        milesValue = convertCashToMiles(cashValue);
    }


    RewardValue(int miles) {
            milesValue = miles;
            cashValue = convertMilesToCash(milesValue);
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    private int convertCashToMiles(double cash) {
        return (int)(cash / MILES_TO_CASH_RATE);
    }

    private double convertMilesToCash(int miles) {
        return miles * MILES_TO_CASH_RATE;
    }
}

public class RewardValue {
    
    private static final double MILES_TO_CASH_RATE = 0.0035;
    private double cashValue;
    private double milesValue;
    
    RewardValue(double cash) {
        cashValue = cash;
        milesValue = cashValue / MILES_TO_CASH_RATE;
    }


    RewardValue(double miles, boolean isMiles) {
        if (isMiles) {
            milesValue = miles;
            cashValue = milesValue * MILES_TO_CASH_RATE;
        } else {
            throw new IllegalArgumentException("Use the other constructor for cash conversion");
        }
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}

public class RewardValue {
    private double cashValue;
    private double milesValue;

    private static final double MILES_CONVERSION_RATE = 0.01; 

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / MILES_CONVERSION_RATE;
    }

    
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * MILES_CONVERSION_RATE;
        }
    }

   
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public void convertCashToMiles(double cash) {
        this.cashValue = cash;
        this.milesValue = cash / MILES_CONVERSION_RATE;
    }

    public void convertMilesToCash(double miles) {
        this.milesValue = miles;
        this.cashValue = miles * MILES_CONVERSION_RATE;
    }
}

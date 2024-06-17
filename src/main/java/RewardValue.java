public class RewardValue {
    private  double cashValue = 0.0;
    private  double milesValue=0.0;
    private final double miles_to_cash_rate=0.0035;
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.milesValue=cashValue/miles_to_cash_rate;
    }
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * miles_to_cash_rate;
        } else {
            this.cashValue = milesValue;
            this.milesValue = milesValue / miles_to_cash_rate;
        }
    }


    public double getCashValue() {
        return cashValue;
    }
    public double getMilesValue() {
        return milesValue;
    }
}

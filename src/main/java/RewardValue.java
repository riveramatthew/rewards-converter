public class RewardValue {
    private double cash_value;
    private double miles_value;
    private static final double MILES_TO_CASH_RATE= 0.0035;
    public RewardValue(double cash_value) {
        this.cash_value = cash_value;
        this.miles_value = cash_value / MILES_TO_CASH_RATE;
    }
    public RewardValue(double miles_value, boolean isMiles)
    {
        if(isMiles){
            this.miles_value = miles_value;
            this.cash_value = miles_value * MILES_TO_CASH_RATE;}
        else{
            this.miles_value = miles_value;
            this.cash_value = miles_value / MILES_TO_CASH_RATE;}
    }
   public double getCashValue() {
        return cash_value;
   }
   public double getMilesValue() {
        return miles_value;
   }
}


public class RewardValue {
    private int miles;
    private double cash;
    private static double miles_to_cash_rate=0.0035;
    // Constructor to receive miles value.
    public RewardValue(int miles){
        this.miles=miles;
        this.cash=miles*miles_to_cash_rate; // Convert miles to cash
    }
    // Constructor to receive cash value.
    public RewardValue(double cash){
        this.miles=(int)(cash/miles_to_cash_rate); // Convert cash to miles
        this.cash=cash;
    }
    // Return Cash value.
    public double getCashValue(){
        return cash;
    }
    // Return Miles value.
    public int getMilesValue(){
        return miles;
    }

}

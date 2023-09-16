public class RewardValue {
    double cash;
    private static final double M_TO_CASH_RATE = 0.0035;
    private double MilesToCash(int miles){
        return miles * M_TO_CASH_RATE;
    }
    private int CashToMiles(double cash){
        return (int)(cash / M_TO_CASH_RATE);
    }
    public RewardValue(double cash){
        this.cash = cash;
    }
    public RewardValue(int miles){
        this.cash = this.MilesToCash(miles);
    }
    public double getCashValue(){
        return this.cash;
    }
    public int getMilesValue(){
        return CashToMiles(this.cash);
    }
}

public class RewardValue {
    private double cashValue;
    private double milesValue;
    private static final double conversionRate=0.0035;
    public RewardValue(double cash)
    {
        this.cashValue=cash;   
        this.milesValue=cash/conversionRate;
    }
    public RewardValue(int miles)
    {
        this.milesValue=miles;
        this.cashValue=milesValue*conversionRate;
    }
    public double getMilesValue()
    {
        return milesValue;
    }
    public double getCashValue()
    {
        return cashValue;
    }
}

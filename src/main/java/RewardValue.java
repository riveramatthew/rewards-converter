public class RewardValue
{
    public static double cashValue;
    public static int milesValue;
    RewardValue(double cashValue)
    {
        this.cashValue=cashValue;
    }
    RewardValue(int milesValue)
    {
        this.cashValue=conversion_cash(milesValue);
    }
    public static int conversion_miles(double cashValue)
    {
        return (int)(cashValue/0.0035);
    }
    public static double conversion_cash(int milesValue)
    {
        return(milesValue*0.0035);
    }
    public double getCashValue()
    {
        return cashValue;
    }
    public int getMilesValue()
    {
        return conversion_miles(this.cashValue);
    }
}


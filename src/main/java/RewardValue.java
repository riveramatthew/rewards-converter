public class RewardValue
{
    public static double cashVal;
    public static int miles;
    RewardValue(double cashValue)
    {
        cashVal=cashValue;
    }
    RewardValue(int milesValue)
    {
        miles=milesValue;
    }
    public double getCashValue()
    {
        cashVal=(0.0035)*(double)miles;
        return cashVal;
    }
    public int getMilesValue()
    {
        miles=(int)(cashVal/0.0035);
        return miles;
    }
}


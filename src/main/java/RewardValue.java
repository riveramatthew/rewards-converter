public class RewardValue {
    static double cashValue;
    static int milesValue;
    RewardValue()
    {
        cashValue=0;
        milesValue=0;
    }
    RewardValue(double data)
    {
        milesValue= (int)(data/0.0035);
        cashValue=data;
    }
    RewardValue(int data)
    {
        cashValue=data*0.0035;
        milesValue=data;
    }
    public static double getCashValue()
    {
        return cashValue;
    }
    public static double getMilesValue()
    {
        return milesValue;
    }

}

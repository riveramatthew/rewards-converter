public class RewardValue {

    double cash;
    int miles;

    public RewardValue(double cashValue)
    {
        cash = cashValue;
        miles = (int) (cashValue / .0035);
    }

    public RewardValue(int mileValue)
    {
        miles = mileValue;
        cash = mileValue * .0035;
    }

    public double getCashValue()
    {
        return cash;
    }

    public int getMilesValue()
    {
        return miles;
    }
}

public class RewardValue {
    /*
    * Requirements:
    *   two constructors: one accepts a cash value, one accepts a value in miles
    *   getCashValue() returns cash value of the RewardValue
    *   getMilesValue() returns how many miles the RewardValue is worth
    *   RewardValue converts from miles to cash at a rate of 0.0035
    *
    * */

    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
        this.milesValue = (int)(cashValue/0.0035);
    }

    public RewardValue(int milesValue)
    {
        this.milesValue = milesValue;
        this.cashValue = (double)(milesValue*0.0035);
    }

    public double getCashValue()
    {
        return cashValue;
    }

    public int getMilesValue()
    {
        return milesValue;
    }
}

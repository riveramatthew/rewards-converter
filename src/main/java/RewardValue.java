public class RewardValue
{
    //Attributes
    private double cashValue;
    private int milesValue;

    private static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue)
    {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    public RewardValue(int miles)
    {
        this.milesValue = miles;
        this.cashValue = convertToCash(milesValue);
    }

    private int convertToMiles(double cashValue)
    {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    private double convertToCash(int milesValue)
    {
        return milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public double getCashValue()
    {
        return cashValue;
    }

    public double getMilesValue()
    {
        return milesValue;

    }
}

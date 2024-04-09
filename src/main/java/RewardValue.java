public class RewardValue
{
    private double CashValue;
    private float Arline_Miles;

    public RewardValue(double CashValue)
    {
        this.CashValue = CashValue;
        // converting cash to miles
        convert_from_cash_to_miles();
    }

    public RewardValue(float Air_miles)
    {
        this.Arline_Miles = Air_miles;
        // converting miles to cash
        convert_from_miles_to_cash();
    }

    public float getMilesValue()
    {
        return this.Arline_Miles;
    }

    public double getCashValue()
    {
        return this.CashValue;
    }

    public void convert_from_cash_to_miles()
    {
        this.Arline_Miles = (float)(this.CashValue / 0.0035);
    }

    public void convert_from_miles_to_cash()
    {
        this.CashValue = this.Arline_Miles*0.0035;
    }
}
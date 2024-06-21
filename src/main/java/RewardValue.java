public class RewardValue {
    private double cashValue;
    private int milesValue;
    public static double miles_to_cash_rate = 0.0035;
    // 1 Miles = 0.0035 Cash
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / miles_to_cash_rate);

    }
    public RewardValue(int milesValue){
        this.milesValue= milesValue;
        this.cashValue = milesValue* miles_to_cash_rate;
    }

    public double getCashValue()    {

        return cashValue;
    }
    public int getMilesValue()
    {
        return milesValue;
    }


}

public class RewardValue {
    private double cashValue;
    private double milesValue;
    private double miles2cashRate = 0.0035;

//  constructor that accepts in miles
   public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }

    //constructor that accepts in cash

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }


    public double getCashValue()
    {
        return cashValue;
    }
   public double getMilesValue()
    {
        milesValue = cashValue/miles2cashRate;
        return milesValue;
    }

}

public class RewardValue {
    private double cashValue;
    private double milesValue;
    private double miles2cashRate = 0.0035;

//  constructor that accepts in miles
   public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * miles2cashRate;
    }

    //constructor that accepts in cash

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue/miles2cashRate;
    }


    public double getCashValue()
    {
        return cashValue;
    }
   public double getMilesValue() {
       return milesValue;
    }

}

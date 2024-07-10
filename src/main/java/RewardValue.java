public class RewardValue {
    private double cashValue=0;
    private double milesValue=0;
    public static final double cashValueToMiles = 0.0035;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue){
        this.milesValue= milesValue;
    }
    public double getMilesValue(){
        if(cashValue!=0)
            milesValue = cashValue/cashValueToMiles;
        return milesValue;
    }
    public double getCashValue(){
        if(milesValue!=0)
            cashValue = milesValue*cashValueToMiles;
        return cashValue;
    }
}

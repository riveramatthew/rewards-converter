public class RewardValue {
    private double cashValue=0;
    private double milesValue=0;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue){
        this.milesValue= milesValue;
    }
    public double getMilesValue(){
        if(cashValue!=0)
            milesValue = cashValue/0.0035;
        return milesValue;
    }
    public double getCashValue(){
        if(milesValue!=0)
            cashValue = milesValue*0.0035;
        return cashValue;
    }
}

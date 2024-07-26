public class RewardValue {
    private double cashValue;
    private int milesValue;
    public static final double milesToCash = 0.0035;
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.milesValue=(int) (cashValue/milesToCash);
    }
    public RewardValue(int milesValue){
        this.milesValue=milesValue;
        this.cashValue=milesValue*milesToCash  ;
    }
    public double getCashValue(){
        return this.cashValue;
    }
    public double getMilesValue(){
        return this.milesValue;

    }
}

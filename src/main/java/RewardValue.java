public class RewardValue {
    private double cashValue;
    private int miles;
    public static final double milesToCash = 0.0035;
    public RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.miles=(int) (cashValue/milesToCash);
    }
    public RewardValue(int miles){
        this.miles=miles;
        this.cashValue=miles*milesToCash  ;
    }
    public double getCashValue(){
        return this.cashValue;
    }
    public double getMilesValue(){
        return this.miles;

    }
}

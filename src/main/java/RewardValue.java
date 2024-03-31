
public class RewardValue {
    private double cashValue;
    private int milesValue;
    RewardValue(double cashValue){
        this.cashValue=cashValue;
        this.milesValue=(int)(cashValue/0.0035);
    }
    RewardValue(int milesValue){
        this.milesValue=milesValue;
        this.cashValue=milesValue*0.0035;
    }
    public double getCashValue(){
        return cashValue;
    }
    public int getMilesValue(){
        return milesValue;
    }
}

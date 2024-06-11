public class RewardValue{
    double cashValue;
    int milesValue;
    public RewardValue(double cashValue){
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue){
        this.milesValue=milesValue;
    }
    public double getCashValue(){
        cashValue = (double)(milesValue*0.0035);
        return cashValue;
    }
    public int getMilesValue(){
        milesValue = (int)(cashValue/0.0035);
        return milesValue;
    }

}
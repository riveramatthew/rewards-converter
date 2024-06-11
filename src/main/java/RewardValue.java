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
        if (milesValue==0 && cashValue!=0){
            return cashValue;
        }
        cashValue = (double)(milesValue*0.0035);
        return cashValue;
    }
    public int getMilesValue(){
        if (cashValue==0 && milesValue!=0){
            return milesValue;
        }
        milesValue = (int)(cashValue/0.0035);
        return milesValue;
    }

}
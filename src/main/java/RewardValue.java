public class RewardValue {
    double cashValue;
    int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue=cashValue;
        this.milesValue= (int) (this.cashValue/0.0035);
    }

    public RewardValue(int milesValue){
        this.milesValue=milesValue;
        this.cashValue= this.milesValue*0.0035;
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return this.milesValue;
    }
}

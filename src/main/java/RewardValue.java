public class RewardValue {
    private double cashVal;
    private double milesVal;
    public RewardValue(double cashVal){
        this.cashValue = cashValue;
        this.milesValue = cashValue * 0.0035;
    }
    public RewardValue(int milesVal){
        this.milesValue = milesValue;
        this.cashValue = milesValue / 0.0035;
    }
    public double getCashValue(){
        return cashVal;
    }

    public double getMilesValue(){
        return milesVal;
    }

}

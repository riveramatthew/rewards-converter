public class rewardValue {
    double cashValue;
    double milesValue;

    public rewardValue(double cashValue){
        this.cashValue = cashValue;
        this.cashValue = Math.round(milesValue * 0.0035);
    }

    public rewardValue(int milesValue){
        this.milesValue = milesValue;
        this.milesValue = Math.round(cashValue / 0.0035);
    }

    public double getCashValue(){
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }

    
}

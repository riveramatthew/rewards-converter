public class RewardValue {
    double cashValue;
    int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue/0.0035);
    }
    public RewardValue(int milesValue){
        this.milesValue=milesValue;
        this.cashValue=0.0035*milesValue;
    }
    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}

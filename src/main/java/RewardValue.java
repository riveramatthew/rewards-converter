public class RewardValue {
    private final double cashvalue;

    RewardValue(double cashvalue){
        this.cashvalue=cashvalue;
    }
    RewardValue(int milesvalue){
        this.cashvalue=milesvalue*0.0035;
    }
    public double getCashValue() {
        return this.cashvalue;
    }

    public double getMilesValue() {
        return this.cashvalue/0.0035;
    }
}

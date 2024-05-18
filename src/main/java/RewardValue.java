public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
    }
    public double getCashValue(){
        return this.milesValue * 0.0035;
    }

    public int getMilesValue() {
        return (int) (this.cashValue/0.0035);
    }
}

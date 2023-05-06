public class RewardValue {


    private final double cashValue;
    private final int milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int)(cashValue / 0.0035);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = (double)milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }
}

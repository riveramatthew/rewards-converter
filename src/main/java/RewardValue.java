public class RewardValue {
    private double cashV;
    private double milesV;

    public RewardValue(double cashValue) {
        this.cashV = cashValue;
    }
    public RewardValue(int milesValue) {
        this.milesV = milesValue;

    }

    public double getMilesValue() {
        milesV = cashV * 0.0035;
        return milesV;
    }
    public double getCashValue() {
        return cashV;
    }

}

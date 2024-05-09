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
        if (milesV == 0) {
            milesV = cashV * 0.0035;
        }
        return milesV;
    }
    public double getCashValue() {
        if (cashV == 0) {
            cashV = milesV / 0.0035;
        }
        return cashV;
    }

}

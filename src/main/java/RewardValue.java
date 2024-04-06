public class RewardValue {
    private double cashvalue;
    private final double milesvalue;
    public RewardValue(double cashvalue) {
        this.cashvalue = cashvalue;
        this.milesvalue = cashvalue/-1;
    }
    public RewardValue(int milesvalue) {
        this.milesvalue = milesvalue;
        this.cashvalue = cashvalue*-1;

    }

    public double getCashValue() {

        return cashvalue;
    }

    public double getMilesValue() {

        return milesvalue;
    }
}



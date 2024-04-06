public class RewardValue {
    private double cashvalue;
    private double milesvalue;
    public RewardValue(double cashvalue) {
        this.cashvalue = cashvalue;
        this.milesvalue = cashvalue/0.0035;
       }
public RewardValue(int milesvalue) {
        this.milesvalue = milesvalue;
        this.cashvalue = cashvalue*0.0035;

    }

    public double getCashValue() {

        return cashvalue;
    }

    public double getMilesValue() {

        return milesvalue;
    }
}



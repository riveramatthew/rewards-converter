public class RewardValue {
     double cashValue;
     double milesValue;
     double rate = 0.0035;


    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / rate;
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * rate;
    }

    public double getCashValue() {
        return this.cashValue;
    }


    public double getMilesValue() {
        return this.milesValue;
    }
}

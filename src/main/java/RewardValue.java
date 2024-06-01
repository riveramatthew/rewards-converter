public class RewardValue {

    final double cashValue;
     double milesValue;

    public RewardValue(double cashValue){
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

   /* public RewardValue(double milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    } */

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}

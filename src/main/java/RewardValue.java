public class RewardValue {
    double cashValue;
    final double CONVERT_RATIO  = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue=cashValue;
    }

    public RewardValue(int milesValue){
        this.cashValue= convertMilestoCash(milesValue);
    }

    public double getCashValue() {
        return this.cashValue;
    }

    public int getMilesValue() {
        return convertCashtoMiles(this.cashValue);
    }

    private int convertCashtoMiles(double cashValue){
        return (int) (cashValue/CONVERT_RATIO);
    }

    private double convertMilestoCash(int milesValues){
        return milesValues*CONVERT_RATIO;
    }
}

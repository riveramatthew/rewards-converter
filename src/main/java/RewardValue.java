public class RewardValue {
    double cashValue;
    int milesValue;

    public RewardValue(double theCashValue) {
        this.cashValue = theCashValue;
    }

    public RewardValue(int theMilesValue) {
        this.milesValue = theMilesValue;
    }

    public double getCashValue(){
        return this.cashValue;
    }

    public double getMilesValue() {
        return this.milesValue;
    }

    private int convertCash(double cashValue){
        return 1;
    }

    private double convertMiles(int milesValue){
        return 1;
    }
}

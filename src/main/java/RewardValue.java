public class RewardValue {
    
    private double cashValue;
    private double miles;
    
    public RewardValue(double cash) {
        this.cashValue = cash;
        this.miles = cash / 0.0035;
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cashValue = miles * 0.0035;
    }

    double getCashValue() {
        return cashValue;
    }
    
    double getMilesValue() {
        return miles;
    }

}

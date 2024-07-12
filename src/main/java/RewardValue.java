public class RewardValue {
    private double cash;
    private double miles;
    private double rewards;
    public RewardValue(double cash){
        this.cash = cash;
    }

    public double getCash() {
        return cash;
    }

    public double getMilesValue() {
        miles = this.getCash()*0.0035;
        return miles;
    }
}
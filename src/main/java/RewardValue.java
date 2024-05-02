public class RewardValue {

    double cash;

    public RewardValue(double cash) {
        this.cash = cash;
    }
    public RewardValue(int milesValue)
    {
        this.cash = convertToCash(milesValue);
    }
    public double convertToCash(double milesValue)
    {
        return milesValue * 0.0035;
    }
    public double convertToMiles(double cash)
    {
        return (int) (cash / 0.0035);
    }
    public double getCashValue() {
        return cash;
    }
    public double getMilesValue() {
        return convertToMiles(this.cash);
    }
}

public class RewardValue {

    double cash;
    int miles;

    public RewardValue(double cash) {
        this.cash = cash;
        convertCashToMiles(cash);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        convertMilesToCash(miles);
    }

    private void convertCashToMiles(double cash) {
        miles = (int)Math.round(cash / 0.0035);
    }

    private void convertMilesToCash(int miles) {
        cash = miles * 0.0035;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
    
}



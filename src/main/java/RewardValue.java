public class RewardValue {
    private double cash;
//    private int miles;
    static final double rate = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
    }

    public RewardValue(int miles) {
        this.cash = convertToCash(miles);
    }

    private int convertToMiles(double cash) {
        return (int)(cash / rate);
    }

    private double convertToCash(int miles) {
        return miles * rate;
    }

    public double getCashValue() {
//        cash = miles * rate;
        return cash;
    }

    public int getMilesValue() {
//        miles = (int)(cash / rate);
        return convertToMiles(cash);
    }
}

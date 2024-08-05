public class RewardValue {
    final static double milesToCash = 0.0035;
    double cash;

    public RewardValue(double cash) {
        this.cash = cash;
    }   

    public RewardValue(int miles) {
        this.cash = convertToCash(miles);
    }

    private static int convertToMiles(double cash) {
        return (int) (cash/milesToCash);
    }

    private static double convertToCash(int miles) {
        return miles * milesToCash;
    }
    public double getCashValue() {
        return this.cash;
    }

    public double getMilesValue() {
        return convertToMiles(this.cash);
    }

}

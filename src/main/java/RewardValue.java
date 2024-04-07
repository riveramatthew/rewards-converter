public class RewardValue {
    public static final double converionrate = 0.0035d;
    private double cash;

    RewardValue(double cash) {
        this.cash = cash;

    }
    RewardValue(int miles) {;
        cash=convertToCash(miles);
    }
    private double convertToCash(int miles) {
        return miles*converionrate;
    }

    double getCashValue(){
        return cash;
    }
    int getMilesValue(){
        return  (int)( cash / converionrate);
    }

}

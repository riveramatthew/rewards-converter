public class RewardValue {
    private double cash;
    private int miles;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double c) {
        cash = c;
        miles = (int)(c / MILES_TO_CASH_CONVERSION_RATE);
    }
    public RewardValue(int m){
        miles = m;
        cash = m * MILES_TO_CASH_CONVERSION_RATE;
    }
    public double getCashValue(){
        return cash;
    }
    public int getMilesValue(){
        return miles;
    }


}

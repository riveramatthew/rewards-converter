public class RewardValue {

    private final double cashValue;
//    private final int milesValue;
    public static final double CONVERSION_VALUE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue =  miles_to_cash(milesValue);
    }

    double getCashValue(){
        return cashValue;
    }

    int getMilesValue(){
        return (int) cash_to_miles(cashValue);
    }

    //conversion

    private static int cash_to_miles(double cash) {
        return (int) (cash / CONVERSION_VALUE);
    }

    private static double miles_to_cash(double cash) {
        return cash * CONVERSION_VALUE;
    }
}

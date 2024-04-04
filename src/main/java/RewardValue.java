public class RewardValue {
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;
    private final double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = milesValue * cashValue;
    }

    public double getCashValue() {
        try{
            return cashValue + milesValue * 0.0035;
        }
        catch (NullPointerException e) {
            return 0;
        }
    }
    public double getMilesValue() {
        try {
            return cashValue + milesValue * (1/0.0035);
        }
        catch (NullPointerException e){
            return 0;
        }
    }
}
